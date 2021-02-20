package io.ourea.dubbo.registry;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.registry.Registry;
import com.alibaba.dubbo.registry.support.AbstractRegistryFactory;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/18
 */
public class OureaRegistryFactory extends AbstractRegistryFactory {

    @Override
    protected Registry createRegistry(URL url) {
        return null;
    }
}
