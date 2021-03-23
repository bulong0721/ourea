// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gateway.proto

package io.ourea.adapter.model;

public final class GatewayOuterClass {
  private GatewayOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_Gateway_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_Gateway_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_Gateway_SelectorEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_Gateway_SelectorEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_Server_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_Server_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_Port_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_Port_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_istio_networking_v1alpha3_ServerTLSSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_istio_networking_v1alpha3_ServerTLSSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rgateway.proto\022\031istio.networking.v1alph" +
      "a3\032\024field_behavior.proto\"\274\001\n\007Gateway\0227\n\007" +
      "servers\030\001 \003(\0132!.istio.networking.v1alpha" +
      "3.ServerB\003\340A\002\022G\n\010selector\030\002 \003(\01320.istio." +
      "networking.v1alpha3.Gateway.SelectorEntr" +
      "yB\003\340A\002\032/\n\rSelectorEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005" +
      "value\030\002 \001(\t:\0028\001\"\301\001\n\006Server\0222\n\004port\030\001 \001(\013" +
      "2\037.istio.networking.v1alpha3.PortB\003\340A\002\022\014" +
      "\n\004bind\030\004 \001(\t\022\022\n\005hosts\030\002 \003(\tB\003\340A\002\0229\n\003tls\030" +
      "\003 \001(\0132,.istio.networking.v1alpha3.Server" +
      "TLSSettings\022\030\n\020default_endpoint\030\005 \001(\t\022\014\n" +
      "\004name\030\006 \001(\t\"Z\n\004Port\022\023\n\006number\030\001 \001(\rB\003\340A\002" +
      "\022\025\n\010protocol\030\002 \001(\tB\003\340A\002\022\021\n\004name\030\003 \001(\tB\003\340" +
      "A\002\022\023\n\013target_port\030\004 \001(\r\"\243\005\n\021ServerTLSSet" +
      "tings\022\026\n\016https_redirect\030\001 \001(\010\022B\n\004mode\030\002 " +
      "\001(\01624.istio.networking.v1alpha3.ServerTL" +
      "SSettings.TLSmode\022\032\n\022server_certificate\030" +
      "\003 \001(\t\022\023\n\013private_key\030\004 \001(\t\022\027\n\017ca_certifi" +
      "cates\030\005 \001(\t\022\027\n\017credential_name\030\n \001(\t\022\031\n\021" +
      "subject_alt_names\030\006 \003(\t\022\037\n\027verify_certif" +
      "icate_spki\030\013 \003(\t\022\037\n\027verify_certificate_h" +
      "ash\030\014 \003(\t\022V\n\024min_protocol_version\030\007 \001(\0162" +
      "8.istio.networking.v1alpha3.ServerTLSSet" +
      "tings.TLSProtocol\022V\n\024max_protocol_versio" +
      "n\030\010 \001(\01628.istio.networking.v1alpha3.Serv" +
      "erTLSSettings.TLSProtocol\022\025\n\rcipher_suit" +
      "es\030\t \003(\t\"Z\n\007TLSmode\022\017\n\013PASSTHROUGH\020\000\022\n\n\006" +
      "SIMPLE\020\001\022\n\n\006MUTUAL\020\002\022\024\n\020AUTO_PASSTHROUGH" +
      "\020\003\022\020\n\014ISTIO_MUTUAL\020\004\"O\n\013TLSProtocol\022\014\n\010T" +
      "LS_AUTO\020\000\022\013\n\007TLSV1_0\020\001\022\013\n\007TLSV1_1\020\002\022\013\n\007T" +
      "LSV1_2\020\003\022\013\n\007TLSV1_3\020\004B<\n\026io.ourea.adapte" +
      "r.modelP\001Z istio.io/api/networking/v1alp" +
      "ha3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_istio_networking_v1alpha3_Gateway_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_istio_networking_v1alpha3_Gateway_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_Gateway_descriptor,
        new java.lang.String[] { "Servers", "Selector", });
    internal_static_istio_networking_v1alpha3_Gateway_SelectorEntry_descriptor =
      internal_static_istio_networking_v1alpha3_Gateway_descriptor.getNestedTypes().get(0);
    internal_static_istio_networking_v1alpha3_Gateway_SelectorEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_Gateway_SelectorEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_istio_networking_v1alpha3_Server_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_istio_networking_v1alpha3_Server_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_Server_descriptor,
        new java.lang.String[] { "Port", "Bind", "Hosts", "Tls", "DefaultEndpoint", "Name", });
    internal_static_istio_networking_v1alpha3_Port_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_istio_networking_v1alpha3_Port_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_Port_descriptor,
        new java.lang.String[] { "Number", "Protocol", "Name", "TargetPort", });
    internal_static_istio_networking_v1alpha3_ServerTLSSettings_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_istio_networking_v1alpha3_ServerTLSSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_istio_networking_v1alpha3_ServerTLSSettings_descriptor,
        new java.lang.String[] { "HttpsRedirect", "Mode", "ServerCertificate", "PrivateKey", "CaCertificates", "CredentialName", "SubjectAltNames", "VerifyCertificateSpki", "VerifyCertificateHash", "MinProtocolVersion", "MaxProtocolVersion", "CipherSuites", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
