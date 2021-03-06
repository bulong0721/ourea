// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: virtual_service.proto

package io.ourea.adapter.model.istio;

public interface HTTPRouteDestinationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:istio.networking.v1alpha3.HTTPRouteDestination)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Destination uniquely identifies the instances of a service
   * to which the request/connection should be forwarded to.
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.Destination destination = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the destination field is set.
   */
  boolean hasDestination();
  /**
   * <pre>
   * Destination uniquely identifies the instances of a service
   * to which the request/connection should be forwarded to.
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.Destination destination = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The destination.
   */
  io.ourea.adapter.model.istio.Destination getDestination();
  /**
   * <pre>
   * Destination uniquely identifies the instances of a service
   * to which the request/connection should be forwarded to.
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.Destination destination = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  io.ourea.adapter.model.istio.DestinationOrBuilder getDestinationOrBuilder();

  /**
   * <pre>
   * The proportion of traffic to be forwarded to the service
   * version. (0-100). Sum of weights across destinations SHOULD BE == 100.
   * If there is only one destination in a rule, the weight value is assumed to
   * be 100.
   * </pre>
   *
   * <code>int32 weight = 2;</code>
   * @return The weight.
   */
  int getWeight();

  /**
   * <pre>
   * Header manipulation rules
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.Headers headers = 7;</code>
   * @return Whether the headers field is set.
   */
  boolean hasHeaders();
  /**
   * <pre>
   * Header manipulation rules
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.Headers headers = 7;</code>
   * @return The headers.
   */
  io.ourea.adapter.model.istio.Headers getHeaders();
  /**
   * <pre>
   * Header manipulation rules
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.Headers headers = 7;</code>
   */
  io.ourea.adapter.model.istio.HeadersOrBuilder getHeadersOrBuilder();
}
