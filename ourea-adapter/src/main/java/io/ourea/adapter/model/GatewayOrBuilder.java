// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gateway.proto

package io.ourea.adapter.model;

public interface GatewayOrBuilder extends
    // @@protoc_insertion_point(interface_extends:istio.networking.v1alpha3.Gateway)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of server specifications.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.Server servers = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<io.ourea.adapter.model.Server> 
      getServersList();
  /**
   * <pre>
   * A list of server specifications.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.Server servers = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  io.ourea.adapter.model.Server getServers(int index);
  /**
   * <pre>
   * A list of server specifications.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.Server servers = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getServersCount();
  /**
   * <pre>
   * A list of server specifications.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.Server servers = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends io.ourea.adapter.model.ServerOrBuilder> 
      getServersOrBuilderList();
  /**
   * <pre>
   * A list of server specifications.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.Server servers = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  io.ourea.adapter.model.ServerOrBuilder getServersOrBuilder(
      int index);

  /**
   * <pre>
   * One or more labels that indicate a specific set of pods/VMs
   * on which this gateway configuration should be applied.
   * By default workloads are searched across all namespaces based on label selectors.
   * This implies that a gateway resource in the namespace "foo" can select pods in
   * the namespace "bar" based on labels.
   * This behavior can be controlled via the `PILOT_SCOPE_GATEWAY_TO_NAMESPACE`
   * environment variable in istiod. If this variable is set
   * to true, the scope of label search is restricted to the configuration
   * namespace in which the the resource is present. In other words, the Gateway
   * resource must reside in the same namespace as the gateway workload
   * instance.
   * If selector is nil, the Gateway will be applied to all workloads.
   * </pre>
   *
   * <code>map&lt;string, string&gt; selector = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getSelectorCount();
  /**
   * <pre>
   * One or more labels that indicate a specific set of pods/VMs
   * on which this gateway configuration should be applied.
   * By default workloads are searched across all namespaces based on label selectors.
   * This implies that a gateway resource in the namespace "foo" can select pods in
   * the namespace "bar" based on labels.
   * This behavior can be controlled via the `PILOT_SCOPE_GATEWAY_TO_NAMESPACE`
   * environment variable in istiod. If this variable is set
   * to true, the scope of label search is restricted to the configuration
   * namespace in which the the resource is present. In other words, the Gateway
   * resource must reside in the same namespace as the gateway workload
   * instance.
   * If selector is nil, the Gateway will be applied to all workloads.
   * </pre>
   *
   * <code>map&lt;string, string&gt; selector = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean containsSelector(
      java.lang.String key);
  /**
   * Use {@link #getSelectorMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getSelector();
  /**
   * <pre>
   * One or more labels that indicate a specific set of pods/VMs
   * on which this gateway configuration should be applied.
   * By default workloads are searched across all namespaces based on label selectors.
   * This implies that a gateway resource in the namespace "foo" can select pods in
   * the namespace "bar" based on labels.
   * This behavior can be controlled via the `PILOT_SCOPE_GATEWAY_TO_NAMESPACE`
   * environment variable in istiod. If this variable is set
   * to true, the scope of label search is restricted to the configuration
   * namespace in which the the resource is present. In other words, the Gateway
   * resource must reside in the same namespace as the gateway workload
   * instance.
   * If selector is nil, the Gateway will be applied to all workloads.
   * </pre>
   *
   * <code>map&lt;string, string&gt; selector = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getSelectorMap();
  /**
   * <pre>
   * One or more labels that indicate a specific set of pods/VMs
   * on which this gateway configuration should be applied.
   * By default workloads are searched across all namespaces based on label selectors.
   * This implies that a gateway resource in the namespace "foo" can select pods in
   * the namespace "bar" based on labels.
   * This behavior can be controlled via the `PILOT_SCOPE_GATEWAY_TO_NAMESPACE`
   * environment variable in istiod. If this variable is set
   * to true, the scope of label search is restricted to the configuration
   * namespace in which the the resource is present. In other words, the Gateway
   * resource must reside in the same namespace as the gateway workload
   * instance.
   * If selector is nil, the Gateway will be applied to all workloads.
   * </pre>
   *
   * <code>map&lt;string, string&gt; selector = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */

  java.lang.String getSelectorOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * One or more labels that indicate a specific set of pods/VMs
   * on which this gateway configuration should be applied.
   * By default workloads are searched across all namespaces based on label selectors.
   * This implies that a gateway resource in the namespace "foo" can select pods in
   * the namespace "bar" based on labels.
   * This behavior can be controlled via the `PILOT_SCOPE_GATEWAY_TO_NAMESPACE`
   * environment variable in istiod. If this variable is set
   * to true, the scope of label search is restricted to the configuration
   * namespace in which the the resource is present. In other words, the Gateway
   * resource must reside in the same namespace as the gateway workload
   * instance.
   * If selector is nil, the Gateway will be applied to all workloads.
   * </pre>
   *
   * <code>map&lt;string, string&gt; selector = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */

  java.lang.String getSelectorOrThrow(
      java.lang.String key);
}