// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sidecar.proto

package io.ourea.adapter.model.istio;

public interface OutboundTrafficPolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:istio.networking.v1alpha3.OutboundTrafficPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.istio.networking.v1alpha3.OutboundTrafficPolicy.Mode mode = 1;</code>
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();
  /**
   * <code>.istio.networking.v1alpha3.OutboundTrafficPolicy.Mode mode = 1;</code>
   * @return The mode.
   */
  io.ourea.adapter.model.istio.OutboundTrafficPolicy.Mode getMode();

  /**
   * <pre>
   * Specifies the details of the egress proxy to which unknown
   * traffic should be forwarded to from the sidecar. Valid only if
   * the mode is set to ALLOW_ANY. If not specified when the mode is
   * ALLOW_ANY, the sidecar will send the unknown traffic directly to
   * the IP requested by the application.
   * ** NOTE 1**: The specified egress host must be imported in the
   * egress section for the traffic forwarding to work.
   * ** NOTE 2**: An Envoy based egress gateway is unlikely to be able
   * to handle plain text TCP connections forwarded from the sidecar.
   * Envoy's dynamic forward proxy can handle only HTTP and TLS
   * connections.
   * $hide_from_docs
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.Destination egress_proxy = 2;</code>
   * @return Whether the egressProxy field is set.
   */
  boolean hasEgressProxy();
  /**
   * <pre>
   * Specifies the details of the egress proxy to which unknown
   * traffic should be forwarded to from the sidecar. Valid only if
   * the mode is set to ALLOW_ANY. If not specified when the mode is
   * ALLOW_ANY, the sidecar will send the unknown traffic directly to
   * the IP requested by the application.
   * ** NOTE 1**: The specified egress host must be imported in the
   * egress section for the traffic forwarding to work.
   * ** NOTE 2**: An Envoy based egress gateway is unlikely to be able
   * to handle plain text TCP connections forwarded from the sidecar.
   * Envoy's dynamic forward proxy can handle only HTTP and TLS
   * connections.
   * $hide_from_docs
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.Destination egress_proxy = 2;</code>
   * @return The egressProxy.
   */
  io.ourea.adapter.model.istio.Destination getEgressProxy();
  /**
   * <pre>
   * Specifies the details of the egress proxy to which unknown
   * traffic should be forwarded to from the sidecar. Valid only if
   * the mode is set to ALLOW_ANY. If not specified when the mode is
   * ALLOW_ANY, the sidecar will send the unknown traffic directly to
   * the IP requested by the application.
   * ** NOTE 1**: The specified egress host must be imported in the
   * egress section for the traffic forwarding to work.
   * ** NOTE 2**: An Envoy based egress gateway is unlikely to be able
   * to handle plain text TCP connections forwarded from the sidecar.
   * Envoy's dynamic forward proxy can handle only HTTP and TLS
   * connections.
   * $hide_from_docs
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.Destination egress_proxy = 2;</code>
   */
  io.ourea.adapter.model.istio.DestinationOrBuilder getEgressProxyOrBuilder();
}