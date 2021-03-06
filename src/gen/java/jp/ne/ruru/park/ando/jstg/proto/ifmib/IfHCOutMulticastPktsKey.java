// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/config/snmp/proto/If.proto

package jp.ne.ruru.park.ando.jstg.proto.ifmib;

/**
 * Protobuf type {@code ifmib.IfHCOutMulticastPktsKey}
 *
 * <pre>
 * nodeName=ifHCOutMulticastPkts
 * access  =read-only
 * </pre>
 */
public  final class IfHCOutMulticastPktsKey extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:ifmib.IfHCOutMulticastPktsKey)
    IfHCOutMulticastPktsKeyOrBuilder {
  // Use IfHCOutMulticastPktsKey.newBuilder() to construct.
  private IfHCOutMulticastPktsKey(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private IfHCOutMulticastPktsKey() {
    ifHCOutMulticastPkts_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private IfHCOutMulticastPktsKey(
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

            ifHCOutMulticastPkts_ = input.readUInt64();
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
    return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfHCOutMulticastPktsKey_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfHCOutMulticastPktsKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey.class, jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey.Builder.class);
  }

  public static final int IFHCOUTMULTICASTPKTS_FIELD_NUMBER = 1;
  private long ifHCOutMulticastPkts_;
  /**
   * <code>optional uint64 ifHCOutMulticastPkts = 1;</code>
   *
   * <pre>
   * Counter64
   * </pre>
   */
  public long getIfHCOutMulticastPkts() {
    return ifHCOutMulticastPkts_;
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
    if (ifHCOutMulticastPkts_ != 0L) {
      output.writeUInt64(1, ifHCOutMulticastPkts_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ifHCOutMulticastPkts_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, ifHCOutMulticastPkts_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey prototype) {
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
   * Protobuf type {@code ifmib.IfHCOutMulticastPktsKey}
   *
   * <pre>
   * nodeName=ifHCOutMulticastPkts
   * access  =read-only
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ifmib.IfHCOutMulticastPktsKey)
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfHCOutMulticastPktsKey_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfHCOutMulticastPktsKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey.class, jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey.Builder.class);
    }

    // Construct using jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey.newBuilder()
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
      ifHCOutMulticastPkts_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfHCOutMulticastPktsKey_descriptor;
    }

    public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey getDefaultInstanceForType() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey.getDefaultInstance();
    }

    public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey build() {
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey buildPartial() {
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey result = new jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey(this);
      result.ifHCOutMulticastPkts_ = ifHCOutMulticastPkts_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey) {
        return mergeFrom((jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey other) {
      if (other == jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey.getDefaultInstance()) return this;
      if (other.getIfHCOutMulticastPkts() != 0L) {
        setIfHCOutMulticastPkts(other.getIfHCOutMulticastPkts());
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
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long ifHCOutMulticastPkts_ ;
    /**
     * <code>optional uint64 ifHCOutMulticastPkts = 1;</code>
     *
     * <pre>
     * Counter64
     * </pre>
     */
    public long getIfHCOutMulticastPkts() {
      return ifHCOutMulticastPkts_;
    }
    /**
     * <code>optional uint64 ifHCOutMulticastPkts = 1;</code>
     *
     * <pre>
     * Counter64
     * </pre>
     */
    public Builder setIfHCOutMulticastPkts(long value) {
      
      ifHCOutMulticastPkts_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 ifHCOutMulticastPkts = 1;</code>
     *
     * <pre>
     * Counter64
     * </pre>
     */
    public Builder clearIfHCOutMulticastPkts() {
      
      ifHCOutMulticastPkts_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:ifmib.IfHCOutMulticastPktsKey)
  }

  // @@protoc_insertion_point(class_scope:ifmib.IfHCOutMulticastPktsKey)
  private static final jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey();
  }

  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IfHCOutMulticastPktsKey>
      PARSER = new com.google.protobuf.AbstractParser<IfHCOutMulticastPktsKey>() {
    public IfHCOutMulticastPktsKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new IfHCOutMulticastPktsKey(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<IfHCOutMulticastPktsKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IfHCOutMulticastPktsKey> getParserForType() {
    return PARSER;
  }

  public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfHCOutMulticastPktsKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

