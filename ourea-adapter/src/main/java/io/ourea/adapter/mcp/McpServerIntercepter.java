package io.ourea.adapter.mcp;

import io.grpc.*;
import io.ourea.adapter.misc.Loggers;
import org.springframework.stereotype.Component;

import java.net.SocketAddress;

@Component
public class McpServerIntercepter implements ServerInterceptor {
    private static final String INTERCEPTE_METHOD_NAME = "EstablishResourceStream";

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call, Metadata headers, ServerCallHandler<ReqT, RespT> next) {
        SocketAddress address = call.getAttributes().get(Grpc.TRANSPORT_ATTR_REMOTE_ADDR);
        String methodName = call.getMethodDescriptor().getFullMethodName();

        Loggers.MAIN.info("remote address: {}, method: {}", address, methodName);
        return next.startCall(call, headers);
    }
}
