package io.ourea.naming.web.wrapper;

import org.springframework.web.context.request.async.DeferredResult;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/8
 */
public class DeferredResultWrapper<T> implements Comparable<DeferredResultWrapper> {
    private DeferredResult<T> deferredResult;

    public DeferredResultWrapper(long timeoutInMilli, T defaultResult) {
        deferredResult = new DeferredResult<>(timeoutInMilli, defaultResult);
    }

    public void onTimeout(Runnable timeoutCallback) {
        deferredResult.onTimeout(timeoutCallback);
    }

    public void onCompletion(Runnable completionCallback) {
        deferredResult.onCompletion(completionCallback);
    }

    public void complete(T result) {
        deferredResult.setResult(result);
    }

    public DeferredResult<T> getDeferredResult() {
        return deferredResult;
    }

    @Override
    public int compareTo(DeferredResultWrapper that) {
        return Integer.compare(this.hashCode(), that.hashCode());
    }
}
