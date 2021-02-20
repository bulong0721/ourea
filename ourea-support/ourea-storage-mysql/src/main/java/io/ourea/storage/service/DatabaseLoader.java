package io.ourea.storage.service;

import io.ourea.naming.core.Database;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/18
 */
public interface DatabaseLoader extends InitializingBean {

    Database database();

    @Override
    default void afterPropertiesSet() throws Exception {
        loading(database());
    }

    void loading(Database database) throws Exception;
}
