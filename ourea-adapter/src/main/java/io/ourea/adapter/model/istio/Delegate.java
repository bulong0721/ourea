// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: virtual_service.proto

package io.ourea.adapter.model.istio;

/**
 * <pre>
 * Describes the delegate VirtualService.
 * The following routing rules forward the traffic to `/productpage` by a delegate VirtualService named `productpage`,
 * forward the traffic to `/reviews` by a delegate VirtualService named `reviews`.
 * ```yaml
 * apiVersion: networking.istio.io/v1alpha3
 * kind: VirtualService
 * metadata:
 *   name: bookinfo
 * spec:
 *   hosts:
 *   - "bookinfo.com"
 *   gateways:
 *   - mygateway
 *   http:
 *   - match:
 *     - uri:
 *         prefix: "/productpage"
 *     delegate:
 *        name: productpage
 *        namespace: nsA
 *   - match:
 *     - uri:
 *         prefix: "/reviews"
 *     delegate:
 *         name: reviews
 *         namespace: nsB
 * ```
 * ```yaml
 * apiVersion: networking.istio.io/v1alpha3
 * kind: VirtualService
 * metadata:
 *   name: productpage
 *   namespace: nsA
 * spec:
 *   http:
 *   - match:
 *      - uri:
 *         prefix: "/productpage/v1/"
 *     route:
 *     - destination:
 *         host: productpage-v1.nsA.svc.cluster.local
 *   - route:
 *     - destination:
 *         host: productpage.nsA.svc.cluster.local
 * ```
 * ```yaml
 * apiVersion: networking.istio.io/v1alpha3
 * kind: VirtualService
 * metadata:
 *   name: reviews
 *   namespace: nsB
 * spec:
 *   http:
 *   - route:
 *     - destination:
 *         host: reviews.nsB.svc.cluster.local
 * ```
 * </pre>
 *
 * Protobuf type {@code istio.networking.v1alpha3.Delegate}
 */
public final class Delegate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:istio.networking.v1alpha3.Delegate)
    DelegateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Delegate.newBuilder() to construct.
  private Delegate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Delegate() {
    name_ = "";
    namespace_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Delegate();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Delegate(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            namespace_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.ourea.adapter.model.istio.VirtualServiceOuterClass.internal_static_istio_networking_v1alpha3_Delegate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.ourea.adapter.model.istio.VirtualServiceOuterClass.internal_static_istio_networking_v1alpha3_Delegate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.ourea.adapter.model.istio.Delegate.class, io.ourea.adapter.model.istio.Delegate.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Name specifies the name of the delegate VirtualService.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name specifies the name of the delegate VirtualService.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAMESPACE_FIELD_NUMBER = 2;
  private volatile java.lang.Object namespace_;
  /**
   * <pre>
   * Namespace specifies the namespace where the delegate VirtualService resides.
   * By default, it is same to the root's.
   * </pre>
   *
   * <code>string namespace = 2;</code>
   * @return The namespace.
   */
  @java.lang.Override
  public java.lang.String getNamespace() {
    java.lang.Object ref = namespace_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      namespace_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Namespace specifies the namespace where the delegate VirtualService resides.
   * By default, it is same to the root's.
   * </pre>
   *
   * <code>string namespace = 2;</code>
   * @return The bytes for namespace.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNamespaceBytes() {
    java.lang.Object ref = namespace_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      namespace_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getNamespaceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, namespace_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getNamespaceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, namespace_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.ourea.adapter.model.istio.Delegate)) {
      return super.equals(obj);
    }
    io.ourea.adapter.model.istio.Delegate other = (io.ourea.adapter.model.istio.Delegate) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getNamespace()
        .equals(other.getNamespace())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + NAMESPACE_FIELD_NUMBER;
    hash = (53 * hash) + getNamespace().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.ourea.adapter.model.istio.Delegate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.ourea.adapter.model.istio.Delegate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.ourea.adapter.model.istio.Delegate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.ourea.adapter.model.istio.Delegate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.ourea.adapter.model.istio.Delegate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.ourea.adapter.model.istio.Delegate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.ourea.adapter.model.istio.Delegate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.ourea.adapter.model.istio.Delegate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.ourea.adapter.model.istio.Delegate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.ourea.adapter.model.istio.Delegate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.ourea.adapter.model.istio.Delegate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.ourea.adapter.model.istio.Delegate parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.ourea.adapter.model.istio.Delegate prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Describes the delegate VirtualService.
   * The following routing rules forward the traffic to `/productpage` by a delegate VirtualService named `productpage`,
   * forward the traffic to `/reviews` by a delegate VirtualService named `reviews`.
   * ```yaml
   * apiVersion: networking.istio.io/v1alpha3
   * kind: VirtualService
   * metadata:
   *   name: bookinfo
   * spec:
   *   hosts:
   *   - "bookinfo.com"
   *   gateways:
   *   - mygateway
   *   http:
   *   - match:
   *     - uri:
   *         prefix: "/productpage"
   *     delegate:
   *        name: productpage
   *        namespace: nsA
   *   - match:
   *     - uri:
   *         prefix: "/reviews"
   *     delegate:
   *         name: reviews
   *         namespace: nsB
   * ```
   * ```yaml
   * apiVersion: networking.istio.io/v1alpha3
   * kind: VirtualService
   * metadata:
   *   name: productpage
   *   namespace: nsA
   * spec:
   *   http:
   *   - match:
   *      - uri:
   *         prefix: "/productpage/v1/"
   *     route:
   *     - destination:
   *         host: productpage-v1.nsA.svc.cluster.local
   *   - route:
   *     - destination:
   *         host: productpage.nsA.svc.cluster.local
   * ```
   * ```yaml
   * apiVersion: networking.istio.io/v1alpha3
   * kind: VirtualService
   * metadata:
   *   name: reviews
   *   namespace: nsB
   * spec:
   *   http:
   *   - route:
   *     - destination:
   *         host: reviews.nsB.svc.cluster.local
   * ```
   * </pre>
   *
   * Protobuf type {@code istio.networking.v1alpha3.Delegate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:istio.networking.v1alpha3.Delegate)
      io.ourea.adapter.model.istio.DelegateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.ourea.adapter.model.istio.VirtualServiceOuterClass.internal_static_istio_networking_v1alpha3_Delegate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.ourea.adapter.model.istio.VirtualServiceOuterClass.internal_static_istio_networking_v1alpha3_Delegate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.ourea.adapter.model.istio.Delegate.class, io.ourea.adapter.model.istio.Delegate.Builder.class);
    }

    // Construct using io.ourea.adapter.model.istio.Delegate.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      namespace_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.ourea.adapter.model.istio.VirtualServiceOuterClass.internal_static_istio_networking_v1alpha3_Delegate_descriptor;
    }

    @java.lang.Override
    public io.ourea.adapter.model.istio.Delegate getDefaultInstanceForType() {
      return io.ourea.adapter.model.istio.Delegate.getDefaultInstance();
    }

    @java.lang.Override
    public io.ourea.adapter.model.istio.Delegate build() {
      io.ourea.adapter.model.istio.Delegate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.ourea.adapter.model.istio.Delegate buildPartial() {
      io.ourea.adapter.model.istio.Delegate result = new io.ourea.adapter.model.istio.Delegate(this);
      result.name_ = name_;
      result.namespace_ = namespace_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.ourea.adapter.model.istio.Delegate) {
        return mergeFrom((io.ourea.adapter.model.istio.Delegate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.ourea.adapter.model.istio.Delegate other) {
      if (other == io.ourea.adapter.model.istio.Delegate.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getNamespace().isEmpty()) {
        namespace_ = other.namespace_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.ourea.adapter.model.istio.Delegate parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.ourea.adapter.model.istio.Delegate) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Name specifies the name of the delegate VirtualService.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name specifies the name of the delegate VirtualService.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name specifies the name of the delegate VirtualService.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name specifies the name of the delegate VirtualService.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name specifies the name of the delegate VirtualService.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object namespace_ = "";
    /**
     * <pre>
     * Namespace specifies the namespace where the delegate VirtualService resides.
     * By default, it is same to the root's.
     * </pre>
     *
     * <code>string namespace = 2;</code>
     * @return The namespace.
     */
    public java.lang.String getNamespace() {
      java.lang.Object ref = namespace_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        namespace_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Namespace specifies the namespace where the delegate VirtualService resides.
     * By default, it is same to the root's.
     * </pre>
     *
     * <code>string namespace = 2;</code>
     * @return The bytes for namespace.
     */
    public com.google.protobuf.ByteString
        getNamespaceBytes() {
      java.lang.Object ref = namespace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        namespace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Namespace specifies the namespace where the delegate VirtualService resides.
     * By default, it is same to the root's.
     * </pre>
     *
     * <code>string namespace = 2;</code>
     * @param value The namespace to set.
     * @return This builder for chaining.
     */
    public Builder setNamespace(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      namespace_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Namespace specifies the namespace where the delegate VirtualService resides.
     * By default, it is same to the root's.
     * </pre>
     *
     * <code>string namespace = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNamespace() {
      
      namespace_ = getDefaultInstance().getNamespace();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Namespace specifies the namespace where the delegate VirtualService resides.
     * By default, it is same to the root's.
     * </pre>
     *
     * <code>string namespace = 2;</code>
     * @param value The bytes for namespace to set.
     * @return This builder for chaining.
     */
    public Builder setNamespaceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      namespace_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:istio.networking.v1alpha3.Delegate)
  }

  // @@protoc_insertion_point(class_scope:istio.networking.v1alpha3.Delegate)
  private static final io.ourea.adapter.model.istio.Delegate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.ourea.adapter.model.istio.Delegate();
  }

  public static io.ourea.adapter.model.istio.Delegate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Delegate>
      PARSER = new com.google.protobuf.AbstractParser<Delegate>() {
    @java.lang.Override
    public Delegate parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Delegate(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Delegate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Delegate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.ourea.adapter.model.istio.Delegate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
