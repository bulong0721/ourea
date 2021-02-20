package io.ourea.storage.service.impl;

import io.ourea.naming.core.Database;
import io.ourea.storage.service.DatabaseLoader;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/18
 */
public class DatabaseLoaderImpl implements DatabaseLoader {
    private final Database database;

    public DatabaseLoaderImpl(Database database) {
        this.database = database;
    }

    @Override
    public Database database() {
        return database;
    }

    @Override
    public void loading(Database database) throws Exception {

    }
}
