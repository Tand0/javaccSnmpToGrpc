// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/config/snmp/proto/If.proto

package jp.ne.ruru.park.ando.jstg.proto.ifmib;

/**
 * Protobuf type {@code ifmib.IfRcvAddressEntryKey}
 */
public  final class IfRcvAddressEntryKey extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:ifmib.IfRcvAddressEntryKey)
    IfRcvAddressEntryKeyOrBuilder {
  // Use IfRcvAddressEntryKey.newBuilder() to construct.
  private IfRcvAddressEntryKey(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private IfRcvAddressEntryKey() {
    ifRcvAddressStatus_ = 0;
    ifRcvAddressAddress_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private IfRcvAddressEntryKey(
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

            ifRcvAddressStatus_ = input.readInt32();
            break;
          }
          case 18: {

            ifRcvAddressAddress_ = input.readBytes();
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
    return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfRcvAddressEntryKey_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfRcvAddressEntryKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey.class, jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey.Builder.class);
  }

  public static final int IFRCVADDRESSSTATUS_FIELD_NUMBER = 1;
  private int ifRcvAddressStatus_;
  /**
   * <code>optional int32 ifRcvAddressStatus = 1;</code>
   *
   * <pre>
   * INTEGER
   * </pre>
   */
  public int getIfRcvAddressStatus() {
    return ifRcvAddressStatus_;
  }

  public static final int IFRCVADDRESSADDRESS_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString ifRcvAddressAddress_;
  /**
   * <code>optional bytes ifRcvAddressAddress = 2;</code>
   *
   * <pre>
   * OCTET STRING
   * </pre>
   */
  public com.google.protobuf.ByteString getIfRcvAddressAddress() {
    return ifRcvAddressAddress_;
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
    if (ifRcvAddressStatus_ != 0) {
      output.writeInt32(1, ifRcvAddressStatus_);
    }
    if (!ifRcvAddressAddress_.isEmpty()) {
      output.writeBytes(2, ifRcvAddressAddress_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ifRcvAddressStatus_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, ifRcvAddressStatus_);
    }
    if (!ifRcvAddressAddress_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, ifRcvAddressAddress_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey prototype) {
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
   * Protobuf type {@code ifmib.IfRcvAddressEntryKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ifmib.IfRcvAddressEntryKey)
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfRcvAddressEntryKey_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfRcvAddressEntryKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey.class, jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey.Builder.class);
    }

    // Construct using jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey.newBuilder()
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
      ifRcvAddressStatus_ = 0;

      ifRcvAddressAddress_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfRcvAddressEntryKey_descriptor;
    }

    public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey getDefaultInstanceForType() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey.getDefaultInstance();
    }

    public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey build() {
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey buildPartial() {
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey result = new jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey(this);
      result.ifRcvAddressStatus_ = ifRcvAddressStatus_;
      result.ifRcvAddressAddress_ = ifRcvAddressAddress_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey) {
        return mergeFrom((jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey other) {
      if (other == jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey.getDefaultInstance()) return this;
      if (other.getIfRcvAddressStatus() != 0) {
        setIfRcvAddressStatus(other.getIfRcvAddressStatus());
      }
      if (other.getIfRcvAddressAddress() != com.google.protobuf.ByteString.EMPTY) {
        setIfRcvAddressAddress(other.getIfRcvAddressAddress());
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
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int ifRcvAddressStatus_ ;
    /**
     * <code>optional int32 ifRcvAddressStatus = 1;</code>
     *
     * <pre>
     * INTEGER
     * </pre>
     */
    public int getIfRcvAddressStatus() {
      return ifRcvAddressStatus_;
    }
    /**
     * <code>optional int32 ifRcvAddressStatus = 1;</code>
     *
     * <pre>
     * INTEGER
     * </pre>
     */
    public Builder setIfRcvAddressStatus(int value) {
      
      ifRcvAddressStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 ifRcvAddressStatus = 1;</code>
     *
     * <pre>
     * INTEGER
     * </pre>
     */
    public Builder clearIfRcvAddressStatus() {
      
      ifRcvAddressStatus_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString ifRcvAddressAddress_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes ifRcvAddressAddress = 2;</code>
     *
     * <pre>
     * OCTET STRING
     * </pre>
     */
    public com.google.protobuf.ByteString getIfRcvAddressAddress() {
      return ifRcvAddressAddress_;
    }
    /**
     * <code>optional bytes ifRcvAddressAddress = 2;</code>
     *
     * <pre>
     * OCTET STRING
     * </pre>
     */
    public Builder setIfRcvAddressAddress(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ifRcvAddressAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes ifRcvAddressAddress = 2;</code>
     *
     * <pre>
     * OCTET STRING
     * </pre>
     */
    public Builder clearIfRcvAddressAddress() {
      
      ifRcvAddressAddress_ = getDefaultInstance().getIfRcvAddressAddress();
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


    // @@protoc_insertion_point(builder_scope:ifmib.IfRcvAddressEntryKey)
  }

  // @@protoc_insertion_point(class_scope:ifmib.IfRcvAddressEntryKey)
  private static final jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey();
  }

  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IfRcvAddressEntryKey>
      PARSER = new com.google.protobuf.AbstractParser<IfRcvAddressEntryKey>() {
    public IfRcvAddressEntryKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new IfRcvAddressEntryKey(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<IfRcvAddressEntryKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IfRcvAddressEntryKey> getParserForType() {
    return PARSER;
  }

  public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfRcvAddressEntryKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
