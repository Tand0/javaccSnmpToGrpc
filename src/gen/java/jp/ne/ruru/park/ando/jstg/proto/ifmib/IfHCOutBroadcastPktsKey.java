// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/config/snmp/proto/If.proto

package jp.ne.ruru.park.ando.jstg.proto.ifmib;

/**
 * Protobuf type {@code ifmib.IfHCOutBroadcastPktsKey}
 *
 * <pre>
 * nodeName=ifHCOutBroadcastPkts
 * access  =read-only
 * </pre>
 */
public  final class IfHCOutBroadcastPktsKey extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:ifmib.IfHCOutBroadcastPktsKey)
    IfHCOutBroadcastPktsKeyOrBuilder {
  // Use IfHCOutBroadcastPktsKey.newBuilder() to construct.
  private IfHCOutBroadcastPktsKey(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private IfHCOutBroadcastPktsKey() {
    ifHCOutBroadcastPkts_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private IfHCOutBroadcastPktsKey(
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

            ifHCOutBroadcastPkts_ = input.readUInt64();
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
    return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfHCOutBroadcastPktsKey_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfHCOutBroadcastPktsKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey.class, jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey.Builder.class);
  }

  public static final int IFHCOUTBROADCASTPKTS_FIELD_NUMBER = 1;
  private long ifHCOutBroadcastPkts_;
  /**
   * <code>optional uint64 ifHCOutBroadcastPkts = 1;</code>
   *
   * <pre>
   * Counter64
   * </pre>
   */
  public long getIfHCOutBroadcastPkts() {
    return ifHCOutBroadcastPkts_;
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
    if (ifHCOutBroadcastPkts_ != 0L) {
      output.writeUInt64(1, ifHCOutBroadcastPkts_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ifHCOutBroadcastPkts_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, ifHCOutBroadcastPkts_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey prototype) {
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
   * Protobuf type {@code ifmib.IfHCOutBroadcastPktsKey}
   *
   * <pre>
   * nodeName=ifHCOutBroadcastPkts
   * access  =read-only
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ifmib.IfHCOutBroadcastPktsKey)
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfHCOutBroadcastPktsKey_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfHCOutBroadcastPktsKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey.class, jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey.Builder.class);
    }

    // Construct using jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey.newBuilder()
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
      ifHCOutBroadcastPkts_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfHCOutBroadcastPktsKey_descriptor;
    }

    public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey getDefaultInstanceForType() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey.getDefaultInstance();
    }

    public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey build() {
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey buildPartial() {
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey result = new jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey(this);
      result.ifHCOutBroadcastPkts_ = ifHCOutBroadcastPkts_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey) {
        return mergeFrom((jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey other) {
      if (other == jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey.getDefaultInstance()) return this;
      if (other.getIfHCOutBroadcastPkts() != 0L) {
        setIfHCOutBroadcastPkts(other.getIfHCOutBroadcastPkts());
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
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long ifHCOutBroadcastPkts_ ;
    /**
     * <code>optional uint64 ifHCOutBroadcastPkts = 1;</code>
     *
     * <pre>
     * Counter64
     * </pre>
     */
    public long getIfHCOutBroadcastPkts() {
      return ifHCOutBroadcastPkts_;
    }
    /**
     * <code>optional uint64 ifHCOutBroadcastPkts = 1;</code>
     *
     * <pre>
     * Counter64
     * </pre>
     */
    public Builder setIfHCOutBroadcastPkts(long value) {
      
      ifHCOutBroadcastPkts_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 ifHCOutBroadcastPkts = 1;</code>
     *
     * <pre>
     * Counter64
     * </pre>
     */
    public Builder clearIfHCOutBroadcastPkts() {
      
      ifHCOutBroadcastPkts_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:ifmib.IfHCOutBroadcastPktsKey)
  }

  // @@protoc_insertion_point(class_scope:ifmib.IfHCOutBroadcastPktsKey)
  private static final jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey();
  }

  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IfHCOutBroadcastPktsKey>
      PARSER = new com.google.protobuf.AbstractParser<IfHCOutBroadcastPktsKey>() {
    public IfHCOutBroadcastPktsKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new IfHCOutBroadcastPktsKey(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<IfHCOutBroadcastPktsKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IfHCOutBroadcastPktsKey> getParserForType() {
    return PARSER;
  }

  public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutBroadcastPktsKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

