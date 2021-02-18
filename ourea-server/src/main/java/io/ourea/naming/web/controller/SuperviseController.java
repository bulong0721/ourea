package io.ourea.naming.web.controller;

import io.ourea.naming.core.NamingServer;
import io.ourea.naming.http.ResponseEntity;
import io.ourea.naming.http.StatusCode;
import io.ourea.naming.pojo.Heartbeat;
import io.ourea.naming.pojo.Session;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/3
 */
@Slf4j
@RestController
@RequestMapping("/supervise")
public class SuperviseController {
    @Autowired
    private NamingServer namingServer;

    @GetMapping("/ping/{clientId}")
    public ResponseEntity<Session> ping(@PathVariable("clientId") String clientId) {
        Heartbeat heartbeat = new Heartbeat();
        heartbeat.setClientId(clientId);
        Session session = namingServer.ping(heartbeat);
        return StatusCode.OK.build(session);
    }
}
