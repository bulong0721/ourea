// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: destination_rule.proto

package io.ourea.adapter.model.istio;

public interface OutlierDetectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:istio.networking.v1alpha3.OutlierDetection)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Number of errors before a host is ejected from the connection
   * pool. Defaults to 5. When the upstream host is accessed over HTTP, a
   * 502, 503, or 504 return code qualifies as an error. When the upstream host
   * is accessed over an opaque TCP connection, connect timeouts and
   * connection error/failure events qualify as an error.
   * $hide_from_docs
   * </pre>
   *
   * <code>int32 consecutive_errors = 1 [deprecated = true];</code>
   * @return The consecutiveErrors.
   */
  @java.lang.Deprecated int getConsecutiveErrors();

  /**
   * <pre>
   * Number of gateway errors before a host is ejected from the connection pool.
   * When the upstream host is accessed over HTTP, a 502, 503, or 504 return
   * code qualifies as a gateway error. When the upstream host is accessed over
   * an opaque TCP connection, connect timeouts and connection error/failure
   * events qualify as a gateway error.
   * This feature is disabled by default or when set to the value 0.
   * Note that consecutive_gateway_errors and consecutive_5xx_errors can be
   * used separately or together. Because the errors counted by
   * consecutive_gateway_errors are also included in consecutive_5xx_errors,
   * if the value of consecutive_gateway_errors is greater than or equal to
   * the value of consecutive_5xx_errors, consecutive_gateway_errors will have
   * no effect.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value consecutive_gateway_errors = 6;</code>
   * @return Whether the consecutiveGatewayErrors field is set.
   */
  boolean hasConsecutiveGatewayErrors();
  /**
   * <pre>
   * Number of gateway errors before a host is ejected from the connection pool.
   * When the upstream host is accessed over HTTP, a 502, 503, or 504 return
   * code qualifies as a gateway error. When the upstream host is accessed over
   * an opaque TCP connection, connect timeouts and connection error/failure
   * events qualify as a gateway error.
   * This feature is disabled by default or when set to the value 0.
   * Note that consecutive_gateway_errors and consecutive_5xx_errors can be
   * used separately or together. Because the errors counted by
   * consecutive_gateway_errors are also included in consecutive_5xx_errors,
   * if the value of consecutive_gateway_errors is greater than or equal to
   * the value of consecutive_5xx_errors, consecutive_gateway_errors will have
   * no effect.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value consecutive_gateway_errors = 6;</code>
   * @return The consecutiveGatewayErrors.
   */
  com.google.protobuf.UInt32Value getConsecutiveGatewayErrors();
  /**
   * <pre>
   * Number of gateway errors before a host is ejected from the connection pool.
   * When the upstream host is accessed over HTTP, a 502, 503, or 504 return
   * code qualifies as a gateway error. When the upstream host is accessed over
   * an opaque TCP connection, connect timeouts and connection error/failure
   * events qualify as a gateway error.
   * This feature is disabled by default or when set to the value 0.
   * Note that consecutive_gateway_errors and consecutive_5xx_errors can be
   * used separately or together. Because the errors counted by
   * consecutive_gateway_errors are also included in consecutive_5xx_errors,
   * if the value of consecutive_gateway_errors is greater than or equal to
   * the value of consecutive_5xx_errors, consecutive_gateway_errors will have
   * no effect.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value consecutive_gateway_errors = 6;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getConsecutiveGatewayErrorsOrBuilder();

  /**
   * <pre>
   * Number of 5xx errors before a host is ejected from the connection pool.
   * When the upstream host is accessed over an opaque TCP connection, connect
   * timeouts, connection error/failure and request failure events qualify as a
   * 5xx error.
   * This feature defaults to 5 but can be disabled by setting the value to 0.
   * Note that consecutive_gateway_errors and consecutive_5xx_errors can be
   * used separately or together. Because the errors counted by
   * consecutive_gateway_errors are also included in consecutive_5xx_errors,
   * if the value of consecutive_gateway_errors is greater than or equal to
   * the value of consecutive_5xx_errors, consecutive_gateway_errors will have
   * no effect.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value consecutive_5xx_errors = 7;</code>
   * @return Whether the consecutive5xxErrors field is set.
   */
  boolean hasConsecutive5XxErrors();
  /**
   * <pre>
   * Number of 5xx errors before a host is ejected from the connection pool.
   * When the upstream host is accessed over an opaque TCP connection, connect
   * timeouts, connection error/failure and request failure events qualify as a
   * 5xx error.
   * This feature defaults to 5 but can be disabled by setting the value to 0.
   * Note that consecutive_gateway_errors and consecutive_5xx_errors can be
   * used separately or together. Because the errors counted by
   * consecutive_gateway_errors are also included in consecutive_5xx_errors,
   * if the value of consecutive_gateway_errors is greater than or equal to
   * the value of consecutive_5xx_errors, consecutive_gateway_errors will have
   * no effect.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value consecutive_5xx_errors = 7;</code>
   * @return The consecutive5xxErrors.
   */
  com.google.protobuf.UInt32Value getConsecutive5XxErrors();
  /**
   * <pre>
   * Number of 5xx errors before a host is ejected from the connection pool.
   * When the upstream host is accessed over an opaque TCP connection, connect
   * timeouts, connection error/failure and request failure events qualify as a
   * 5xx error.
   * This feature defaults to 5 but can be disabled by setting the value to 0.
   * Note that consecutive_gateway_errors and consecutive_5xx_errors can be
   * used separately or together. Because the errors counted by
   * consecutive_gateway_errors are also included in consecutive_5xx_errors,
   * if the value of consecutive_gateway_errors is greater than or equal to
   * the value of consecutive_5xx_errors, consecutive_gateway_errors will have
   * no effect.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value consecutive_5xx_errors = 7;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getConsecutive5XxErrorsOrBuilder();

  /**
   * <pre>
   * Time interval between ejection sweep analysis. format:
   * 1h/1m/1s/1ms. MUST BE &gt;=1ms. Default is 10s.
   * </pre>
   *
   * <code>.google.protobuf.Duration interval = 2;</code>
   * @return Whether the interval field is set.
   */
  boolean hasInterval();
  /**
   * <pre>
   * Time interval between ejection sweep analysis. format:
   * 1h/1m/1s/1ms. MUST BE &gt;=1ms. Default is 10s.
   * </pre>
   *
   * <code>.google.protobuf.Duration interval = 2;</code>
   * @return The interval.
   */
  com.google.protobuf.Duration getInterval();
  /**
   * <pre>
   * Time interval between ejection sweep analysis. format:
   * 1h/1m/1s/1ms. MUST BE &gt;=1ms. Default is 10s.
   * </pre>
   *
   * <code>.google.protobuf.Duration interval = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getIntervalOrBuilder();

  /**
   * <pre>
   * Minimum ejection duration. A host will remain ejected for a period
   * equal to the product of minimum ejection duration and the number of
   * times the host has been ejected. This technique allows the system to
   * automatically increase the ejection period for unhealthy upstream
   * servers. format: 1h/1m/1s/1ms. MUST BE &gt;=1ms. Default is 30s.
   * </pre>
   *
   * <code>.google.protobuf.Duration base_ejection_time = 3;</code>
   * @return Whether the baseEjectionTime field is set.
   */
  boolean hasBaseEjectionTime();
  /**
   * <pre>
   * Minimum ejection duration. A host will remain ejected for a period
   * equal to the product of minimum ejection duration and the number of
   * times the host has been ejected. This technique allows the system to
   * automatically increase the ejection period for unhealthy upstream
   * servers. format: 1h/1m/1s/1ms. MUST BE &gt;=1ms. Default is 30s.
   * </pre>
   *
   * <code>.google.protobuf.Duration base_ejection_time = 3;</code>
   * @return The baseEjectionTime.
   */
  com.google.protobuf.Duration getBaseEjectionTime();
  /**
   * <pre>
   * Minimum ejection duration. A host will remain ejected for a period
   * equal to the product of minimum ejection duration and the number of
   * times the host has been ejected. This technique allows the system to
   * automatically increase the ejection period for unhealthy upstream
   * servers. format: 1h/1m/1s/1ms. MUST BE &gt;=1ms. Default is 30s.
   * </pre>
   *
   * <code>.google.protobuf.Duration base_ejection_time = 3;</code>
   */
  com.google.protobuf.DurationOrBuilder getBaseEjectionTimeOrBuilder();

  /**
   * <pre>
   * Maximum % of hosts in the load balancing pool for the upstream
   * service that can be ejected. Defaults to 10%.
   * </pre>
   *
   * <code>int32 max_ejection_percent = 4;</code>
   * @return The maxEjectionPercent.
   */
  int getMaxEjectionPercent();

  /**
   * <pre>
   * Outlier detection will be enabled as long as the associated load balancing
   * pool has at least min_health_percent hosts in healthy mode. When the
   * percentage of healthy hosts in the load balancing pool drops below this
   * threshold, outlier detection will be disabled and the proxy will load balance
   * across all hosts in the pool (healthy and unhealthy). The threshold can be
   * disabled by setting it to 0%. The default is 0% as it's not typically
   * applicable in k8s environments with few pods per service.
   * </pre>
   *
   * <code>int32 min_health_percent = 5;</code>
   * @return The minHealthPercent.
   */
  int getMinHealthPercent();
}
