// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/config/snmp/proto/If.proto

package jp.ne.ruru.park.ando.jstg.proto.ifmib;

public interface LinkUpKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ifmib.LinkUpKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 ifIndex = 1;</code>
   *
   * <pre>
   * INTEGER
   * </pre>
   */
  int getIfIndex();

  /**
   * <code>optional int32 ifAdminStatus = 2;</code>
   *
   * <pre>
   * INTEGER
   * </pre>
   */
  int getIfAdminStatus();

  /**
   * <code>optional int32 ifOperStatus = 3;</code>
   *
   * <pre>
   * INTEGER
   * </pre>
   */
  int getIfOperStatus();
}