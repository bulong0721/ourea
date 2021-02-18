package io.ourea.naming.http;

import lombok.Data;
import lombok.ToString;

import java.util.Collection;

/**
 * @author 徐步龙
 * @version V1.0
 * @date 2018/10/15
 */
@Data
@ToString(callSuper = true)
public class PageableEntity<T> extends ResponseEntity<Collection<T>> {
    private static final long serialVersionUID = 1L;
    private long total;
    private int page;
    private int size;

    /**
     * @param list
     * @param page
     * @param total
     */
    public PageableEntity(Collection<T> list, Pager page, long total) {
        this.data = list;
        if (null != page) {
            this.page = page.getPageIndex();
            this.size = page.getPageSize();
        }
        this.total = total;
    }

    /**
     * @param list
     * @param page
     * @param size
     * @param total
     */
    public PageableEntity(Collection<T> list, int page, int size, long total) {
        this.total = total;
        this.page = page;
        this.size = size;
        this.data = list;
    }

    public static <E> PageableEntity<E> cloneAndSwap(PageableEntity entity, Collection<E> list) {
        PageableEntity<E> result = new PageableEntity<E>(list, entity.page, entity.size, entity.total);
        result.status = entity.status;
        result.message = entity.message;
        return result;
    }

}
