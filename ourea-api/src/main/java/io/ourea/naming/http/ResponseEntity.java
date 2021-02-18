package io.ourea.naming.http;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 徐步龙
 * @version V1.0 created at: 2018/10/15
 */
@Data
@NoArgsConstructor
public class ResponseEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    protected int status = StatusCode.OK.getCode();
    protected String message = null;
    protected T data;

    public boolean success() {
        return status == StatusCode.OK.getCode();
    }

    public static <E> ResponseEntity<E> cloneAndSwap(ResponseEntity entity, E data) {
        ResponseEntity<E> result = new ResponseEntity<>();
        result.status = entity.status;
        result.message = entity.message;
        result.setData(data);
        return result;
    }
}
