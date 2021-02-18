package io.ourea.naming.feign;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import io.ourea.naming.http.ResponseEntity;
import io.ourea.naming.pojo.Instance;
import io.ourea.naming.pojo.Session;

import java.util.Map;
import java.util.Set;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/17
 */
public interface NamingService {

    @RequestLine("PUT /naming/{service}")
    @Headers("Content-Type: application/json")
    ResponseEntity<Instance> register(@Param("service") String serviceName, Instance instance);

    @RequestLine("DELETE /naming/{service}")
    @Headers("Content-Type: application/json")
    ResponseEntity<Instance> unregister(@Param("service") String serviceName, Instance instance);

    @RequestLine("GET /naming/{service}")
    @Headers("Content-Type: application/json")
    ResponseEntity<Set<Instance>> lookup(@Param("service") String serviceName);

    @RequestLine("POST /naming/lookup")
    @Headers("Content-Type: application/json")
    ResponseEntity<Map<String, Set<Instance>>> lookup(Set<String> serviceSet);

    @RequestLine("GET /supervise/ping/{clientId}")
    @Headers("Content-Type: application/json")
    ResponseEntity<Session> ping(@Param("clientId") String clientId);
}
