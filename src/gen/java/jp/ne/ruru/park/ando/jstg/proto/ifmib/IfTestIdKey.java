// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/config/snmp/proto/If.proto

package jp.ne.ruru.park.ando.jstg.proto.ifmib;

/**
 * Protobuf type {@code ifmib.IfTestIdKey}
 *
 * <pre>
 * nodeName=ifTestId
 * access  =read-write
 * </pre>
 */
public  final class IfTestIdKey extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:ifmib.IfTestIdKey)
    IfTestIdKeyOrBuilder {
  // Use IfTestIdKey.newBuilder() to construct.
  private IfTestIdKey(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private IfTestIdKey() {
    ifTestId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private IfTestIdKey(
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

            ifTestId_ = input.readInt32();
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
    return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfTestIdKey_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfTestIdKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey.class, jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey.Builder.class);
  }

  public static final int IFTESTID_FIELD_NUMBER = 1;
  private int ifTestId_;
  /**
   * <code>optional int32 ifTestId = 1;</code>
   *
   * <pre>
   * INTEGER
   * </pre>
   */
  public int getIfTestId() {
    return ifTestId_;
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
    if (ifTestId_ != 0) {
      output.writeInt32(1, ifTestId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ifTestId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, ifTestId_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey prototype) {
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
   * Protobuf type {@code ifmib.IfTestIdKey}
   *
   * <pre>
   * nodeName=ifTestId
   * access  =read-write
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ifmib.IfTestIdKey)
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfTestIdKey_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfTestIdKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey.class, jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey.Builder.class);
    }

    // Construct using jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey.newBuilder()
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
      ifTestId_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.If.internal_static_ifmib_IfTestIdKey_descriptor;
    }

    public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey getDefaultInstanceForType() {
      return jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey.getDefaultInstance();
    }

    public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey build() {
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey buildPartial() {
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey result = new jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey(this);
      result.ifTestId_ = ifTestId_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey) {
        return mergeFrom((jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey other) {
      if (other == jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey.getDefaultInstance()) return this;
      if (other.getIfTestId() != 0) {
        setIfTestId(other.getIfTestId());
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
      jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int ifTestId_ ;
    /**
     * <code>optional int32 ifTestId = 1;</code>
     *
     * <pre>
     * INTEGER
     * </pre>
     */
    public int getIfTestId() {
      return ifTestId_;
    }
    /**
     * <code>optional int32 ifTestId = 1;</code>
     *
     * <pre>
     * INTEGER
     * </pre>
     */
    public Builder setIfTestId(int value) {
      
      ifTestId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 ifTestId = 1;</code>
     *
     * <pre>
     * INTEGER
     * </pre>
     */
    public Builder clearIfTestId() {
      
      ifTestId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:ifmib.IfTestIdKey)
  }

  // @@protoc_insertion_point(class_scope:ifmib.IfTestIdKey)
  private static final jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey();
  }

  public static jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IfTestIdKey>
      PARSER = new com.google.protobuf.AbstractParser<IfTestIdKey>() {
    public IfTestIdKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new IfTestIdKey(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<IfTestIdKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IfTestIdKey> getParserForType() {
    return PARSER;
  }

  public jp.ne.ruru.park.ando.jstg.proto.ifmib.IfTestIdKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
