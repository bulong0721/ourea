package io.ourea.adapter.mcp;

import io.grpc.stub.StreamObserver;
import io.ourea.adapter.misc.Loggers;
import io.ourea.adapter.model.mcp.RequestResources;
import io.ourea.adapter.model.mcp.Resource;
import io.ourea.adapter.model.mcp.ResourceSourceGrpc;
import io.ourea.adapter.model.mcp.Resources;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class McpSourceService extends ResourceSourceGrpc.ResourceSourceImplBase {
    private final AtomicInteger connectIdGenerator = new AtomicInteger(0);
    private final Map<Integer, StreamObserver<Resources>> connnections = new ConcurrentHashMap<>(16);
    private final Map<String, Resource> resourceMap = new ConcurrentHashMap<>(16);
    private final Map<String, String> checksumMap = new ConcurrentHashMap<>(16);

    @PostConstruct
    public void init() {
    }

    @Override
    public StreamObserver<RequestResources> establishResourceStream(StreamObserver<Resources> responseObserver) {
        int id = connectIdGenerator.incrementAndGet();
        connnections.put(id, responseObserver);

        return new StreamObserver<RequestResources>() {
            private final int connectionId = id;

            @Override
            public void onNext(RequestResources value) {
                Loggers.MAIN.info("receiving request, sink: {}, type: {}", value.getSinkNode(), value.getCollection());

                if (value.getErrorDetail() != null && value.getErrorDetail().getCode() != 0) {
                    Loggers.MAIN.error("NACK error code: {}, message: {}", value.getErrorDetail().getCode(), value.getErrorDetail().getMessage());
                    return;
                }

                if (!StringUtils.isEmpty(value.getResponseNonce())) {
                    // This is a response:
                    Loggers.MAIN.info("ACK nonce: {}, type: {}", value.getResponseNonce(), value.getCollection());
                    return;
                }

                if (!CollectionTypes.SERVICE_ENTRY.equals(value.getCollection())) {
                    // Return empty resources for other types:
                    Resources resources = Resources.newBuilder()
                            .setCollection(value.getCollection())
                            .setNonce(String.valueOf(System.currentTimeMillis()))
                            .build();
                    responseObserver.onNext(resources);
                }
            }

            @Override
            public void onError(Throwable t) {
                Loggers.MAIN.error("stream error.", t);
                connnections.remove(connectionId);
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
