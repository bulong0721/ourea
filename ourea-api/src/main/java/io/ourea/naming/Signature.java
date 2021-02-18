package io.ourea.naming;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/2
 */
@Data
@EqualsAndHashCode(exclude = "timestamp")
public class Signature implements Serializable {
    private String serverId;
    private String clientId;
    private long timestamp;

    public void signByServer(String serverId) {
        this.serverId = serverId;
    }

    public void signByClient(String clientId) {
        this.clientId = clientId;
    }

    public void touch() {
        this.timestamp = System.currentTimeMillis();
    }
}
