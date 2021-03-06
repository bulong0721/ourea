// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gateway.proto

package io.ourea.adapter.model;

public interface ServerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:istio.networking.v1alpha3.Server)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Port on which the proxy should listen for incoming
   * connections.
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.Port port = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the port field is set.
   */
  boolean hasPort();
  /**
   * <pre>
   * The Port on which the proxy should listen for incoming
   * connections.
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.Port port = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The port.
   */
  io.ourea.adapter.model.Port getPort();
  /**
   * <pre>
   * The Port on which the proxy should listen for incoming
   * connections.
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.Port port = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  io.ourea.adapter.model.PortOrBuilder getPortOrBuilder();

  /**
   * <pre>
   * $hide_from_docs
   * The ip or the Unix domain socket to which the listener should be bound
   * to. Format: `x.x.x.x` or `unix:///path/to/uds` or `unix://&#64;foobar`
   * (Linux abstract namespace). When using Unix domain sockets, the port
   * number should be 0.
   * </pre>
   *
   * <code>string bind = 4;</code>
   * @return The bind.
   */
  java.lang.String getBind();
  /**
   * <pre>
   * $hide_from_docs
   * The ip or the Unix domain socket to which the listener should be bound
   * to. Format: `x.x.x.x` or `unix:///path/to/uds` or `unix://&#64;foobar`
   * (Linux abstract namespace). When using Unix domain sockets, the port
   * number should be 0.
   * </pre>
   *
   * <code>string bind = 4;</code>
   * @return The bytes for bind.
   */
  com.google.protobuf.ByteString
      getBindBytes();

  /**
   * <pre>
   * One or more hosts exposed by this gateway.
   * While typically applicable to
   * HTTP services, it can also be used for TCP services using TLS with SNI.
   * A host is specified as a `dnsName` with an optional `namespace/` prefix.
   * The `dnsName` should be specified using FQDN format, optionally including
   * a wildcard character in the left-most component (e.g., `prod/&#42;.example.com`).
   * Set the `dnsName` to `*` to select all `VirtualService` hosts from the
   * specified namespace (e.g.,`prod/&#42;`).
   * The `namespace` can be set to `*` or `.`, representing any or the current
   * namespace, respectively. For example, `*&#47;foo.example.com` selects the
   * service from any available namespace while `./foo.example.com` only selects
   * the service from the namespace of the sidecar. The default, if no `namespace/`
   * is specified, is `*&#47;`, that is, select services from any namespace.
   * Any associated `DestinationRule` in the selected namespace will also be used.
   * A `VirtualService` must be bound to the gateway and must have one or
   * more hosts that match the hosts specified in a server. The match
   * could be an exact match or a suffix match with the server's hosts. For
   * example, if the server's hosts specifies `*.example.com`, a
   * `VirtualService` with hosts `dev.example.com` or `prod.example.com` will
   * match. However, a `VirtualService` with host `example.com` or
   * `newexample.com` will not match.
   * NOTE: Only virtual services exported to the gateway's namespace
   * (e.g., `exportTo` value of `*`) can be referenced.
   * Private configurations (e.g., `exportTo` set to `.`) will not be
   * available. Refer to the `exportTo` setting in `VirtualService`,
   * `DestinationRule`, and `ServiceEntry` configurations for details.
   * </pre>
   *
   * <code>repeated string hosts = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the hosts.
   */
  java.util.List<java.lang.String>
      getHostsList();
  /**
   * <pre>
   * One or more hosts exposed by this gateway.
   * While typically applicable to
   * HTTP services, it can also be used for TCP services using TLS with SNI.
   * A host is specified as a `dnsName` with an optional `namespace/` prefix.
   * The `dnsName` should be specified using FQDN format, optionally including
   * a wildcard character in the left-most component (e.g., `prod/&#42;.example.com`).
   * Set the `dnsName` to `*` to select all `VirtualService` hosts from the
   * specified namespace (e.g.,`prod/&#42;`).
   * The `namespace` can be set to `*` or `.`, representing any or the current
   * namespace, respectively. For example, `*&#47;foo.example.com` selects the
   * service from any available namespace while `./foo.example.com` only selects
   * the service from the namespace of the sidecar. The default, if no `namespace/`
   * is specified, is `*&#47;`, that is, select services from any namespace.
   * Any associated `DestinationRule` in the selected namespace will also be used.
   * A `VirtualService` must be bound to the gateway and must have one or
   * more hosts that match the hosts specified in a server. The match
   * could be an exact match or a suffix match with the server's hosts. For
   * example, if the server's hosts specifies `*.example.com`, a
   * `VirtualService` with hosts `dev.example.com` or `prod.example.com` will
   * match. However, a `VirtualService` with host `example.com` or
   * `newexample.com` will not match.
   * NOTE: Only virtual services exported to the gateway's namespace
   * (e.g., `exportTo` value of `*`) can be referenced.
   * Private configurations (e.g., `exportTo` set to `.`) will not be
   * available. Refer to the `exportTo` setting in `VirtualService`,
   * `DestinationRule`, and `ServiceEntry` configurations for details.
   * </pre>
   *
   * <code>repeated string hosts = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of hosts.
   */
  int getHostsCount();
  /**
   * <pre>
   * One or more hosts exposed by this gateway.
   * While typically applicable to
   * HTTP services, it can also be used for TCP services using TLS with SNI.
   * A host is specified as a `dnsName` with an optional `namespace/` prefix.
   * The `dnsName` should be specified using FQDN format, optionally including
   * a wildcard character in the left-most component (e.g., `prod/&#42;.example.com`).
   * Set the `dnsName` to `*` to select all `VirtualService` hosts from the
   * specified namespace (e.g.,`prod/&#42;`).
   * The `namespace` can be set to `*` or `.`, representing any or the current
   * namespace, respectively. For example, `*&#47;foo.example.com` selects the
   * service from any available namespace while `./foo.example.com` only selects
   * the service from the namespace of the sidecar. The default, if no `namespace/`
   * is specified, is `*&#47;`, that is, select services from any namespace.
   * Any associated `DestinationRule` in the selected namespace will also be used.
   * A `VirtualService` must be bound to the gateway and must have one or
   * more hosts that match the hosts specified in a server. The match
   * could be an exact match or a suffix match with the server's hosts. For
   * example, if the server's hosts specifies `*.example.com`, a
   * `VirtualService` with hosts `dev.example.com` or `prod.example.com` will
   * match. However, a `VirtualService` with host `example.com` or
   * `newexample.com` will not match.
   * NOTE: Only virtual services exported to the gateway's namespace
   * (e.g., `exportTo` value of `*`) can be referenced.
   * Private configurations (e.g., `exportTo` set to `.`) will not be
   * available. Refer to the `exportTo` setting in `VirtualService`,
   * `DestinationRule`, and `ServiceEntry` configurations for details.
   * </pre>
   *
   * <code>repeated string hosts = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The hosts at the given index.
   */
  java.lang.String getHosts(int index);
  /**
   * <pre>
   * One or more hosts exposed by this gateway.
   * While typically applicable to
   * HTTP services, it can also be used for TCP services using TLS with SNI.
   * A host is specified as a `dnsName` with an optional `namespace/` prefix.
   * The `dnsName` should be specified using FQDN format, optionally including
   * a wildcard character in the left-most component (e.g., `prod/&#42;.example.com`).
   * Set the `dnsName` to `*` to select all `VirtualService` hosts from the
   * specified namespace (e.g.,`prod/&#42;`).
   * The `namespace` can be set to `*` or `.`, representing any or the current
   * namespace, respectively. For example, `*&#47;foo.example.com` selects the
   * service from any available namespace while `./foo.example.com` only selects
   * the service from the namespace of the sidecar. The default, if no `namespace/`
   * is specified, is `*&#47;`, that is, select services from any namespace.
   * Any associated `DestinationRule` in the selected namespace will also be used.
   * A `VirtualService` must be bound to the gateway and must have one or
   * more hosts that match the hosts specified in a server. The match
   * could be an exact match or a suffix match with the server's hosts. For
   * example, if the server's hosts specifies `*.example.com`, a
   * `VirtualService` with hosts `dev.example.com` or `prod.example.com` will
   * match. However, a `VirtualService` with host `example.com` or
   * `newexample.com` will not match.
   * NOTE: Only virtual services exported to the gateway's namespace
   * (e.g., `exportTo` value of `*`) can be referenced.
   * Private configurations (e.g., `exportTo` set to `.`) will not be
   * available. Refer to the `exportTo` setting in `VirtualService`,
   * `DestinationRule`, and `ServiceEntry` configurations for details.
   * </pre>
   *
   * <code>repeated string hosts = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The bytes of the hosts at the given index.
   */
  com.google.protobuf.ByteString
      getHostsBytes(int index);

  /**
   * <pre>
   * Set of TLS related options that govern the server's behavior. Use
   * these options to control if all http requests should be redirected to
   * https, and the TLS modes to use.
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.ServerTLSSettings tls = 3;</code>
   * @return Whether the tls field is set.
   */
  boolean hasTls();
  /**
   * <pre>
   * Set of TLS related options that govern the server's behavior. Use
   * these options to control if all http requests should be redirected to
   * https, and the TLS modes to use.
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.ServerTLSSettings tls = 3;</code>
   * @return The tls.
   */
  io.ourea.adapter.model.ServerTLSSettings getTls();
  /**
   * <pre>
   * Set of TLS related options that govern the server's behavior. Use
   * these options to control if all http requests should be redirected to
   * https, and the TLS modes to use.
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.ServerTLSSettings tls = 3;</code>
   */
  io.ourea.adapter.model.ServerTLSSettingsOrBuilder getTlsOrBuilder();

  /**
   * <pre>
   * The loopback IP endpoint or Unix domain socket to which traffic should
   * be forwarded to by default. Format should be `127.0.0.1:PORT` or
   * `unix:///path/to/socket` or `unix://&#64;foobar` (Linux abstract namespace).
   * NOT IMPLEMENTED.
   * $hide_from_docs
   * </pre>
   *
   * <code>string default_endpoint = 5;</code>
   * @return The defaultEndpoint.
   */
  java.lang.String getDefaultEndpoint();
  /**
   * <pre>
   * The loopback IP endpoint or Unix domain socket to which traffic should
   * be forwarded to by default. Format should be `127.0.0.1:PORT` or
   * `unix:///path/to/socket` or `unix://&#64;foobar` (Linux abstract namespace).
   * NOT IMPLEMENTED.
   * $hide_from_docs
   * </pre>
   *
   * <code>string default_endpoint = 5;</code>
   * @return The bytes for defaultEndpoint.
   */
  com.google.protobuf.ByteString
      getDefaultEndpointBytes();

  /**
   * <pre>
   * An optional name of the server, when set must be unique across all servers.
   * This will be used for variety of purposes like prefixing stats generated with
   * this name etc.
   * </pre>
   *
   * <code>string name = 6;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * An optional name of the server, when set must be unique across all servers.
   * This will be used for variety of purposes like prefixing stats generated with
   * this name etc.
   * </pre>
   *
   * <code>string name = 6;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
