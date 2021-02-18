package io.ourea.naming.listener;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/1/28
 */
public interface EventListener<E extends Event> {

    void onEvent(E event);
}
