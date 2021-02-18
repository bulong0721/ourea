package io.ourea.naming.vo;

import io.ourea.naming.pojo.Instance;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/17
 */
@Data
@EqualsAndHashCode(exclude = "instances")
public class NoticeVO {
    private String serviceName;
    private Set<Instance> instances;
    private long timestamp;
}
