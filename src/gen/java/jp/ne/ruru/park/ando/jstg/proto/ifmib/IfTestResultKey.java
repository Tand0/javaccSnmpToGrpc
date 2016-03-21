// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/config/snmp/proto/If.proto

package jp.ne.ruru.park.ando.jstg.proto.ifmib;

/**
 * Protobuf type {@code ifmib.IfTestResultKey}
 *
 * <pre>
 * nodeName=ifTestResult
 * access  =read-only
 * </pre>
 */
public  final class IfTestResultKey extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:ifmib.IfTestResultKey)
    IfTestResultKeyOrBuilder {
  // Use IfTestResultKey.newBuilder() to construct.
  private IfTestResultKey(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private IfTestResultKey() {
    ifTestResult_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private IfTestResultKey(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            ifTestResult_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfTestResultKey_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfTestResultKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey.class, jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey.Builder.class);
  }

  public static final int IFTESTRESULT_FIELD_NUMBER = 1;
  private int ifTestResult_;
  /**
   * <code>optional int32 ifTestResult = 1;</code>
   *
   * <pre>
   * INTEGER
   * </pre>
   */
  public int getIfTestResult() {
    return ifTestResult_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (ifTestResult_ != 0) {
      output.writeInt32(1, ifTestResult_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ifTestResult_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, ifTestResult_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ifmib.IfTestResultKey}
   *
   * <pre>
   * nodeName=ifTestResult
   * access  =read-only
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ifmib.IfTestResultKey)
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfTestResultKey_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfTestResultKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey.class, jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey.Builder.class);
    }

    // Construct using jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      ifTestResult_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfTestResultKey_descriptor;
    }

    public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey getDefaultInstanceForType() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey.getDefaultInstance();
    }

    public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey build() {
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey buildPartial() {
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey result = new jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey(this);
      result.ifTestResult_ = ifTestResult_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey) {
        return mergeFrom((jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey other) {
      if (other == jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey.getDefaultInstance()) return this;
      if (other.getIfTestResult() != 0) {
        setIfTestResult(other.getIfTestResult());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int ifTestResult_ ;
    /**
     * <code>optional int32 ifTestResult = 1;</code>
     *
     * <pre>
     * INTEGER
     * </pre>
     */
    public int getIfTestResult() {
      return ifTestResult_;
    }
    /**
     * <code>optional int32 ifTestResult = 1;</code>
     *
     * <pre>
     * INTEGER
     * </pre>
     */
    public Builder setIfTestResult(int value) {
      
      ifTestResult_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 ifTestResult = 1;</code>
     *
     * <pre>
     * INTEGER
     * </pre>
     */
    public Builder clearIfTestResult() {
      
      ifTestResult_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:ifmib.IfTestResultKey)
  }

  // @@protoc_insertion_point(class_scope:ifmib.IfTestResultKey)
  private static final jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey();
  }

  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IfTestResultKey>
      PARSER = new com.google.protobuf.AbstractParser<IfTestResultKey>() {
    public IfTestResultKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new IfTestResultKey(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<IfTestResultKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IfTestResultKey> getParserForType() {
    return PARSER;
  }

  public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestResultKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
