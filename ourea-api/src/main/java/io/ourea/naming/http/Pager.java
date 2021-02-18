package io.ourea.naming.http;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 徐步龙
 * @version V1.0 created at: 2018/11/28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pager implements Serializable{
	private static final long serialVersionUID = 1L;
	private int pageIndex;
    private int pageSize = 10;

}
