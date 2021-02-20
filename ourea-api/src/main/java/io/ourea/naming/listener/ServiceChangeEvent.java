package io.ourea.naming.listener;

import io.ourea.naming.pojo.Instance;
import lombok.Data;

import java.util.Set;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/5
 */
@Data
public class ServiceChangeEvent implements Event {
    private String service;
    private Set<Instance> instances;
}
