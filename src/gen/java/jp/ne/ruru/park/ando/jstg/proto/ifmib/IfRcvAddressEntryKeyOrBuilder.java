// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/config/snmp/proto/If.proto

package jp.ne.ruru.park.ando.jstg.proto.ifmib;

public interface IfRcvAddressEntryKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ifmib.IfRcvAddressEntryKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 ifRcvAddressStatus = 1;</code>
   *
   * <pre>
   * INTEGER
   * </pre>
   */
  int getIfRcvAddressStatus();

  /**
   * <code>optional bytes ifRcvAddressAddress = 2;</code>
   *
   * <pre>
   * OCTET STRING
   * </pre>
   */
  com.google.protobuf.ByteString getIfRcvAddressAddress();
}
