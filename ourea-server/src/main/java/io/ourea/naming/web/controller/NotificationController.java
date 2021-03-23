package io.ourea.naming.web.controller;

import io.ourea.naming.core.Database;
import io.ourea.naming.core.NamingServer;
import io.ourea.naming.core.NoticeHandler;
import io.ourea.naming.pojo.Heartbeat;
import io.ourea.naming.pojo.Instance;
import io.ourea.naming.pojo.Session;
import io.ourea.naming.vo.NoticeVO;
import io.ourea.naming.web.wrapper.DeferredResultWrapper;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.collections.impl.multimap.set.UnifiedSetMultimap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.*;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/8
 */
@Slf4j
@RestController
@RequestMapping("/notification")
public class NotificationController implements NoticeHandler {
    private static final List<NoticeVO> EMPTY_LIST = new ArrayList<>();
    @Autowired
    private Database database;
    @Lazy
    @Autowired
    private NamingServer namingServer;
    private final UnifiedSetMultimap<String, DeferredResultWrapper> deferredResults = UnifiedSetMultimap.newMultimap();

    public Session ping(String clientId) {
        Heartbeat heartbeat = new Heartbeat();
        heartbeat.setClientId(clientId);
        return namingServer.ping(heartbeat);
    }

    @PostMapping("/v1/{clientId}")
    public DeferredResult<List<NoticeVO>> longPolling(@PathVariable("clientId") String clientId, @RequestBody ArrayList<NoticeVO> notices) {
        this.ping(clientId);
        DeferredResultWrapper wrapper = new DeferredResultWrapper(55000, EMPTY_LIST);

        Map<String, Long> serviceMap = database.services();
        List<NoticeVO> noticeVOS = new ArrayList<>();
        for (NoticeVO notice : notices) {
            String serviceName = notice.getServiceName();
            Long version = serviceMap.get(serviceName);
            if (null != version && version > notice.getTimestamp()) {
                Set<Instance> instances = database.lookup(serviceName, true);
                notice.setInstances(instances);
                notice.setTimestamp(version);
                noticeVOS.add(notice);
            }
        }
        if (!noticeVOS.isEmpty()) {
            wrapper.complete(noticeVOS);
            return wrapper.getDeferredResult();
        }

        wrapper.onCompletion(() -> {
            for (NoticeVO notice : notices) {
                String serviceName = notice.getServiceName();
                deferredResults.remove(serviceName, wrapper);
            }
        });

        for (NoticeVO notice : notices) {
            String serviceName = notice.getServiceName();
            deferredResults.put(serviceName, wrapper);
        }

        return wrapper.getDeferredResult();
    }

    @Override
    public void notifyRegister(Instance instance) {
        NoticeVO noticeVO = new NoticeVO();
        String serviceName = instance.getServiceName();
        Set<Instance> instances = database.lookup(serviceName, true);
        Long timestamp = database.services().get(serviceName);
        noticeVO.setServiceName(serviceName);
        noticeVO.setInstances(instances);
        noticeVO.setTimestamp(timestamp);

        List<NoticeVO> noticeVOS = Arrays.asList(noticeVO);
        deferredResults.forEachKeyValue((key, wrapper) -> {
            wrapper.complete(noticeVOS);
        });
    }

    @Override
    public void notifyUnregister(Instance instance) {
        notifyRegister(instance);
    }

    @Override
    public void notifyHeartbeat(Session session) {
        // do nothing
    }
}
