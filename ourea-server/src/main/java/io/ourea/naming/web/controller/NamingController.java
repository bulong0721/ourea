package io.ourea.naming.web.controller;

import io.ourea.naming.core.NamingServer;
import io.ourea.naming.http.ResponseEntity;
import io.ourea.naming.http.StatusCode;
import io.ourea.naming.pojo.Instance;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Set;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/3
 */
@Slf4j
@RestController
@RequestMapping("/naming")
public class NamingController {
    @Autowired
    private NamingServer namingServer;

    @PutMapping("/{service}")
    public ResponseEntity<Instance> register(@PathVariable("service") String serviceName, @RequestBody Instance instance) {
        namingServer.register(serviceName, instance);
        return StatusCode.OK.build(instance);
    }

    @DeleteMapping("/{service}")
    public ResponseEntity<Instance> unregister(@PathVariable("service") String serviceName, @RequestBody Instance instance) {
        namingServer.unregister(serviceName, instance);
        return StatusCode.OK.build(instance);
    }

    @GetMapping("/{service}")
    public ResponseEntity<Set<Instance>> lookup(@PathVariable("service") String serviceName) {
        Set<Instance> instances = namingServer.lookup(serviceName);
        return StatusCode.OK.build(instances);
    }

    @PostMapping("/lookup")
    public ResponseEntity<Map<String, Set<Instance>>> lookup(@RequestBody Set<String> serviceSet) {
        Map<String, Set<Instance>> serviceMap = namingServer.lookup(serviceSet);
        return StatusCode.OK.build(serviceMap);
    }
}
