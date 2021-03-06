// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: workload_entry.proto

package io.ourea.adapter.model.istio;

public final class WorkloadEntryOuterClass {
  private WorkloadEntryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_WorkloadEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_WorkloadEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_WorkloadEntry_PortsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_WorkloadEntry_PortsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_WorkloadEntry_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_WorkloadEntry_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024workload_entry.proto\022\031istio.networking" +
      ".v1alpha3\032\024field_behavior.proto\"\330\002\n\rWork" +
      "loadEntry\022\024\n\007address\030\001 \001(\tB\003\340A\002\022B\n\005ports" +
      "\030\002 \003(\01323.istio.networking.v1alpha3.Workl" +
      "oadEntry.PortsEntry\022D\n\006labels\030\003 \003(\01324.is" +
      "tio.networking.v1alpha3.WorkloadEntry.La" +
      "belsEntry\022\017\n\007network\030\004 \001(\t\022\020\n\010locality\030\005" +
      " \001(\t\022\016\n\006weight\030\006 \001(\r\022\027\n\017service_account\030" +
      "\007 \001(\t\032,\n\nPortsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005valu" +
      "e\030\002 \001(\r:\0028\001\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022" +
      "\r\n\005value\030\002 \001(\t:\0028\001BB\n\034io.ourea.adapter.m" +
      "odel.istioP\001Z istio.io/api/networking/v1" +
      "alpha3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_istio_networking_v1alpha3_WorkloadEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_istio_networking_v1alpha3_WorkloadEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_WorkloadEntry_descriptor,
        new java.lang.String[] { "Address", "Ports", "Labels", "Network", "Locality", "Weight", "ServiceAccount", });
    internal_static_istio_networking_v1alpha3_WorkloadEntry_PortsEntry_descriptor =
      internal_static_istio_networking_v1alpha3_WorkloadEntry_descriptor.getNestedTypes().get(0);
    internal_static_istio_networking_v1alpha3_WorkloadEntry_PortsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_WorkloadEntry_PortsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_istio_networking_v1alpha3_WorkloadEntry_LabelsEntry_descriptor =
      internal_static_istio_networking_v1alpha3_WorkloadEntry_descriptor.getNestedTypes().get(1);
    internal_static_istio_networking_v1alpha3_WorkloadEntry_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_WorkloadEntry_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
