// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resource.proto

package io.ourea.adapter.model.mcp;

public final class ResourceOuterClass {
  private ResourceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_mcp_v1alpha1_Resource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_mcp_v1alpha1_Resource_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016resource.proto\022\022istio.mcp.v1alpha1\032\031go" +
      "ogle/protobuf/any.proto\032\016metadata.proto\"" +
      "^\n\010Resource\022.\n\010metadata\030\001 \001(\0132\034.istio.mc" +
      "p.v1alpha1.Metadata\022\"\n\004body\030\002 \001(\0132\024.goog" +
      "le.protobuf.AnyB\036\n\032io.ourea.adapter.mode" +
      "l.mcpP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          io.ourea.adapter.model.mcp.MetadataOuterClass.getDescriptor(),
        });
    internal_static_istio_mcp_v1alpha1_Resource_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_istio_mcp_v1alpha1_Resource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_mcp_v1alpha1_Resource_descriptor,
        new java.lang.String[] { "Metadata", "Body", });
    com.google.protobuf.AnyProto.getDescriptor();
    io.ourea.adapter.model.mcp.MetadataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}