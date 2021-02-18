package io.ourea.naming.exception;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/1/25
 */
public class NamingException extends RuntimeException {

    public NamingException() {
    }

    public NamingException(String message) {
        super(message);
    }

    public NamingException(Throwable cause) {
        super(cause);
    }
}
