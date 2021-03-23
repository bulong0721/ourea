// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: destination_rule.proto

package io.ourea.adapter.model.istio;

public interface SubsetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:istio.networking.v1alpha3.Subset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the subset. The service name and the subset name can
   * be used for traffic splitting in a route rule.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the subset. The service name and the subset name can
   * be used for traffic splitting in a route rule.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Labels apply a filter over the endpoints of a service in the
   * service registry. See route rules for examples of usage.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Labels apply a filter over the endpoints of a service in the
   * service registry. See route rules for examples of usage.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Labels apply a filter over the endpoints of a service in the
   * service registry. See route rules for examples of usage.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Labels apply a filter over the endpoints of a service in the
   * service registry. See route rules for examples of usage.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */

  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Labels apply a filter over the endpoints of a service in the
   * service registry. See route rules for examples of usage.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */

  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Traffic policies that apply to this subset. Subsets inherit the
   * traffic policies specified at the DestinationRule level. Settings
   * specified at the subset level will override the corresponding settings
   * specified at the DestinationRule level.
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.TrafficPolicy traffic_policy = 3;</code>
   * @return Whether the trafficPolicy field is set.
   */
  boolean hasTrafficPolicy();
  /**
   * <pre>
   * Traffic policies that apply to this subset. Subsets inherit the
   * traffic policies specified at the DestinationRule level. Settings
   * specified at the subset level will override the corresponding settings
   * specified at the DestinationRule level.
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.TrafficPolicy traffic_policy = 3;</code>
   * @return The trafficPolicy.
   */
  io.ourea.adapter.model.istio.TrafficPolicy getTrafficPolicy();
  /**
   * <pre>
   * Traffic policies that apply to this subset. Subsets inherit the
   * traffic policies specified at the DestinationRule level. Settings
   * specified at the subset level will override the corresponding settings
   * specified at the DestinationRule level.
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.TrafficPolicy traffic_policy = 3;</code>
   */
  io.ourea.adapter.model.istio.TrafficPolicyOrBuilder getTrafficPolicyOrBuilder();
}