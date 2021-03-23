// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: virtual_service.proto

package io.ourea.adapter.model.istio;

public interface CorsPolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:istio.networking.v1alpha3.CorsPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of origins that are allowed to perform CORS requests. The
   * content will be serialized into the Access-Control-Allow-Origin
   * header. Wildcard * will allow all origins.
   * $hide_from_docs
   * </pre>
   *
   * <code>repeated string allow_origin = 1 [deprecated = true];</code>
   * @return A list containing the allowOrigin.
   */
  @java.lang.Deprecated java.util.List<java.lang.String>
      getAllowOriginList();
  /**
   * <pre>
   * The list of origins that are allowed to perform CORS requests. The
   * content will be serialized into the Access-Control-Allow-Origin
   * header. Wildcard * will allow all origins.
   * $hide_from_docs
   * </pre>
   *
   * <code>repeated string allow_origin = 1 [deprecated = true];</code>
   * @return The count of allowOrigin.
   */
  @java.lang.Deprecated int getAllowOriginCount();
  /**
   * <pre>
   * The list of origins that are allowed to perform CORS requests. The
   * content will be serialized into the Access-Control-Allow-Origin
   * header. Wildcard * will allow all origins.
   * $hide_from_docs
   * </pre>
   *
   * <code>repeated string allow_origin = 1 [deprecated = true];</code>
   * @param index The index of the element to return.
   * @return The allowOrigin at the given index.
   */
  @java.lang.Deprecated java.lang.String getAllowOrigin(int index);
  /**
   * <pre>
   * The list of origins that are allowed to perform CORS requests. The
   * content will be serialized into the Access-Control-Allow-Origin
   * header. Wildcard * will allow all origins.
   * $hide_from_docs
   * </pre>
   *
   * <code>repeated string allow_origin = 1 [deprecated = true];</code>
   * @param index The index of the value to return.
   * @return The bytes of the allowOrigin at the given index.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getAllowOriginBytes(int index);

  /**
   * <pre>
   * String patterns that match allowed origins.
   * An origin is allowed if any of the string matchers match.
   * If a match is found, then the outgoing Access-Control-Allow-Origin would be set to the origin as provided by the client.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.StringMatch allow_origins = 7;</code>
   */
  java.util.List<io.ourea.adapter.model.istio.StringMatch> 
      getAllowOriginsList();
  /**
   * <pre>
   * String patterns that match allowed origins.
   * An origin is allowed if any of the string matchers match.
   * If a match is found, then the outgoing Access-Control-Allow-Origin would be set to the origin as provided by the client.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.StringMatch allow_origins = 7;</code>
   */
  io.ourea.adapter.model.istio.StringMatch getAllowOrigins(int index);
  /**
   * <pre>
   * String patterns that match allowed origins.
   * An origin is allowed if any of the string matchers match.
   * If a match is found, then the outgoing Access-Control-Allow-Origin would be set to the origin as provided by the client.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.StringMatch allow_origins = 7;</code>
   */
  int getAllowOriginsCount();
  /**
   * <pre>
   * String patterns that match allowed origins.
   * An origin is allowed if any of the string matchers match.
   * If a match is found, then the outgoing Access-Control-Allow-Origin would be set to the origin as provided by the client.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.StringMatch allow_origins = 7;</code>
   */
  java.util.List<? extends io.ourea.adapter.model.istio.StringMatchOrBuilder> 
      getAllowOriginsOrBuilderList();
  /**
   * <pre>
   * String patterns that match allowed origins.
   * An origin is allowed if any of the string matchers match.
   * If a match is found, then the outgoing Access-Control-Allow-Origin would be set to the origin as provided by the client.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.StringMatch allow_origins = 7;</code>
   */
  io.ourea.adapter.model.istio.StringMatchOrBuilder getAllowOriginsOrBuilder(
      int index);

  /**
   * <pre>
   * List of HTTP methods allowed to access the resource. The content will
   * be serialized into the Access-Control-Allow-Methods header.
   * </pre>
   *
   * <code>repeated string allow_methods = 2;</code>
   * @return A list containing the allowMethods.
   */
  java.util.List<java.lang.String>
      getAllowMethodsList();
  /**
   * <pre>
   * List of HTTP methods allowed to access the resource. The content will
   * be serialized into the Access-Control-Allow-Methods header.
   * </pre>
   *
   * <code>repeated string allow_methods = 2;</code>
   * @return The count of allowMethods.
   */
  int getAllowMethodsCount();
  /**
   * <pre>
   * List of HTTP methods allowed to access the resource. The content will
   * be serialized into the Access-Control-Allow-Methods header.
   * </pre>
   *
   * <code>repeated string allow_methods = 2;</code>
   * @param index The index of the element to return.
   * @return The allowMethods at the given index.
   */
  java.lang.String getAllowMethods(int index);
  /**
   * <pre>
   * List of HTTP methods allowed to access the resource. The content will
   * be serialized into the Access-Control-Allow-Methods header.
   * </pre>
   *
   * <code>repeated string allow_methods = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the allowMethods at the given index.
   */
  com.google.protobuf.ByteString
      getAllowMethodsBytes(int index);

  /**
   * <pre>
   * List of HTTP headers that can be used when requesting the
   * resource. Serialized to Access-Control-Allow-Headers header.
   * </pre>
   *
   * <code>repeated string allow_headers = 3;</code>
   * @return A list containing the allowHeaders.
   */
  java.util.List<java.lang.String>
      getAllowHeadersList();
  /**
   * <pre>
   * List of HTTP headers that can be used when requesting the
   * resource. Serialized to Access-Control-Allow-Headers header.
   * </pre>
   *
   * <code>repeated string allow_headers = 3;</code>
   * @return The count of allowHeaders.
   */
  int getAllowHeadersCount();
  /**
   * <pre>
   * List of HTTP headers that can be used when requesting the
   * resource. Serialized to Access-Control-Allow-Headers header.
   * </pre>
   *
   * <code>repeated string allow_headers = 3;</code>
   * @param index The index of the element to return.
   * @return The allowHeaders at the given index.
   */
  java.lang.String getAllowHeaders(int index);
  /**
   * <pre>
   * List of HTTP headers that can be used when requesting the
   * resource. Serialized to Access-Control-Allow-Headers header.
   * </pre>
   *
   * <code>repeated string allow_headers = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the allowHeaders at the given index.
   */
  com.google.protobuf.ByteString
      getAllowHeadersBytes(int index);

  /**
   * <pre>
   * A list of HTTP headers that the browsers are allowed to
   * access. Serialized into Access-Control-Expose-Headers header.
   * </pre>
   *
   * <code>repeated string expose_headers = 4;</code>
   * @return A list containing the exposeHeaders.
   */
  java.util.List<java.lang.String>
      getExposeHeadersList();
  /**
   * <pre>
   * A list of HTTP headers that the browsers are allowed to
   * access. Serialized into Access-Control-Expose-Headers header.
   * </pre>
   *
   * <code>repeated string expose_headers = 4;</code>
   * @return The count of exposeHeaders.
   */
  int getExposeHeadersCount();
  /**
   * <pre>
   * A list of HTTP headers that the browsers are allowed to
   * access. Serialized into Access-Control-Expose-Headers header.
   * </pre>
   *
   * <code>repeated string expose_headers = 4;</code>
   * @param index The index of the element to return.
   * @return The exposeHeaders at the given index.
   */
  java.lang.String getExposeHeaders(int index);
  /**
   * <pre>
   * A list of HTTP headers that the browsers are allowed to
   * access. Serialized into Access-Control-Expose-Headers header.
   * </pre>
   *
   * <code>repeated string expose_headers = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the exposeHeaders at the given index.
   */
  com.google.protobuf.ByteString
      getExposeHeadersBytes(int index);

  /**
   * <pre>
   * Specifies how long the results of a preflight request can be
   * cached. Translates to the `Access-Control-Max-Age` header.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_age = 5;</code>
   * @return Whether the maxAge field is set.
   */
  boolean hasMaxAge();
  /**
   * <pre>
   * Specifies how long the results of a preflight request can be
   * cached. Translates to the `Access-Control-Max-Age` header.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_age = 5;</code>
   * @return The maxAge.
   */
  com.google.protobuf.Duration getMaxAge();
  /**
   * <pre>
   * Specifies how long the results of a preflight request can be
   * cached. Translates to the `Access-Control-Max-Age` header.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_age = 5;</code>
   */
  com.google.protobuf.DurationOrBuilder getMaxAgeOrBuilder();

  /**
   * <pre>
   * Indicates whether the caller is allowed to send the actual request
   * (not the preflight) using credentials. Translates to
   * `Access-Control-Allow-Credentials` header.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue allow_credentials = 6;</code>
   * @return Whether the allowCredentials field is set.
   */
  boolean hasAllowCredentials();
  /**
   * <pre>
   * Indicates whether the caller is allowed to send the actual request
   * (not the preflight) using credentials. Translates to
   * `Access-Control-Allow-Credentials` header.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue allow_credentials = 6;</code>
   * @return The allowCredentials.
   */
  com.google.protobuf.BoolValue getAllowCredentials();
  /**
   * <pre>
   * Indicates whether the caller is allowed to send the actual request
   * (not the preflight) using credentials. Translates to
   * `Access-Control-Allow-Credentials` header.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue allow_credentials = 6;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getAllowCredentialsOrBuilder();
}
