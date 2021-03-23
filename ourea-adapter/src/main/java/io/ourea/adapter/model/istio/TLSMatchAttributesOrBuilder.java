// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: virtual_service.proto

package io.ourea.adapter.model.istio;

public interface TLSMatchAttributesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:istio.networking.v1alpha3.TLSMatchAttributes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * SNI (server name indicator) to match on. Wildcard prefixes
   * can be used in the SNI value, e.g., *.com will match foo.example.com
   * as well as example.com. An SNI value must be a subset (i.e., fall
   * within the domain) of the corresponding virtual serivce's hosts.
   * </pre>
   *
   * <code>repeated string sni_hosts = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the sniHosts.
   */
  java.util.List<java.lang.String>
      getSniHostsList();
  /**
   * <pre>
   * SNI (server name indicator) to match on. Wildcard prefixes
   * can be used in the SNI value, e.g., *.com will match foo.example.com
   * as well as example.com. An SNI value must be a subset (i.e., fall
   * within the domain) of the corresponding virtual serivce's hosts.
   * </pre>
   *
   * <code>repeated string sni_hosts = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of sniHosts.
   */
  int getSniHostsCount();
  /**
   * <pre>
   * SNI (server name indicator) to match on. Wildcard prefixes
   * can be used in the SNI value, e.g., *.com will match foo.example.com
   * as well as example.com. An SNI value must be a subset (i.e., fall
   * within the domain) of the corresponding virtual serivce's hosts.
   * </pre>
   *
   * <code>repeated string sni_hosts = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The sniHosts at the given index.
   */
  java.lang.String getSniHosts(int index);
  /**
   * <pre>
   * SNI (server name indicator) to match on. Wildcard prefixes
   * can be used in the SNI value, e.g., *.com will match foo.example.com
   * as well as example.com. An SNI value must be a subset (i.e., fall
   * within the domain) of the corresponding virtual serivce's hosts.
   * </pre>
   *
   * <code>repeated string sni_hosts = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The bytes of the sniHosts at the given index.
   */
  com.google.protobuf.ByteString
      getSniHostsBytes(int index);

  /**
   * <pre>
   * IPv4 or IPv6 ip addresses of destination with optional subnet.  E.g.,
   * a.b.c.d/xx form or just a.b.c.d.
   * </pre>
   *
   * <code>repeated string destination_subnets = 2;</code>
   * @return A list containing the destinationSubnets.
   */
  java.util.List<java.lang.String>
      getDestinationSubnetsList();
  /**
   * <pre>
   * IPv4 or IPv6 ip addresses of destination with optional subnet.  E.g.,
   * a.b.c.d/xx form or just a.b.c.d.
   * </pre>
   *
   * <code>repeated string destination_subnets = 2;</code>
   * @return The count of destinationSubnets.
   */
  int getDestinationSubnetsCount();
  /**
   * <pre>
   * IPv4 or IPv6 ip addresses of destination with optional subnet.  E.g.,
   * a.b.c.d/xx form or just a.b.c.d.
   * </pre>
   *
   * <code>repeated string destination_subnets = 2;</code>
   * @param index The index of the element to return.
   * @return The destinationSubnets at the given index.
   */
  java.lang.String getDestinationSubnets(int index);
  /**
   * <pre>
   * IPv4 or IPv6 ip addresses of destination with optional subnet.  E.g.,
   * a.b.c.d/xx form or just a.b.c.d.
   * </pre>
   *
   * <code>repeated string destination_subnets = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the destinationSubnets at the given index.
   */
  com.google.protobuf.ByteString
      getDestinationSubnetsBytes(int index);

  /**
   * <pre>
   * Specifies the port on the host that is being addressed. Many services
   * only expose a single port or label ports with the protocols they
   * support, in these cases it is not required to explicitly select the
   * port.
   * </pre>
   *
   * <code>uint32 port = 3;</code>
   * @return The port.
   */
  int getPort();

  /**
   * <pre>
   * One or more labels that constrain the applicability of a rule to
   * workloads with the given labels. If the VirtualService has a list of
   * gateways specified in the top-level `gateways` field, it should include the reserved gateway
   * `mesh` in order for this field to be applicable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; source_labels = 5;</code>
   */
  int getSourceLabelsCount();
  /**
   * <pre>
   * One or more labels that constrain the applicability of a rule to
   * workloads with the given labels. If the VirtualService has a list of
   * gateways specified in the top-level `gateways` field, it should include the reserved gateway
   * `mesh` in order for this field to be applicable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; source_labels = 5;</code>
   */
  boolean containsSourceLabels(
      java.lang.String key);
  /**
   * Use {@link #getSourceLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getSourceLabels();
  /**
   * <pre>
   * One or more labels that constrain the applicability of a rule to
   * workloads with the given labels. If the VirtualService has a list of
   * gateways specified in the top-level `gateways` field, it should include the reserved gateway
   * `mesh` in order for this field to be applicable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; source_labels = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getSourceLabelsMap();
  /**
   * <pre>
   * One or more labels that constrain the applicability of a rule to
   * workloads with the given labels. If the VirtualService has a list of
   * gateways specified in the top-level `gateways` field, it should include the reserved gateway
   * `mesh` in order for this field to be applicable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; source_labels = 5;</code>
   */

  java.lang.String getSourceLabelsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * One or more labels that constrain the applicability of a rule to
   * workloads with the given labels. If the VirtualService has a list of
   * gateways specified in the top-level `gateways` field, it should include the reserved gateway
   * `mesh` in order for this field to be applicable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; source_labels = 5;</code>
   */

  java.lang.String getSourceLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Names of gateways where the rule should be applied. Gateway names
   * in the top-level `gateways` field of the VirtualService (if any) are overridden. The gateway
   * match is independent of sourceLabels.
   * </pre>
   *
   * <code>repeated string gateways = 6;</code>
   * @return A list containing the gateways.
   */
  java.util.List<java.lang.String>
      getGatewaysList();
  /**
   * <pre>
   * Names of gateways where the rule should be applied. Gateway names
   * in the top-level `gateways` field of the VirtualService (if any) are overridden. The gateway
   * match is independent of sourceLabels.
   * </pre>
   *
   * <code>repeated string gateways = 6;</code>
   * @return The count of gateways.
   */
  int getGatewaysCount();
  /**
   * <pre>
   * Names of gateways where the rule should be applied. Gateway names
   * in the top-level `gateways` field of the VirtualService (if any) are overridden. The gateway
   * match is independent of sourceLabels.
   * </pre>
   *
   * <code>repeated string gateways = 6;</code>
   * @param index The index of the element to return.
   * @return The gateways at the given index.
   */
  java.lang.String getGateways(int index);
  /**
   * <pre>
   * Names of gateways where the rule should be applied. Gateway names
   * in the top-level `gateways` field of the VirtualService (if any) are overridden. The gateway
   * match is independent of sourceLabels.
   * </pre>
   *
   * <code>repeated string gateways = 6;</code>
   * @param index The index of the value to return.
   * @return The bytes of the gateways at the given index.
   */
  com.google.protobuf.ByteString
      getGatewaysBytes(int index);

  /**
   * <pre>
   * Source namespace constraining the applicability of a rule to workloads in that namespace.
   * If the VirtualService has a list of gateways specified in the top-level `gateways` field,
   * it must include the reserved gateway `mesh` for this field to be applicable.
   * </pre>
   *
   * <code>string source_namespace = 7;</code>
   * @return The sourceNamespace.
   */
  java.lang.String getSourceNamespace();
  /**
   * <pre>
   * Source namespace constraining the applicability of a rule to workloads in that namespace.
   * If the VirtualService has a list of gateways specified in the top-level `gateways` field,
   * it must include the reserved gateway `mesh` for this field to be applicable.
   * </pre>
   *
   * <code>string source_namespace = 7;</code>
   * @return The bytes for sourceNamespace.
   */
  com.google.protobuf.ByteString
      getSourceNamespaceBytes();
}