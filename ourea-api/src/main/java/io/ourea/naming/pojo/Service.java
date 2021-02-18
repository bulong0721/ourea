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
@EqualsAndHashCode(of = {"name"})
public class Service extends AbstractEntry<Service> implements Entry {
    private String name;

    @Override
    public Type entryType() {
        return Type.SERVICE;
    }

    @Override
    protected void doMerge(Service entry) {
        this.name = entry.name;
    }
}
