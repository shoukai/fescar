// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: registerTMRequest.proto

package io.seata.codec.protobuf.generated;

public final class RegisterTMRequest {
  private RegisterTMRequest() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_seata_protocol_protobuf_RegisterTMRequestProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_seata_protocol_protobuf_RegisterTMRequestProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027registerTMRequest.proto\022\032io.seata.prot" +
      "ocol.protobuf\032\035abstractIdentifyRequest.p" +
      "roto\"s\n\026RegisterTMRequestProto\022Y\n\027abstra" +
      "ctIdentifyRequest\030\001 \001(\01328.io.seata.proto" +
      "col.protobuf.AbstractIdentifyRequestProt" +
      "oB8\n!io.seata.codec.protobuf.generatedB\021" +
      "RegisterTMRequestP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.seata.codec.protobuf.generated.AbstractIdentifyRequest.getDescriptor(),
        }, assigner);
    internal_static_io_seata_protocol_protobuf_RegisterTMRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_seata_protocol_protobuf_RegisterTMRequestProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_seata_protocol_protobuf_RegisterTMRequestProto_descriptor,
        new java.lang.String[] { "AbstractIdentifyRequest", });
    io.seata.codec.protobuf.generated.AbstractIdentifyRequest.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
