// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sidecar.proto

package io.ourea.adapter.model.istio;

public final class SidecarOuterClass {
  private SidecarOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_Sidecar_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_Sidecar_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_IstioIngressListener_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_IstioIngressListener_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_IstioEgressListener_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_IstioEgressListener_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_WorkloadSelector_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_WorkloadSelector_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_WorkloadSelector_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_WorkloadSelector_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_OutboundTrafficPolicy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_OutboundTrafficPolicy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rsidecar.proto\022\031istio.networking.v1alph" +
      "a3\032\024field_behavior.proto\032\rgateway.proto\032" +
      "\025virtual_service.proto\032\026destination_rule" +
      ".proto\"\275\002\n\007Sidecar\022F\n\021workload_selector\030" +
      "\001 \001(\0132+.istio.networking.v1alpha3.Worklo" +
      "adSelector\022@\n\007ingress\030\002 \003(\0132/.istio.netw" +
      "orking.v1alpha3.IstioIngressListener\022>\n\006" +
      "egress\030\003 \003(\0132..istio.networking.v1alpha3" +
      ".IstioEgressListener\022Q\n\027outbound_traffic" +
      "_policy\030\004 \001(\01320.istio.networking.v1alpha" +
      "3.OutboundTrafficPolicyJ\004\010\005\020\006J\004\010\006\020\007R\tloc" +
      "alhost\"\327\001\n\024IstioIngressListener\0222\n\004port\030" +
      "\001 \001(\0132\037.istio.networking.v1alpha3.PortB\003" +
      "\340A\002\022\014\n\004bind\030\002 \001(\t\022<\n\014capture_mode\030\003 \001(\0162" +
      "&.istio.networking.v1alpha3.CaptureMode\022" +
      "\035\n\020default_endpoint\030\004 \001(\tB\003\340A\002J\004\010\005\020\006J\004\010\006" +
      "\020\007R\024localhost_client_tls\"\306\001\n\023IstioEgress" +
      "Listener\022-\n\004port\030\001 \001(\0132\037.istio.networkin" +
      "g.v1alpha3.Port\022\014\n\004bind\030\002 \001(\t\022<\n\014capture" +
      "_mode\030\003 \001(\0162&.istio.networking.v1alpha3." +
      "CaptureMode\022\022\n\005hosts\030\004 \003(\tB\003\340A\002J\004\010\005\020\006J\004\010" +
      "\006\020\007R\024localhost_server_tls\"\217\001\n\020WorkloadSe" +
      "lector\022L\n\006labels\030\001 \003(\01327.istio.networkin" +
      "g.v1alpha3.WorkloadSelector.LabelsEntryB" +
      "\003\340A\002\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005valu" +
      "e\030\002 \001(\t:\0028\001\"\304\001\n\025OutboundTrafficPolicy\022C\n" +
      "\004mode\030\001 \001(\01625.istio.networking.v1alpha3." +
      "OutboundTrafficPolicy.Mode\022<\n\014egress_pro" +
      "xy\030\002 \001(\0132&.istio.networking.v1alpha3.Des" +
      "tination\"(\n\004Mode\022\021\n\rREGISTRY_ONLY\020\000\022\r\n\tA" +
      "LLOW_ANY\020\001*2\n\013CaptureMode\022\013\n\007DEFAULT\020\000\022\014" +
      "\n\010IPTABLES\020\001\022\010\n\004NONE\020\002BB\n\034io.ourea.adapt" +
      "er.model.istioP\001Z istio.io/api/networkin" +
      "g/v1alpha3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          io.ourea.adapter.model.GatewayOuterClass.getDescriptor(),
          io.ourea.adapter.model.istio.VirtualServiceOuterClass.getDescriptor(),
          io.ourea.adapter.model.istio.DestinationRuleOuterClass.getDescriptor(),
        });
    internal_static_istio_networking_v1alpha3_Sidecar_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_istio_networking_v1alpha3_Sidecar_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_Sidecar_descriptor,
        new java.lang.String[] { "WorkloadSelector", "Ingress", "Egress", "OutboundTrafficPolicy", });
    internal_static_istio_networking_v1alpha3_IstioIngressListener_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_istio_networking_v1alpha3_IstioIngressListener_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_IstioIngressListener_descriptor,
        new java.lang.String[] { "Port", "Bind", "CaptureMode", "DefaultEndpoint", });
    internal_static_istio_networking_v1alpha3_IstioEgressListener_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_istio_networking_v1alpha3_IstioEgressListener_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_IstioEgressListener_descriptor,
        new java.lang.String[] { "Port", "Bind", "CaptureMode", "Hosts", });
    internal_static_istio_networking_v1alpha3_WorkloadSelector_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_istio_networking_v1alpha3_WorkloadSelector_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_WorkloadSelector_descriptor,
        new java.lang.String[] { "Labels", });
    internal_static_istio_networking_v1alpha3_WorkloadSelector_LabelsEntry_descriptor =
      internal_static_istio_networking_v1alpha3_WorkloadSelector_descriptor.getNestedTypes().get(0);
    internal_static_istio_networking_v1alpha3_WorkloadSelector_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_WorkloadSelector_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_istio_networking_v1alpha3_OutboundTrafficPolicy_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_istio_networking_v1alpha3_OutboundTrafficPolicy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_OutboundTrafficPolicy_descriptor,
        new java.lang.String[] { "Mode", "EgressProxy", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    io.ourea.adapter.model.GatewayOuterClass.getDescriptor();
    io.ourea.adapter.model.istio.VirtualServiceOuterClass.getDescriptor();
    io.ourea.adapter.model.istio.DestinationRuleOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}