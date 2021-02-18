package io.ourea.naming;

import java.io.Serializable;
import java.util.Map;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/2
 */
public interface Entry extends Serializable, Comparable<Entry> {
    enum Type {
        SERVICE,
        INSTANCE,
        SESSION;
    }

    Type entryType();

    Map<String, String> getMetadata();

    Signature getSignature();

    default void signByServer(String serverId) {
        getSignature().signByServer(serverId);
    }

    default void signByClient(String clientId) {
        getSignature().signByClient(clientId);
    }

    default void touch() {
        getSignature().touch();
    }
}
