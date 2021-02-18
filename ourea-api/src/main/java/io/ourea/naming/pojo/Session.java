package io.ourea.naming.pojo;

import io.ourea.naming.Entry;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/2
 */
public class Session extends AbstractEntry<Session> implements Entry {

    @Override
    public Type entryType() {
        return Type.SESSION;
    }

    @Override
    protected void doMerge(Session entry) {

    }
}
