package io.ourea.naming.listener;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/5
 */
public interface EventListener<E extends Event> {

    /**
     * 事件处理
     *
     * @param event
     */
    void onEvent(E event);
}
