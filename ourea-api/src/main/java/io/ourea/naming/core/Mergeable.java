package io.ourea.naming.core;

import io.ourea.naming.Entry;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/3
 */
public interface Mergeable<E extends Entry> {

    boolean merge(E entry);
}
