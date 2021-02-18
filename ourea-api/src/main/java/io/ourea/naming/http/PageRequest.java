package io.ourea.naming.http;

import lombok.Data;
import lombok.ToString;

/**
 * @author 徐步龙
 * @version V1.0 created at: 2018/12/13
 */
@Data
@ToString
public class PageRequest<T> extends Pager{
	private static final long serialVersionUID = 1L;
	private T data;

	public static <E> PageRequest<E> cloneAndSwap(PageRequest request, E data) {
		PageRequest<E> result = new PageRequest<>();
		request.setPageIndex(request.getPageIndex());
		request.setPageSize(request.getPageSize());
		request.setData(data);
		return result;
	}
}
