// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: virtual_service.proto

package io.ourea.adapter.model.istio;

public interface TCPRouteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:istio.networking.v1alpha3.TCPRoute)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Match conditions to be satisfied for the rule to be
   * activated. All conditions inside a single match block have AND
   * semantics, while the list of match blocks have OR semantics. The rule
   * is matched if any one of the match blocks succeed.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.L4MatchAttributes match = 1;</code>
   */
  java.util.List<io.ourea.adapter.model.istio.L4MatchAttributes> 
      getMatchList();
  /**
   * <pre>
   * Match conditions to be satisfied for the rule to be
   * activated. All conditions inside a single match block have AND
   * semantics, while the list of match blocks have OR semantics. The rule
   * is matched if any one of the match blocks succeed.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.L4MatchAttributes match = 1;</code>
   */
  io.ourea.adapter.model.istio.L4MatchAttributes getMatch(int index);
  /**
   * <pre>
   * Match conditions to be satisfied for the rule to be
   * activated. All conditions inside a single match block have AND
   * semantics, while the list of match blocks have OR semantics. The rule
   * is matched if any one of the match blocks succeed.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.L4MatchAttributes match = 1;</code>
   */
  int getMatchCount();
  /**
   * <pre>
   * Match conditions to be satisfied for the rule to be
   * activated. All conditions inside a single match block have AND
   * semantics, while the list of match blocks have OR semantics. The rule
   * is matched if any one of the match blocks succeed.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.L4MatchAttributes match = 1;</code>
   */
  java.util.List<? extends io.ourea.adapter.model.istio.L4MatchAttributesOrBuilder> 
      getMatchOrBuilderList();
  /**
   * <pre>
   * Match conditions to be satisfied for the rule to be
   * activated. All conditions inside a single match block have AND
   * semantics, while the list of match blocks have OR semantics. The rule
   * is matched if any one of the match blocks succeed.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.L4MatchAttributes match = 1;</code>
   */
  io.ourea.adapter.model.istio.L4MatchAttributesOrBuilder getMatchOrBuilder(
      int index);

  /**
   * <pre>
   * The destination to which the connection should be forwarded to.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.RouteDestination route = 2;</code>
   */
  java.util.List<io.ourea.adapter.model.istio.RouteDestination> 
      getRouteList();
  /**
   * <pre>
   * The destination to which the connection should be forwarded to.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.RouteDestination route = 2;</code>
   */
  io.ourea.adapter.model.istio.RouteDestination getRoute(int index);
  /**
   * <pre>
   * The destination to which the connection should be forwarded to.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.RouteDestination route = 2;</code>
   */
  int getRouteCount();
  /**
   * <pre>
   * The destination to which the connection should be forwarded to.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.RouteDestination route = 2;</code>
   */
  java.util.List<? extends io.ourea.adapter.model.istio.RouteDestinationOrBuilder> 
      getRouteOrBuilderList();
  /**
   * <pre>
   * The destination to which the connection should be forwarded to.
   * </pre>
   *
   * <code>repeated .istio.networking.v1alpha3.RouteDestination route = 2;</code>
   */
  io.ourea.adapter.model.istio.RouteDestinationOrBuilder getRouteOrBuilder(
      int index);
}