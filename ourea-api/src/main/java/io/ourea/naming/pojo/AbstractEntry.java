package io.ourea.naming.pojo;

import io.ourea.naming.Entry;
import io.ourea.naming.Signature;
import io.ourea.naming.core.Mergeable;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/2
 */
@Data
public abstract class AbstractEntry<E extends Entry> implements Entry, Mergeable<E> {
    protected Map<String, String> metadata = new HashMap<String, String>();
    protected final Signature signature = new Signature();

    @Override
    public int compareTo(Entry that) {
        return Long.compare(signature.getTimestamp(), that.getSignature().getTimestamp());
    }

    @Override
    public boolean merge(E entry) {
        Signature from = entry.getSignature();
        Signature to = this.getSignature();
        if (null != from || null == to || from.getTimestamp() > to.getTimestamp()) {
            doMerge(entry);
            return true;
        }
        return false;
    }

    protected abstract void doMerge(E entry);
}
