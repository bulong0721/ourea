// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: virtual_service.proto

package io.ourea.adapter.model.istio;

/**
 * <pre>
 * PortSelector specifies the number of a port to be used for
 * matching or selection for final routing.
 * </pre>
 *
 * Protobuf type {@code istio.networking.v1alpha3.PortSelector}
 */
public final class PortSelector extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:istio.networking.v1alpha3.PortSelector)
    PortSelectorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PortSelector.newBuilder() to construct.
  private PortSelector(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PortSelector() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PortSelector();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PortSelector(
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
          case 8: {

            number_ = input.readUInt32();
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
    return io.ourea.adapter.model.istio.VirtualServiceOuterClass.internal_static_istio_networking_v1alpha3_PortSelector_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.ourea.adapter.model.istio.VirtualServiceOuterClass.internal_static_istio_networking_v1alpha3_PortSelector_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.ourea.adapter.model.istio.PortSelector.class, io.ourea.adapter.model.istio.PortSelector.Builder.class);
  }

  public static final int NUMBER_FIELD_NUMBER = 1;
  private int number_;
  /**
   * <pre>
   * Valid port number
   * </pre>
   *
   * <code>uint32 number = 1;</code>
   * @return The number.
   */
  @java.lang.Override
  public int getNumber() {
    return number_;
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
    if (number_ != 0) {
      output.writeUInt32(1, number_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (number_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, number_);
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
    if (!(obj instanceof io.ourea.adapter.model.istio.PortSelector)) {
      return super.equals(obj);
    }
    io.ourea.adapter.model.istio.PortSelector other = (io.ourea.adapter.model.istio.PortSelector) obj;

    if (getNumber()
        != other.getNumber()) return false;
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
    hash = (37 * hash) + NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getNumber();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.ourea.adapter.model.istio.PortSelector parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.ourea.adapter.model.istio.PortSelector parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.ourea.adapter.model.istio.PortSelector parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.ourea.adapter.model.istio.PortSelector parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.ourea.adapter.model.istio.PortSelector parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.ourea.adapter.model.istio.PortSelector parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.ourea.adapter.model.istio.PortSelector parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.ourea.adapter.model.istio.PortSelector parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.ourea.adapter.model.istio.PortSelector parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.ourea.adapter.model.istio.PortSelector parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.ourea.adapter.model.istio.PortSelector parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.ourea.adapter.model.istio.PortSelector parseFrom(
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
  public static Builder newBuilder(io.ourea.adapter.model.istio.PortSelector prototype) {
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
   * PortSelector specifies the number of a port to be used for
   * matching or selection for final routing.
   * </pre>
   *
   * Protobuf type {@code istio.networking.v1alpha3.PortSelector}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:istio.networking.v1alpha3.PortSelector)
      io.ourea.adapter.model.istio.PortSelectorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.ourea.adapter.model.istio.VirtualServiceOuterClass.internal_static_istio_networking_v1alpha3_PortSelector_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.ourea.adapter.model.istio.VirtualServiceOuterClass.internal_static_istio_networking_v1alpha3_PortSelector_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.ourea.adapter.model.istio.PortSelector.class, io.ourea.adapter.model.istio.PortSelector.Builder.class);
    }

    // Construct using io.ourea.adapter.model.istio.PortSelector.newBuilder()
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
      number_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.ourea.adapter.model.istio.VirtualServiceOuterClass.internal_static_istio_networking_v1alpha3_PortSelector_descriptor;
    }

    @java.lang.Override
    public io.ourea.adapter.model.istio.PortSelector getDefaultInstanceForType() {
      return io.ourea.adapter.model.istio.PortSelector.getDefaultInstance();
    }

    @java.lang.Override
    public io.ourea.adapter.model.istio.PortSelector build() {
      io.ourea.adapter.model.istio.PortSelector result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.ourea.adapter.model.istio.PortSelector buildPartial() {
      io.ourea.adapter.model.istio.PortSelector result = new io.ourea.adapter.model.istio.PortSelector(this);
      result.number_ = number_;
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
      if (other instanceof io.ourea.adapter.model.istio.PortSelector) {
        return mergeFrom((io.ourea.adapter.model.istio.PortSelector)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.ourea.adapter.model.istio.PortSelector other) {
      if (other == io.ourea.adapter.model.istio.PortSelector.getDefaultInstance()) return this;
      if (other.getNumber() != 0) {
        setNumber(other.getNumber());
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
      io.ourea.adapter.model.istio.PortSelector parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.ourea.adapter.model.istio.PortSelector) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int number_ ;
    /**
     * <pre>
     * Valid port number
     * </pre>
     *
     * <code>uint32 number = 1;</code>
     * @return The number.
     */
    @java.lang.Override
    public int getNumber() {
      return number_;
    }
    /**
     * <pre>
     * Valid port number
     * </pre>
     *
     * <code>uint32 number = 1;</code>
     * @param value The number to set.
     * @return This builder for chaining.
     */
    public Builder setNumber(int value) {
      
      number_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Valid port number
     * </pre>
     *
     * <code>uint32 number = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumber() {
      
      number_ = 0;
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


    // @@protoc_insertion_point(builder_scope:istio.networking.v1alpha3.PortSelector)
  }

  // @@protoc_insertion_point(class_scope:istio.networking.v1alpha3.PortSelector)
  private static final io.ourea.adapter.model.istio.PortSelector DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.ourea.adapter.model.istio.PortSelector();
  }

  public static io.ourea.adapter.model.istio.PortSelector getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PortSelector>
      PARSER = new com.google.protobuf.AbstractParser<PortSelector>() {
    @java.lang.Override
    public PortSelector parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PortSelector(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PortSelector> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PortSelector> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.ourea.adapter.model.istio.PortSelector getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
