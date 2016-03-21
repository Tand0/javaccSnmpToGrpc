// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/config/snmp/proto/If.proto

package jp.ne.ruru.park.ando.jstg.proto.ifmib;

/**
 * Protobuf type {@code ifmib.IfLinkUpDownTrapEnableKey}
 *
 * <pre>
 * nodeName=ifLinkUpDownTrapEnable
 * access  =read-write
 * </pre>
 */
public  final class IfLinkUpDownTrapEnableKey extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:ifmib.IfLinkUpDownTrapEnableKey)
    IfLinkUpDownTrapEnableKeyOrBuilder {
  // Use IfLinkUpDownTrapEnableKey.newBuilder() to construct.
  private IfLinkUpDownTrapEnableKey(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private IfLinkUpDownTrapEnableKey() {
    ifLinkUpDownTrapEnable_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private IfLinkUpDownTrapEnableKey(
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

            ifLinkUpDownTrapEnable_ = input.readInt32();
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
    return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfLinkUpDownTrapEnableKey_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfLinkUpDownTrapEnableKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey.class, jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey.Builder.class);
  }

  public static final int IFLINKUPDOWNTRAPENABLE_FIELD_NUMBER = 1;
  private int ifLinkUpDownTrapEnable_;
  /**
   * <code>optional int32 ifLinkUpDownTrapEnable = 1;</code>
   *
   * <pre>
   * INTEGER
   * </pre>
   */
  public int getIfLinkUpDownTrapEnable() {
    return ifLinkUpDownTrapEnable_;
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
    if (ifLinkUpDownTrapEnable_ != 0) {
      output.writeInt32(1, ifLinkUpDownTrapEnable_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ifLinkUpDownTrapEnable_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, ifLinkUpDownTrapEnable_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey prototype) {
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
   * Protobuf type {@code ifmib.IfLinkUpDownTrapEnableKey}
   *
   * <pre>
   * nodeName=ifLinkUpDownTrapEnable
   * access  =read-write
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ifmib.IfLinkUpDownTrapEnableKey)
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfLinkUpDownTrapEnableKey_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfLinkUpDownTrapEnableKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey.class, jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey.Builder.class);
    }

    // Construct using jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey.newBuilder()
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
      ifLinkUpDownTrapEnable_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfLinkUpDownTrapEnableKey_descriptor;
    }

    public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey getDefaultInstanceForType() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey.getDefaultInstance();
    }

    public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey build() {
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey buildPartial() {
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey result = new jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey(this);
      result.ifLinkUpDownTrapEnable_ = ifLinkUpDownTrapEnable_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey) {
        return mergeFrom((jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey other) {
      if (other == jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey.getDefaultInstance()) return this;
      if (other.getIfLinkUpDownTrapEnable() != 0) {
        setIfLinkUpDownTrapEnable(other.getIfLinkUpDownTrapEnable());
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
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int ifLinkUpDownTrapEnable_ ;
    /**
     * <code>optional int32 ifLinkUpDownTrapEnable = 1;</code>
     *
     * <pre>
     * INTEGER
     * </pre>
     */
    public int getIfLinkUpDownTrapEnable() {
      return ifLinkUpDownTrapEnable_;
    }
    /**
     * <code>optional int32 ifLinkUpDownTrapEnable = 1;</code>
     *
     * <pre>
     * INTEGER
     * </pre>
     */
    public Builder setIfLinkUpDownTrapEnable(int value) {
      
      ifLinkUpDownTrapEnable_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 ifLinkUpDownTrapEnable = 1;</code>
     *
     * <pre>
     * INTEGER
     * </pre>
     */
    public Builder clearIfLinkUpDownTrapEnable() {
      
      ifLinkUpDownTrapEnable_ = 0;
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


    // @@protoc_insertion_point(builder_scope:ifmib.IfLinkUpDownTrapEnableKey)
  }

  // @@protoc_insertion_point(class_scope:ifmib.IfLinkUpDownTrapEnableKey)
  private static final jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey();
  }

  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IfLinkUpDownTrapEnableKey>
      PARSER = new com.google.protobuf.AbstractParser<IfLinkUpDownTrapEnableKey>() {
    public IfLinkUpDownTrapEnableKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new IfLinkUpDownTrapEnableKey(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<IfLinkUpDownTrapEnableKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IfLinkUpDownTrapEnableKey> getParserForType() {
    return PARSER;
  }

  public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfLinkUpDownTrapEnableKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
