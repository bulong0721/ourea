// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service_entry.proto

package io.ourea.adapter.model.istio;

public final class ServiceEntryOuterClass {
  private ServiceEntryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_ServiceEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_ServiceEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023service_entry.proto\022\031istio.networking." +
      "v1alpha3\032\024field_behavior.proto\032\rgateway." +
      "proto\032\rsidecar.proto\032\024workload_entry.pro" +
      "to\"\215\004\n\014ServiceEntry\022\022\n\005hosts\030\001 \003(\tB\003\340A\002\022" +
      "\021\n\taddresses\030\002 \003(\t\0223\n\005ports\030\003 \003(\0132\037.isti" +
      "o.networking.v1alpha3.PortB\003\340A\002\022B\n\010locat" +
      "ion\030\004 \001(\01620.istio.networking.v1alpha3.Se" +
      "rviceEntry.Location\022K\n\nresolution\030\005 \001(\0162" +
      "2.istio.networking.v1alpha3.ServiceEntry" +
      ".ResolutionB\003\340A\002\022;\n\tendpoints\030\006 \003(\0132(.is" +
      "tio.networking.v1alpha3.WorkloadEntry\022F\n" +
      "\021workload_selector\030\t \001(\0132+.istio.network" +
      "ing.v1alpha3.WorkloadSelector\022\021\n\texport_" +
      "to\030\007 \003(\t\022\031\n\021subject_alt_names\030\010 \003(\t\"0\n\010L" +
      "ocation\022\021\n\rMESH_EXTERNAL\020\000\022\021\n\rMESH_INTER" +
      "NAL\020\001\"+\n\nResolution\022\010\n\004NONE\020\000\022\n\n\006STATIC\020" +
      "\001\022\007\n\003DNS\020\002BB\n\034io.ourea.adapter.model.ist" +
      "ioP\001Z istio.io/api/networking/v1alpha3b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          io.ourea.adapter.model.GatewayOuterClass.getDescriptor(),
          io.ourea.adapter.model.istio.SidecarOuterClass.getDescriptor(),
          io.ourea.adapter.model.istio.WorkloadEntryOuterClass.getDescriptor(),
        });
    internal_static_istio_networking_v1alpha3_ServiceEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_istio_networking_v1alpha3_ServiceEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_ServiceEntry_descriptor,
        new java.lang.String[] { "Hosts", "Addresses", "Ports", "Location", "Resolution", "Endpoints", "WorkloadSelector", "ExportTo", "SubjectAltNames", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    io.ourea.adapter.model.GatewayOuterClass.getDescriptor();
    io.ourea.adapter.model.istio.SidecarOuterClass.getDescriptor();
    io.ourea.adapter.model.istio.WorkloadEntryOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
