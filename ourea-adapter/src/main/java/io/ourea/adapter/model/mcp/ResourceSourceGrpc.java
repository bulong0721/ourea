package io.ourea.adapter.model.mcp;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service where the sink is the gRPC client. The sink is responsible for
 * initiating connections and opening streams.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: mcp.proto")
public final class ResourceSourceGrpc {

  private ResourceSourceGrpc() {}

  public static final String SERVICE_NAME = "istio.mcp.v1alpha1.ResourceSource";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.ourea.adapter.model.mcp.RequestResources,
      io.ourea.adapter.model.mcp.Resources> getEstablishResourceStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EstablishResourceStream",
      requestType = io.ourea.adapter.model.mcp.RequestResources.class,
      responseType = io.ourea.adapter.model.mcp.Resources.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.ourea.adapter.model.mcp.RequestResources,
      io.ourea.adapter.model.mcp.Resources> getEstablishResourceStreamMethod() {
    io.grpc.MethodDescriptor<io.ourea.adapter.model.mcp.RequestResources, io.ourea.adapter.model.mcp.Resources> getEstablishResourceStreamMethod;
    if ((getEstablishResourceStreamMethod = ResourceSourceGrpc.getEstablishResourceStreamMethod) == null) {
      synchronized (ResourceSourceGrpc.class) {
        if ((getEstablishResourceStreamMethod = ResourceSourceGrpc.getEstablishResourceStreamMethod) == null) {
          ResourceSourceGrpc.getEstablishResourceStreamMethod = getEstablishResourceStreamMethod =
              io.grpc.MethodDescriptor.<io.ourea.adapter.model.mcp.RequestResources, io.ourea.adapter.model.mcp.Resources>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EstablishResourceStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.ourea.adapter.model.mcp.RequestResources.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.ourea.adapter.model.mcp.Resources.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceSourceMethodDescriptorSupplier("EstablishResourceStream"))
              .build();
        }
      }
    }
    return getEstablishResourceStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ResourceSourceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceSourceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceSourceStub>() {
        @java.lang.Override
        public ResourceSourceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceSourceStub(channel, callOptions);
        }
      };
    return ResourceSourceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ResourceSourceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceSourceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceSourceBlockingStub>() {
        @java.lang.Override
        public ResourceSourceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceSourceBlockingStub(channel, callOptions);
        }
      };
    return ResourceSourceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ResourceSourceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceSourceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceSourceFutureStub>() {
        @java.lang.Override
        public ResourceSourceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceSourceFutureStub(channel, callOptions);
        }
      };
    return ResourceSourceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service where the sink is the gRPC client. The sink is responsible for
   * initiating connections and opening streams.
   * </pre>
   */
  public static abstract class ResourceSourceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * The sink, acting as gRPC client, establishes a new resource stream
     * with the source. The sink sends RequestResources message to
     * and receives Resources messages from the source.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.ourea.adapter.model.mcp.RequestResources> establishResourceStream(
        io.grpc.stub.StreamObserver<io.ourea.adapter.model.mcp.Resources> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getEstablishResourceStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEstablishResourceStreamMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                io.ourea.adapter.model.mcp.RequestResources,
                io.ourea.adapter.model.mcp.Resources>(
                  this, METHODID_ESTABLISH_RESOURCE_STREAM)))
          .build();
    }
  }

  /**
   * <pre>
   * Service where the sink is the gRPC client. The sink is responsible for
   * initiating connections and opening streams.
   * </pre>
   */
  public static final class ResourceSourceStub extends io.grpc.stub.AbstractAsyncStub<ResourceSourceStub> {
    private ResourceSourceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceSourceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceSourceStub(channel, callOptions);
    }

    /**
     * <pre>
     * The sink, acting as gRPC client, establishes a new resource stream
     * with the source. The sink sends RequestResources message to
     * and receives Resources messages from the source.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.ourea.adapter.model.mcp.RequestResources> establishResourceStream(
        io.grpc.stub.StreamObserver<io.ourea.adapter.model.mcp.Resources> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getEstablishResourceStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Service where the sink is the gRPC client. The sink is responsible for
   * initiating connections and opening streams.
   * </pre>
   */
  public static final class ResourceSourceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ResourceSourceBlockingStub> {
    private ResourceSourceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceSourceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceSourceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Service where the sink is the gRPC client. The sink is responsible for
   * initiating connections and opening streams.
   * </pre>
   */
  public static final class ResourceSourceFutureStub extends io.grpc.stub.AbstractFutureStub<ResourceSourceFutureStub> {
    private ResourceSourceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceSourceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceSourceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_ESTABLISH_RESOURCE_STREAM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ResourceSourceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ResourceSourceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ESTABLISH_RESOURCE_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.establishResourceStream(
              (io.grpc.stub.StreamObserver<io.ourea.adapter.model.mcp.Resources>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ResourceSourceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ResourceSourceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.ourea.adapter.model.mcp.Mcp.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ResourceSource");
    }
  }

  private static final class ResourceSourceFileDescriptorSupplier
      extends ResourceSourceBaseDescriptorSupplier {
    ResourceSourceFileDescriptorSupplier() {}
  }

  private static final class ResourceSourceMethodDescriptorSupplier
      extends ResourceSourceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ResourceSourceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ResourceSourceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ResourceSourceFileDescriptorSupplier())
              .addMethod(getEstablishResourceStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
