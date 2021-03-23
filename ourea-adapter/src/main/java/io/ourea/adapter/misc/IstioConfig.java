package io.ourea.adapter.misc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class IstioConfig {
    @Value("${nacos.istio.mcp.server.enabled:false}")
    private boolean mcpServerEnabled = false;

    public boolean isMcpServerEnabled() {
        return mcpServerEnabled;
    }
}
