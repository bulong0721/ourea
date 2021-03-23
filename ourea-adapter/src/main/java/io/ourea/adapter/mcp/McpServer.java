package io.ourea.adapter.mcp;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerInterceptors;
import io.ourea.adapter.misc.IstioConfig;
import io.ourea.adapter.misc.Loggers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;

@Service
public class McpServer {
    private final int port = 18848;
    private Server server;

    @Autowired
    private IstioConfig istioConfig;
    @Autowired
    private McpServerIntercepter intercepter;
    @Autowired
    private McpSourceService mcpSourceService;

    @PostConstruct
    public void start() throws IOException {
        if (!istioConfig.isMcpServerEnabled()) {
            return;
        }

        Loggers.MAIN.info("MCP server, starting Nacos MCP server...");

        server = ServerBuilder.forPort(port)
                .addService(ServerInterceptors.intercept(mcpSourceService, intercepter))
                .build();
        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.out.println("Stopping Ourea MCP server...");
                McpServer.this.stop();
                System.out.println("Ourea MCP server stopped...");
            }
        });
    }

    public void stop() {
        if (server != null) {
            server.shutdown();
        }
    }
}
