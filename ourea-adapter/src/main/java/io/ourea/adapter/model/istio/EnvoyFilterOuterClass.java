// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy_filter.proto

package io.ourea.adapter.model.istio;

public final class EnvoyFilterOuterClass {
  private EnvoyFilterOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_EnvoyFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_EnvoyFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_EnvoyFilter_ProxyMatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_EnvoyFilter_ProxyMatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_EnvoyFilter_ProxyMatch_MetadataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_EnvoyFilter_ProxyMatch_MetadataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_EnvoyFilter_ClusterMatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_EnvoyFilter_ClusterMatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_EnvoyFilter_RouteConfigurationMatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_EnvoyFilter_RouteConfigurationMatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_EnvoyFilter_RouteConfigurationMatch_RouteMatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_EnvoyFilter_RouteConfigurationMatch_RouteMatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_EnvoyFilter_RouteConfigurationMatch_VirtualHostMatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_EnvoyFilter_RouteConfigurationMatch_VirtualHostMatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_EnvoyFilter_ListenerMatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_EnvoyFilter_ListenerMatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_EnvoyFilter_ListenerMatch_FilterChainMatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_EnvoyFilter_ListenerMatch_FilterChainMatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_EnvoyFilter_ListenerMatch_FilterMatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_EnvoyFilter_ListenerMatch_FilterMatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_EnvoyFilter_ListenerMatch_SubFilterMatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_EnvoyFilter_ListenerMatch_SubFilterMatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_EnvoyFilter_Patch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_EnvoyFilter_Patch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_EnvoyFilter_EnvoyConfigObjectMatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_EnvoyFilter_EnvoyConfigObjectMatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_EnvoyFilter_EnvoyConfigObjectPatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_EnvoyFilter_EnvoyConfigObjectPatch_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022envoy_filter.proto\022\031istio.networking.v" +
      "1alpha3\032\024field_behavior.proto\032\034google/pr" +
      "otobuf/struct.proto\032\rsidecar.proto\"\275\024\n\013E" +
      "nvoyFilter\022F\n\021workload_selector\030\003 \001(\0132+." +
      "istio.networking.v1alpha3.WorkloadSelect" +
      "or\022Z\n\016config_patches\030\004 \003(\0132=.istio.netwo" +
      "rking.v1alpha3.EnvoyFilter.EnvoyConfigOb" +
      "jectPatchB\003\340A\002\032\247\001\n\nProxyMatch\022\025\n\rproxy_v" +
      "ersion\030\001 \001(\t\022Q\n\010metadata\030\002 \003(\0132?.istio.n" +
      "etworking.v1alpha3.EnvoyFilter.ProxyMatc" +
      "h.MetadataEntry\032/\n\rMetadataEntry\022\013\n\003key\030" +
      "\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\032R\n\014ClusterMatch" +
      "\022\023\n\013port_number\030\001 \001(\r\022\017\n\007service\030\002 \001(\t\022\016" +
      "\n\006subset\030\003 \001(\t\022\014\n\004name\030\004 \001(\t\032\374\003\n\027RouteCo" +
      "nfigurationMatch\022\023\n\013port_number\030\001 \001(\r\022\021\n" +
      "\tport_name\030\002 \001(\t\022\017\n\007gateway\030\003 \001(\t\022^\n\005vho" +
      "st\030\004 \001(\0132O.istio.networking.v1alpha3.Env" +
      "oyFilter.RouteConfigurationMatch.Virtual" +
      "HostMatch\022\014\n\004name\030\005 \001(\t\032\275\001\n\nRouteMatch\022\014" +
      "\n\004name\030\001 \001(\t\022`\n\006action\030\002 \001(\0162P.istio.net" +
      "working.v1alpha3.EnvoyFilter.RouteConfig" +
      "urationMatch.RouteMatch.Action\"?\n\006Action" +
      "\022\007\n\003ANY\020\000\022\t\n\005ROUTE\020\001\022\014\n\010REDIRECT\020\002\022\023\n\017DI" +
      "RECT_RESPONSE\020\003\032z\n\020VirtualHostMatch\022\014\n\004n" +
      "ame\030\001 \001(\t\022X\n\005route\030\002 \001(\0132I.istio.network" +
      "ing.v1alpha3.EnvoyFilter.RouteConfigurat" +
      "ionMatch.RouteMatch\032\365\003\n\rListenerMatch\022\023\n" +
      "\013port_number\030\001 \001(\r\022\021\n\tport_name\030\002 \001(\t\022[\n" +
      "\014filter_chain\030\003 \001(\0132E.istio.networking.v" +
      "1alpha3.EnvoyFilter.ListenerMatch.Filter" +
      "ChainMatch\022\014\n\004name\030\004 \001(\t\032\272\001\n\020FilterChain" +
      "Match\022\014\n\004name\030\001 \001(\t\022\013\n\003sni\030\002 \001(\t\022\032\n\022tran" +
      "sport_protocol\030\003 \001(\t\022\035\n\025application_prot" +
      "ocols\030\004 \001(\t\022P\n\006filter\030\005 \001(\0132@.istio.netw" +
      "orking.v1alpha3.EnvoyFilter.ListenerMatc" +
      "h.FilterMatch\032t\n\013FilterMatch\022\014\n\004name\030\001 \001" +
      "(\t\022W\n\nsub_filter\030\002 \001(\0132C.istio.networkin" +
      "g.v1alpha3.EnvoyFilter.ListenerMatch.Sub" +
      "FilterMatch\032\036\n\016SubFilterMatch\022\014\n\004name\030\001 " +
      "\001(\t\032\353\001\n\005Patch\022I\n\toperation\030\001 \001(\01626.istio" +
      ".networking.v1alpha3.EnvoyFilter.Patch.O" +
      "peration\022&\n\005value\030\002 \001(\0132\027.google.protobu" +
      "f.Struct\"o\n\tOperation\022\013\n\007INVALID\020\000\022\t\n\005ME" +
      "RGE\020\001\022\007\n\003ADD\020\002\022\n\n\006REMOVE\020\003\022\021\n\rINSERT_BEF" +
      "ORE\020\004\022\020\n\014INSERT_AFTER\020\005\022\020\n\014INSERT_FIRST\020" +
      "\006\032\241\003\n\026EnvoyConfigObjectMatch\022D\n\007context\030" +
      "\001 \001(\01623.istio.networking.v1alpha3.EnvoyF" +
      "ilter.PatchContext\022@\n\005proxy\030\002 \001(\01321.isti" +
      "o.networking.v1alpha3.EnvoyFilter.ProxyM" +
      "atch\022H\n\010listener\030\003 \001(\01324.istio.networkin" +
      "g.v1alpha3.EnvoyFilter.ListenerMatchH\000\022]" +
      "\n\023route_configuration\030\004 \001(\0132>.istio.netw" +
      "orking.v1alpha3.EnvoyFilter.RouteConfigu" +
      "rationMatchH\000\022F\n\007cluster\030\005 \001(\01323.istio.n" +
      "etworking.v1alpha3.EnvoyFilter.ClusterMa" +
      "tchH\000B\016\n\014object_types\032\345\001\n\026EnvoyConfigObj" +
      "ectPatch\022@\n\010apply_to\030\001 \001(\0162..istio.netwo" +
      "rking.v1alpha3.EnvoyFilter.ApplyTo\022L\n\005ma" +
      "tch\030\002 \001(\0132=.istio.networking.v1alpha3.En" +
      "voyFilter.EnvoyConfigObjectMatch\022;\n\005patc" +
      "h\030\003 \001(\0132,.istio.networking.v1alpha3.Envo" +
      "yFilter.Patch\"\243\001\n\007ApplyTo\022\013\n\007INVALID\020\000\022\014" +
      "\n\010LISTENER\020\001\022\020\n\014FILTER_CHAIN\020\002\022\022\n\016NETWOR" +
      "K_FILTER\020\003\022\017\n\013HTTP_FILTER\020\004\022\027\n\023ROUTE_CON" +
      "FIGURATION\020\005\022\020\n\014VIRTUAL_HOST\020\006\022\016\n\nHTTP_R" +
      "OUTE\020\007\022\013\n\007CLUSTER\020\010\"O\n\014PatchContext\022\007\n\003A" +
      "NY\020\000\022\023\n\017SIDECAR_INBOUND\020\001\022\024\n\020SIDECAR_OUT" +
      "BOUND\020\002\022\013\n\007GATEWAY\020\003J\004\010\001\020\002J\004\010\002\020\003R\007filter" +
      "sR\017workload_labelsBB\n\034io.ourea.adapter.m" +
      "odel.istioP\001Z istio.io/api/networking/v1" +
      "alpha3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          io.ourea.adapter.model.istio.SidecarOuterClass.getDescriptor(),
        });
    internal_static_istio_networking_v1alpha3_EnvoyFilter_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_istio_networking_v1alpha3_EnvoyFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_EnvoyFilter_descriptor,
        new java.lang.String[] { "WorkloadSelector", "ConfigPatches", });
    internal_static_istio_networking_v1alpha3_EnvoyFilter_ProxyMatch_descriptor =
      internal_static_istio_networking_v1alpha3_EnvoyFilter_descriptor.getNestedTypes().get(0);
    internal_static_istio_networking_v1alpha3_EnvoyFilter_ProxyMatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_EnvoyFilter_ProxyMatch_descriptor,
        new java.lang.String[] { "ProxyVersion", "Metadata", });
    internal_static_istio_networking_v1alpha3_EnvoyFilter_ProxyMatch_MetadataEntry_descriptor =
      internal_static_istio_networking_v1alpha3_EnvoyFilter_ProxyMatch_descriptor.getNestedTypes().get(0);
    internal_static_istio_networking_v1alpha3_EnvoyFilter_ProxyMatch_MetadataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_EnvoyFilter_ProxyMatch_MetadataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_istio_networking_v1alpha3_EnvoyFilter_ClusterMatch_descriptor =
      internal_static_istio_networking_v1alpha3_EnvoyFilter_descriptor.getNestedTypes().get(1);
    internal_static_istio_networking_v1alpha3_EnvoyFilter_ClusterMatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_EnvoyFilter_ClusterMatch_descriptor,
        new java.lang.String[] { "PortNumber", "Service", "Subset", "Name", });
    internal_static_istio_networking_v1alpha3_EnvoyFilter_RouteConfigurationMatch_descriptor =
      internal_static_istio_networking_v1alpha3_EnvoyFilter_descriptor.getNestedTypes().get(2);
    internal_static_istio_networking_v1alpha3_EnvoyFilter_RouteConfigurationMatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_EnvoyFilter_RouteConfigurationMatch_descriptor,
        new java.lang.String[] { "PortNumber", "PortName", "Gateway", "Vhost", "Name", });
    internal_static_istio_networking_v1alpha3_EnvoyFilter_RouteConfigurationMatch_RouteMatch_descriptor =
      internal_static_istio_networking_v1alpha3_EnvoyFilter_RouteConfigurationMatch_descriptor.getNestedTypes().get(0);
    internal_static_istio_networking_v1alpha3_EnvoyFilter_RouteConfigurationMatch_RouteMatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_EnvoyFilter_RouteConfigurationMatch_RouteMatch_descriptor,
        new java.lang.String[] { "Name", "Action", });
    internal_static_istio_networking_v1alpha3_EnvoyFilter_RouteConfigurationMatch_VirtualHostMatch_descriptor =
      internal_static_istio_networking_v1alpha3_EnvoyFilter_RouteConfigurationMatch_descriptor.getNestedTypes().get(1);
    internal_static_istio_networking_v1alpha3_EnvoyFilter_RouteConfigurationMatch_VirtualHostMatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_EnvoyFilter_RouteConfigurationMatch_VirtualHostMatch_descriptor,
        new java.lang.String[] { "Name", "Route", });
    internal_static_istio_networking_v1alpha3_EnvoyFilter_ListenerMatch_descriptor =
      internal_static_istio_networking_v1alpha3_EnvoyFilter_descriptor.getNestedTypes().get(3);
    internal_static_istio_networking_v1alpha3_EnvoyFilter_ListenerMatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_EnvoyFilter_ListenerMatch_descriptor,
        new java.lang.String[] { "PortNumber", "PortName", "FilterChain", "Name", });
    internal_static_istio_networking_v1alpha3_EnvoyFilter_ListenerMatch_FilterChainMatch_descriptor =
      internal_static_istio_networking_v1alpha3_EnvoyFilter_ListenerMatch_descriptor.getNestedTypes().get(0);
    internal_static_istio_networking_v1alpha3_EnvoyFilter_ListenerMatch_FilterChainMatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_EnvoyFilter_ListenerMatch_FilterChainMatch_descriptor,
        new java.lang.String[] { "Name", "Sni", "TransportProtocol", "ApplicationProtocols", "Filter", });
    internal_static_istio_networking_v1alpha3_EnvoyFilter_ListenerMatch_FilterMatch_descriptor =
      internal_static_istio_networking_v1alpha3_EnvoyFilter_ListenerMatch_descriptor.getNestedTypes().get(1);
    internal_static_istio_networking_v1alpha3_EnvoyFilter_ListenerMatch_FilterMatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_EnvoyFilter_ListenerMatch_FilterMatch_descriptor,
        new java.lang.String[] { "Name", "SubFilter", });
    internal_static_istio_networking_v1alpha3_EnvoyFilter_ListenerMatch_SubFilterMatch_descriptor =
      internal_static_istio_networking_v1alpha3_EnvoyFilter_ListenerMatch_descriptor.getNestedTypes().get(2);
    internal_static_istio_networking_v1alpha3_EnvoyFilter_ListenerMatch_SubFilterMatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_EnvoyFilter_ListenerMatch_SubFilterMatch_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_istio_networking_v1alpha3_EnvoyFilter_Patch_descriptor =
      internal_static_istio_networking_v1alpha3_EnvoyFilter_descriptor.getNestedTypes().get(4);
    internal_static_istio_networking_v1alpha3_EnvoyFilter_Patch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_EnvoyFilter_Patch_descriptor,
        new java.lang.String[] { "Operation", "Value", });
    internal_static_istio_networking_v1alpha3_EnvoyFilter_EnvoyConfigObjectMatch_descriptor =
      internal_static_istio_networking_v1alpha3_EnvoyFilter_descriptor.getNestedTypes().get(5);
    internal_static_istio_networking_v1alpha3_EnvoyFilter_EnvoyConfigObjectMatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_EnvoyFilter_EnvoyConfigObjectMatch_descriptor,
        new java.lang.String[] { "Context", "Proxy", "Listener", "RouteConfiguration", "Cluster", "ObjectTypes", });
    internal_static_istio_networking_v1alpha3_EnvoyFilter_EnvoyConfigObjectPatch_descriptor =
      internal_static_istio_networking_v1alpha3_EnvoyFilter_descriptor.getNestedTypes().get(6);
    internal_static_istio_networking_v1alpha3_EnvoyFilter_EnvoyConfigObjectPatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_EnvoyFilter_EnvoyConfigObjectPatch_descriptor,
        new java.lang.String[] { "ApplyTo", "Match", "Patch", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    io.ourea.adapter.model.istio.SidecarOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
