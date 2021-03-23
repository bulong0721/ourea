// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: virtual_service.proto

package io.ourea.adapter.model.istio;

public interface StringMatchOrBuilder extends
    // @@protoc_insertion_point(interface_extends:istio.networking.v1alpha3.StringMatch)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * exact string match
   * </pre>
   *
   * <code>string exact = 1;</code>
   * @return The exact.
   */
  java.lang.String getExact();
  /**
   * <pre>
   * exact string match
   * </pre>
   *
   * <code>string exact = 1;</code>
   * @return The bytes for exact.
   */
  com.google.protobuf.ByteString
      getExactBytes();

  /**
   * <pre>
   * prefix-based match
   * </pre>
   *
   * <code>string prefix = 2;</code>
   * @return The prefix.
   */
  java.lang.String getPrefix();
  /**
   * <pre>
   * prefix-based match
   * </pre>
   *
   * <code>string prefix = 2;</code>
   * @return The bytes for prefix.
   */
  com.google.protobuf.ByteString
      getPrefixBytes();

  /**
   * <pre>
   * RE2 style regex-based match (https://github.com/google/re2/wiki/Syntax).
   * </pre>
   *
   * <code>string regex = 3;</code>
   * @return The regex.
   */
  java.lang.String getRegex();
  /**
   * <pre>
   * RE2 style regex-based match (https://github.com/google/re2/wiki/Syntax).
   * </pre>
   *
   * <code>string regex = 3;</code>
   * @return The bytes for regex.
   */
  com.google.protobuf.ByteString
      getRegexBytes();

  public io.ourea.adapter.model.istio.StringMatch.MatchTypeCase getMatchTypeCase();
}