package io.ourea.dubbo.registry;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.registry.NotifyListener;
import com.alibaba.dubbo.registry.support.FailbackRegistry;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/18
 */
public class OureaRegistry extends FailbackRegistry {
    public OureaRegistry(URL url) {
        super(url);
    }

    @Override
    protected void doRegister(URL url) {

    }

    @Override
    protected void doUnregister(URL url) {

    }

    @Override
    protected void doSubscribe(URL url, NotifyListener notifyListener) {

    }

    @Override
    protected void doUnsubscribe(URL url, NotifyListener notifyListener) {

    }

    @Override
    public boolean isAvailable() {
        return false;
    }
}
