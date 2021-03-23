// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mcp.proto

package io.ourea.adapter.model.mcp;

public interface RequestResourcesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:istio.mcp.v1alpha1.RequestResources)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The sink node making the request.
   * </pre>
   *
   * <code>.istio.mcp.v1alpha1.SinkNode sink_node = 1;</code>
   * @return Whether the sinkNode field is set.
   */
  boolean hasSinkNode();
  /**
   * <pre>
   * The sink node making the request.
   * </pre>
   *
   * <code>.istio.mcp.v1alpha1.SinkNode sink_node = 1;</code>
   * @return The sinkNode.
   */
  io.ourea.adapter.model.mcp.SinkNode getSinkNode();
  /**
   * <pre>
   * The sink node making the request.
   * </pre>
   *
   * <code>.istio.mcp.v1alpha1.SinkNode sink_node = 1;</code>
   */
  io.ourea.adapter.model.mcp.SinkNodeOrBuilder getSinkNodeOrBuilder();

  /**
   * <pre>
   * Type of resource collection that is being requested, e.g.
   * istio/networking/v1alpha3/VirtualService
   * k8s/&lt;apiVersion&gt;/&lt;kind&gt;
   * </pre>
   *
   * <code>string collection = 2;</code>
   * @return The collection.
   */
  java.lang.String getCollection();
  /**
   * <pre>
   * Type of resource collection that is being requested, e.g.
   * istio/networking/v1alpha3/VirtualService
   * k8s/&lt;apiVersion&gt;/&lt;kind&gt;
   * </pre>
   *
   * <code>string collection = 2;</code>
   * @return The bytes for collection.
   */
  com.google.protobuf.ByteString
      getCollectionBytes();

  /**
   * <pre>
   * When the RequestResources is the first in a stream, the initial_resource_versions must
   * be populated. Otherwise, initial_resource_versions must be omitted. The keys are the
   * resources names of the MCP resources known to the MCP client. The values in the map
   * are the associated resource level version info.
   * </pre>
   *
   * <code>map&lt;string, string&gt; initial_resource_versions = 3;</code>
   */
  int getInitialResourceVersionsCount();
  /**
   * <pre>
   * When the RequestResources is the first in a stream, the initial_resource_versions must
   * be populated. Otherwise, initial_resource_versions must be omitted. The keys are the
   * resources names of the MCP resources known to the MCP client. The values in the map
   * are the associated resource level version info.
   * </pre>
   *
   * <code>map&lt;string, string&gt; initial_resource_versions = 3;</code>
   */
  boolean containsInitialResourceVersions(
      java.lang.String key);
  /**
   * Use {@link #getInitialResourceVersionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getInitialResourceVersions();
  /**
   * <pre>
   * When the RequestResources is the first in a stream, the initial_resource_versions must
   * be populated. Otherwise, initial_resource_versions must be omitted. The keys are the
   * resources names of the MCP resources known to the MCP client. The values in the map
   * are the associated resource level version info.
   * </pre>
   *
   * <code>map&lt;string, string&gt; initial_resource_versions = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getInitialResourceVersionsMap();
  /**
   * <pre>
   * When the RequestResources is the first in a stream, the initial_resource_versions must
   * be populated. Otherwise, initial_resource_versions must be omitted. The keys are the
   * resources names of the MCP resources known to the MCP client. The values in the map
   * are the associated resource level version info.
   * </pre>
   *
   * <code>map&lt;string, string&gt; initial_resource_versions = 3;</code>
   */

  java.lang.String getInitialResourceVersionsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * When the RequestResources is the first in a stream, the initial_resource_versions must
   * be populated. Otherwise, initial_resource_versions must be omitted. The keys are the
   * resources names of the MCP resources known to the MCP client. The values in the map
   * are the associated resource level version info.
   * </pre>
   *
   * <code>map&lt;string, string&gt; initial_resource_versions = 3;</code>
   */

  java.lang.String getInitialResourceVersionsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * When the RequestResources is an ACK or NACK message in response to a previous RequestResources,
   * the response_nonce must be the nonce in the RequestResources. Otherwise response_nonce must
   * be omitted.
   * </pre>
   *
   * <code>string response_nonce = 4;</code>
   * @return The responseNonce.
   */
  java.lang.String getResponseNonce();
  /**
   * <pre>
   * When the RequestResources is an ACK or NACK message in response to a previous RequestResources,
   * the response_nonce must be the nonce in the RequestResources. Otherwise response_nonce must
   * be omitted.
   * </pre>
   *
   * <code>string response_nonce = 4;</code>
   * @return The bytes for responseNonce.
   */
  com.google.protobuf.ByteString
      getResponseNonceBytes();

  /**
   * <pre>
   * This is populated when the previously received resources could not be applied
   * The *message* field in *error_details* provides the source internal error
   * related to the failure.
   * </pre>
   *
   * <code>.google.rpc.Status error_detail = 5;</code>
   * @return Whether the errorDetail field is set.
   */
  boolean hasErrorDetail();
  /**
   * <pre>
   * This is populated when the previously received resources could not be applied
   * The *message* field in *error_details* provides the source internal error
   * related to the failure.
   * </pre>
   *
   * <code>.google.rpc.Status error_detail = 5;</code>
   * @return The errorDetail.
   */
  com.google.rpc.Status getErrorDetail();
  /**
   * <pre>
   * This is populated when the previously received resources could not be applied
   * The *message* field in *error_details* provides the source internal error
   * related to the failure.
   * </pre>
   *
   * <code>.google.rpc.Status error_detail = 5;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorDetailOrBuilder();

  /**
   * <pre>
   * Request an incremental update for the specified collection. The source may choose to
   * honor this request or ignore and and provide a full-state update in the corresponding
   * `Resource` response.
   * </pre>
   *
   * <code>bool incremental = 6;</code>
   * @return The incremental.
   */
  boolean getIncremental();
}