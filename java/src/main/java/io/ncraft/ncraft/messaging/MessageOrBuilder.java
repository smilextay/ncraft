// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ncraft/messaging/message.proto

package io.ncraft.ncraft.messaging;

public interface MessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ncraft.messaging.Message)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>map&lt;string, .mojo.core.Value&gt; attributes = 2;</code>
   */
  int getAttributesCount();
  /**
   * <code>map&lt;string, .mojo.core.Value&gt; attributes = 2;</code>
   */
  boolean containsAttributes(
      java.lang.String key);
  /**
   * Use {@link #getAttributesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.mojolang.mojo.core.Value>
  getAttributes();
  /**
   * <code>map&lt;string, .mojo.core.Value&gt; attributes = 2;</code>
   */
  java.util.Map<java.lang.String, org.mojolang.mojo.core.Value>
  getAttributesMap();
  /**
   * <code>map&lt;string, .mojo.core.Value&gt; attributes = 2;</code>
   */

  org.mojolang.mojo.core.Value getAttributesOrDefault(
      java.lang.String key,
      org.mojolang.mojo.core.Value defaultValue);
  /**
   * <code>map&lt;string, .mojo.core.Value&gt; attributes = 2;</code>
   */

  org.mojolang.mojo.core.Value getAttributesOrThrow(
      java.lang.String key);

  /**
   * <code>string data = 3;</code>
   * @return The data.
   */
  java.lang.String getData();
  /**
   * <code>string data = 3;</code>
   * @return The bytes for data.
   */
  com.google.protobuf.ByteString
      getDataBytes();
}
