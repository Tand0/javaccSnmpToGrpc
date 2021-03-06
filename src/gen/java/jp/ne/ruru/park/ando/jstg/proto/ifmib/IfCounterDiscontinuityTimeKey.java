// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/config/snmp/proto/If.proto

package jp.ne.ruru.park.ando.jstg.proto.ifmib;

/**
 * Protobuf type {@code ifmib.IfCounterDiscontinuityTimeKey}
 *
 * <pre>
 * nodeName=ifCounterDiscontinuityTime
 * access  =read-only
 * </pre>
 */
public  final class IfCounterDiscontinuityTimeKey extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:ifmib.IfCounterDiscontinuityTimeKey)
    IfCounterDiscontinuityTimeKeyOrBuilder {
  // Use IfCounterDiscontinuityTimeKey.newBuilder() to construct.
  private IfCounterDiscontinuityTimeKey(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private IfCounterDiscontinuityTimeKey() {
    ifCounterDiscontinuityTime_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private IfCounterDiscontinuityTimeKey(
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

            ifCounterDiscontinuityTime_ = input.readUInt64();
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
    return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfCounterDiscontinuityTimeKey_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfCounterDiscontinuityTimeKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey.class, jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey.Builder.class);
  }

  public static final int IFCOUNTERDISCONTINUITYTIME_FIELD_NUMBER = 1;
  private long ifCounterDiscontinuityTime_;
  /**
   * <code>optional uint64 ifCounterDiscontinuityTime = 1;</code>
   *
   * <pre>
   * TimeTicks
   * </pre>
   */
  public long getIfCounterDiscontinuityTime() {
    return ifCounterDiscontinuityTime_;
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
    if (ifCounterDiscontinuityTime_ != 0L) {
      output.writeUInt64(1, ifCounterDiscontinuityTime_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ifCounterDiscontinuityTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, ifCounterDiscontinuityTime_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey prototype) {
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
   * Protobuf type {@code ifmib.IfCounterDiscontinuityTimeKey}
   *
   * <pre>
   * nodeName=ifCounterDiscontinuityTime
   * access  =read-only
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ifmib.IfCounterDiscontinuityTimeKey)
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfCounterDiscontinuityTimeKey_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfCounterDiscontinuityTimeKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey.class, jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey.Builder.class);
    }

    // Construct using jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey.newBuilder()
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
      ifCounterDiscontinuityTime_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfCounterDiscontinuityTimeKey_descriptor;
    }

    public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey getDefaultInstanceForType() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey.getDefaultInstance();
    }

    public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey build() {
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey buildPartial() {
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey result = new jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey(this);
      result.ifCounterDiscontinuityTime_ = ifCounterDiscontinuityTime_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey) {
        return mergeFrom((jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey other) {
      if (other == jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey.getDefaultInstance()) return this;
      if (other.getIfCounterDiscontinuityTime() != 0L) {
        setIfCounterDiscontinuityTime(other.getIfCounterDiscontinuityTime());
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
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long ifCounterDiscontinuityTime_ ;
    /**
     * <code>optional uint64 ifCounterDiscontinuityTime = 1;</code>
     *
     * <pre>
     * TimeTicks
     * </pre>
     */
    public long getIfCounterDiscontinuityTime() {
      return ifCounterDiscontinuityTime_;
    }
    /**
     * <code>optional uint64 ifCounterDiscontinuityTime = 1;</code>
     *
     * <pre>
     * TimeTicks
     * </pre>
     */
    public Builder setIfCounterDiscontinuityTime(long value) {
      
      ifCounterDiscontinuityTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 ifCounterDiscontinuityTime = 1;</code>
     *
     * <pre>
     * TimeTicks
     * </pre>
     */
    public Builder clearIfCounterDiscontinuityTime() {
      
      ifCounterDiscontinuityTime_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:ifmib.IfCounterDiscontinuityTimeKey)
  }

  // @@protoc_insertion_point(class_scope:ifmib.IfCounterDiscontinuityTimeKey)
  private static final jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey();
  }

  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IfCounterDiscontinuityTimeKey>
      PARSER = new com.google.protobuf.AbstractParser<IfCounterDiscontinuityTimeKey>() {
    public IfCounterDiscontinuityTimeKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new IfCounterDiscontinuityTimeKey(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<IfCounterDiscontinuityTimeKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IfCounterDiscontinuityTimeKey> getParserForType() {
    return PARSER;
  }

  public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfCounterDiscontinuityTimeKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

