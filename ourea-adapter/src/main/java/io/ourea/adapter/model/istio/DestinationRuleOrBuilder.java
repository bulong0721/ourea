// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: destination_rule.proto

package io.ourea.adapter.model.istio;

public interface DestinationRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:istio.networking.v1alpha3.DestinationRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of a service from the service registry. Service
   * names are looked up from the platform's service registry (e.g.,
   * Kubernetes services, Consul services, etc.) and from the hosts
   * declared by [ServiceEntries](https://istio.io/docs/reference/config/networking/service-entry/#ServiceEntry). Rules defined for
   * services that do not exist in the service registry will be ignored.
   * *Note for Kubernetes users*: When short names are used (e.g. "reviews"
   * instead of "reviews.default.svc.cluster.local"), Istio will interpret
   * the short name based on the namespace of the rule, not the service. A
   * rule in the "default" namespace containing a host "reviews" will be
   * interpreted as "reviews.default.svc.cluster.local", irrespective of
   * the actual namespace associated with the reviews service. _To avoid
   * potential misconfigurations, it is recommended to always use fully
   * qualified domain names over short names._
   * Note that the host field applies to both HTTP and TCP services.
   * </pre>
   *
   * <code>string host = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The host.
   */
  java.lang.String getHost();
  /**
   * <pre>
   * The name of a service from the service registry. Service
   * names are looked up from the platform's service registry (e.g.,
   * Kubernetes services, Consul services, etc.) and from the hosts
   * declared by [ServiceEntries](https://istio.io/docs/reference/config/networking/service-entry/#ServiceEntry). Rules defined for
   * services that do not exist in the service registry will be ignored.
   * *Note for Kubernetes users*: When short names are used (e.g. "reviews"
   * instead of "reviews.default.svc.cluster.local"), Istio will interpret
   * the short name based on the namespace of the rule, not the service. A
   * rule in the "default" namespace containing a host "reviews" will be
   * interpreted as "reviews.default.svc.cluster.local", irrespective of
   * the actual namespace associated with the reviews service. _To avoid
   * potential misconfigurations, it is recommended to always use fully
   * qualified domain names over short names._
   * Note that the host field applies to both HTTP and TCP services.
   * </pre>
   *
   * <code>string host = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for host.
   */
  com.google.protobuf.ByteString
      getHostBytes();

  /**
   * <pre>
   * Traffic policies to apply (load balancing policy, connection pool
   * sizes, outlier detection).
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.TrafficPolicy traffic_policy = 2;</code>
   * @return Whether the trafficPolicy field is set.
   */
  boolean hasTrafficPolicy();
  /**
   * <pre>
   * Traffic policies to apply (load balancing policy, connection pool
   * sizes, outlier detection).
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.TrafficPolicy traffic_policy = 2;</code>
   * @return The trafficPolicy.
   */
  io.ourea.adapter.model.istio.TrafficPolicy getTrafficPolicy();
  /**
   * <pre>
   * Traffic policies to apply (load balancing policy, connection pool
   * sizes, outlier detection).
   * </pre>
   *
   * <code>.istio.networking.v1alpha3.TrafficPolicy traffic_policy = 2;</code>
   */
  io.ourea.adapter.model.istio.TrafficPolicyOrBuilder getTrafficPolicyOrBuilder();

  /**
   * <pre>
   * One or more named sets that represent individual versions of a
   * service. Traffic policies can be overridden at subset level.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.Subset subsets = 3;</code>
   */
  java.util.List<io.ourea.adapter.model.istio.Subset> 
      getSubsetsList();
  /**
   * <pre>
   * One or more named sets that represent individual versions of a
   * service. Traffic policies can be overridden at subset level.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.Subset subsets = 3;</code>
   */
  io.ourea.adapter.model.istio.Subset getSubsets(int index);
  /**
   * <pre>
   * One or more named sets that represent individual versions of a
   * service. Traffic policies can be overridden at subset level.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.Subset subsets = 3;</code>
   */
  int getSubsetsCount();
  /**
   * <pre>
   * One or more named sets that represent individual versions of a
   * service. Traffic policies can be overridden at subset level.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.Subset subsets = 3;</code>
   */
  java.util.List<? extends io.ourea.adapter.model.istio.SubsetOrBuilder> 
      getSubsetsOrBuilderList();
  /**
   * <pre>
   * One or more named sets that represent individual versions of a
   * service. Traffic policies can be overridden at subset level.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.Subset subsets = 3;</code>
   */
  io.ourea.adapter.model.istio.SubsetOrBuilder getSubsetsOrBuilder(
      int index);

  /**
   * <pre>
   * A list of namespaces to which this destination rule is exported.
   * The resolution of a destination rule to apply to a service occurs in the
   * context of a hierarchy of namespaces. Exporting a destination rule allows
   * it to be included in the resolution hierarchy for services in
   * other namespaces. This feature provides a mechanism for service owners
   * and mesh administrators to control the visibility of destination rules
   * across namespace boundaries.
   * If no namespaces are specified then the destination rule is exported to all
   * namespaces by default.
   * The value "." is reserved and defines an export to the same namespace that
   * the destination rule is declared in. Similarly, the value "*" is reserved and
   * defines an export to all namespaces.
   * NOTE: in the current release, the `exportTo` value is restricted to
   * "." or "*" (i.e., the current namespace or all namespaces).
   * </pre>
   *
   * <code>repeated string export_to = 4;</code>
   * @return A list containing the exportTo.
   */
  java.util.List<java.lang.String>
      getExportToList();
  /**
   * <pre>
   * A list of namespaces to which this destination rule is exported.
   * The resolution of a destination rule to apply to a service occurs in the
   * context of a hierarchy of namespaces. Exporting a destination rule allows
   * it to be included in the resolution hierarchy for services in
   * other namespaces. This feature provides a mechanism for service owners
   * and mesh administrators to control the visibility of destination rules
   * across namespace boundaries.
   * If no namespaces are specified then the destination rule is exported to all
   * namespaces by default.
   * The value "." is reserved and defines an export to the same namespace that
   * the destination rule is declared in. Similarly, the value "*" is reserved and
   * defines an export to all namespaces.
   * NOTE: in the current release, the `exportTo` value is restricted to
   * "." or "*" (i.e., the current namespace or all namespaces).
   * </pre>
   *
   * <code>repeated string export_to = 4;</code>
   * @return The count of exportTo.
   */
  int getExportToCount();
  /**
   * <pre>
   * A list of namespaces to which this destination rule is exported.
   * The resolution of a destination rule to apply to a service occurs in the
   * context of a hierarchy of namespaces. Exporting a destination rule allows
   * it to be included in the resolution hierarchy for services in
   * other namespaces. This feature provides a mechanism for service owners
   * and mesh administrators to control the visibility of destination rules
   * across namespace boundaries.
   * If no namespaces are specified then the destination rule is exported to all
   * namespaces by default.
   * The value "." is reserved and defines an export to the same namespace that
   * the destination rule is declared in. Similarly, the value "*" is reserved and
   * defines an export to all namespaces.
   * NOTE: in the current release, the `exportTo` value is restricted to
   * "." or "*" (i.e., the current namespace or all namespaces).
   * </pre>
   *
   * <code>repeated string export_to = 4;</code>
   * @param index The index of the element to return.
   * @return The exportTo at the given index.
   */
  java.lang.String getExportTo(int index);
  /**
   * <pre>
   * A list of namespaces to which this destination rule is exported.
   * The resolution of a destination rule to apply to a service occurs in the
   * context of a hierarchy of namespaces. Exporting a destination rule allows
   * it to be included in the resolution hierarchy for services in
   * other namespaces. This feature provides a mechanism for service owners
   * and mesh administrators to control the visibility of destination rules
   * across namespace boundaries.
   * If no namespaces are specified then the destination rule is exported to all
   * namespaces by default.
   * The value "." is reserved and defines an export to the same namespace that
   * the destination rule is declared in. Similarly, the value "*" is reserved and
   * defines an export to all namespaces.
   * NOTE: in the current release, the `exportTo` value is restricted to
   * "." or "*" (i.e., the current namespace or all namespaces).
   * </pre>
   *
   * <code>repeated string export_to = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the exportTo at the given index.
   */
  com.google.protobuf.ByteString
      getExportToBytes(int index);
}