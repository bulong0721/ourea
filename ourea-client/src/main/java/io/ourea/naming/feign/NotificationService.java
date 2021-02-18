package io.ourea.naming.feign;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import io.ourea.naming.vo.NoticeVO;

import java.util.List;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/17
 */
public interface NotificationService {

    @RequestLine("POST /notification/v1/{clientId}")
    @Headers("Content-Type: application/json")
    List<NoticeVO> longPolling(@Param("clientId") String clientId, List<NoticeVO> noticeVOS);
}
