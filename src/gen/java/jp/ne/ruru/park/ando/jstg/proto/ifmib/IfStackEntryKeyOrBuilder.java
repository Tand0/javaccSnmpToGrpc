// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/config/snmp/proto/If.proto

package jp.ne.ruru.park.ando.jstg.proto.ifmib;

public interface IfStackEntryKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ifmib.IfStackEntryKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int32 ifStackLowerLayer = 1;</code>
   *
   * <pre>
   * Integer32
   * </pre>
   */
  int getIfStackLowerLayer();

  /**
   * <code>optional int32 ifStackHigherLayer = 2;</code>
   *
   * <pre>
   * Integer32
   * </pre>
   */
  int getIfStackHigherLayer();

  /**
   * <code>optional int32 ifStackStatus = 3;</code>
   *
   * <pre>
   * INTEGER
   * </pre>
   */
  int getIfStackStatus();
}
