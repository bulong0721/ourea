package io.ourea.naming.pojo;

import io.ourea.naming.Entry;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/1/25
 */
@Data
@EqualsAndHashCode(of = {"serviceName", "ip", "port"})
public class Instance extends AbstractEntry<Instance> implements Entry {
    private String ip;
    private int port;
    private String serviceName;

    @Override
    public Type entryType() {
        return Type.INSTANCE;
    }

    @Override
    protected void doMerge(Instance entry) {
        this.serviceName = entry.serviceName;
        this.ip = entry.ip;
        this.port = entry.port;
        this.metadata = entry.metadata;
    }
}
