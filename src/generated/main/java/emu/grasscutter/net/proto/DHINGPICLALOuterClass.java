// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DHINGPICLAL.proto

package emu.grasscutter.net.proto;

public final class DHINGPICLALOuterClass {
  private DHINGPICLALOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DHINGPICLALOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DHINGPICLAL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
     */
    java.util.List<emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH> 
        getKGNBECEFKDCList();
    /**
     * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
     */
    emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH getKGNBECEFKDC(int index);
    /**
     * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
     */
    int getKGNBECEFKDCCount();
    /**
     * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFHOrBuilder> 
        getKGNBECEFKDCOrBuilderList();
    /**
     * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
     */
    emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFHOrBuilder getKGNBECEFKDCOrBuilder(
        int index);

    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 schedule_id = 11;</code>
     * @return The scheduleId.
     */
    int getScheduleId();
  }
  /**
   * <pre>
   * CmdId: 28215
   * </pre>
   *
   * Protobuf type {@code DHINGPICLAL}
   */
  public static final class DHINGPICLAL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DHINGPICLAL)
      DHINGPICLALOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DHINGPICLAL.newBuilder() to construct.
    private DHINGPICLAL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DHINGPICLAL() {
      kGNBECEFKDC_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DHINGPICLAL();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DHINGPICLAL(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 42: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                kGNBECEFKDC_ = new java.util.ArrayList<emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH>();
                mutable_bitField0_ |= 0x00000001;
              }
              kGNBECEFKDC_.add(
                  input.readMessage(emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH.parser(), extensionRegistry));
              break;
            }
            case 48: {

              retcode_ = input.readInt32();
              break;
            }
            case 88: {

              scheduleId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          kGNBECEFKDC_ = java.util.Collections.unmodifiableList(kGNBECEFKDC_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DHINGPICLALOuterClass.internal_static_DHINGPICLAL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DHINGPICLALOuterClass.internal_static_DHINGPICLAL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL.class, emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL.Builder.class);
    }

    public static final int KGNBECEFKDC_FIELD_NUMBER = 5;
    private java.util.List<emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH> kGNBECEFKDC_;
    /**
     * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH> getKGNBECEFKDCList() {
      return kGNBECEFKDC_;
    }
    /**
     * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFHOrBuilder> 
        getKGNBECEFKDCOrBuilderList() {
      return kGNBECEFKDC_;
    }
    /**
     * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
     */
    @java.lang.Override
    public int getKGNBECEFKDCCount() {
      return kGNBECEFKDC_.size();
    }
    /**
     * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH getKGNBECEFKDC(int index) {
      return kGNBECEFKDC_.get(index);
    }
    /**
     * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFHOrBuilder getKGNBECEFKDCOrBuilder(
        int index) {
      return kGNBECEFKDC_.get(index);
    }

    public static final int RETCODE_FIELD_NUMBER = 6;
    private int retcode_;
    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 11;
    private int scheduleId_;
    /**
     * <code>uint32 schedule_id = 11;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < kGNBECEFKDC_.size(); i++) {
        output.writeMessage(5, kGNBECEFKDC_.get(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(6, retcode_);
      }
      if (scheduleId_ != 0) {
        output.writeUInt32(11, scheduleId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < kGNBECEFKDC_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, kGNBECEFKDC_.get(i));
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, retcode_);
      }
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, scheduleId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL other = (emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL) obj;

      if (!getKGNBECEFKDCList()
          .equals(other.getKGNBECEFKDCList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getScheduleId()
          != other.getScheduleId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getKGNBECEFKDCCount() > 0) {
        hash = (37 * hash) + KGNBECEFKDC_FIELD_NUMBER;
        hash = (53 * hash) + getKGNBECEFKDCList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 28215
     * </pre>
     *
     * Protobuf type {@code DHINGPICLAL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DHINGPICLAL)
        emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLALOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DHINGPICLALOuterClass.internal_static_DHINGPICLAL_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DHINGPICLALOuterClass.internal_static_DHINGPICLAL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL.class, emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getKGNBECEFKDCFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (kGNBECEFKDCBuilder_ == null) {
          kGNBECEFKDC_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          kGNBECEFKDCBuilder_.clear();
        }
        retcode_ = 0;

        scheduleId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DHINGPICLALOuterClass.internal_static_DHINGPICLAL_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL build() {
        emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL buildPartial() {
        emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL result = new emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL(this);
        int from_bitField0_ = bitField0_;
        if (kGNBECEFKDCBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            kGNBECEFKDC_ = java.util.Collections.unmodifiableList(kGNBECEFKDC_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.kGNBECEFKDC_ = kGNBECEFKDC_;
        } else {
          result.kGNBECEFKDC_ = kGNBECEFKDCBuilder_.build();
        }
        result.retcode_ = retcode_;
        result.scheduleId_ = scheduleId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL) {
          return mergeFrom((emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL other) {
        if (other == emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL.getDefaultInstance()) return this;
        if (kGNBECEFKDCBuilder_ == null) {
          if (!other.kGNBECEFKDC_.isEmpty()) {
            if (kGNBECEFKDC_.isEmpty()) {
              kGNBECEFKDC_ = other.kGNBECEFKDC_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureKGNBECEFKDCIsMutable();
              kGNBECEFKDC_.addAll(other.kGNBECEFKDC_);
            }
            onChanged();
          }
        } else {
          if (!other.kGNBECEFKDC_.isEmpty()) {
            if (kGNBECEFKDCBuilder_.isEmpty()) {
              kGNBECEFKDCBuilder_.dispose();
              kGNBECEFKDCBuilder_ = null;
              kGNBECEFKDC_ = other.kGNBECEFKDC_;
              bitField0_ = (bitField0_ & ~0x00000001);
              kGNBECEFKDCBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getKGNBECEFKDCFieldBuilder() : null;
            } else {
              kGNBECEFKDCBuilder_.addAllMessages(other.kGNBECEFKDC_);
            }
          }
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH> kGNBECEFKDC_ =
        java.util.Collections.emptyList();
      private void ensureKGNBECEFKDCIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          kGNBECEFKDC_ = new java.util.ArrayList<emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH>(kGNBECEFKDC_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH, emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH.Builder, emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFHOrBuilder> kGNBECEFKDCBuilder_;

      /**
       * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH> getKGNBECEFKDCList() {
        if (kGNBECEFKDCBuilder_ == null) {
          return java.util.Collections.unmodifiableList(kGNBECEFKDC_);
        } else {
          return kGNBECEFKDCBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
       */
      public int getKGNBECEFKDCCount() {
        if (kGNBECEFKDCBuilder_ == null) {
          return kGNBECEFKDC_.size();
        } else {
          return kGNBECEFKDCBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
       */
      public emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH getKGNBECEFKDC(int index) {
        if (kGNBECEFKDCBuilder_ == null) {
          return kGNBECEFKDC_.get(index);
        } else {
          return kGNBECEFKDCBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
       */
      public Builder setKGNBECEFKDC(
          int index, emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH value) {
        if (kGNBECEFKDCBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureKGNBECEFKDCIsMutable();
          kGNBECEFKDC_.set(index, value);
          onChanged();
        } else {
          kGNBECEFKDCBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
       */
      public Builder setKGNBECEFKDC(
          int index, emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH.Builder builderForValue) {
        if (kGNBECEFKDCBuilder_ == null) {
          ensureKGNBECEFKDCIsMutable();
          kGNBECEFKDC_.set(index, builderForValue.build());
          onChanged();
        } else {
          kGNBECEFKDCBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
       */
      public Builder addKGNBECEFKDC(emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH value) {
        if (kGNBECEFKDCBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureKGNBECEFKDCIsMutable();
          kGNBECEFKDC_.add(value);
          onChanged();
        } else {
          kGNBECEFKDCBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
       */
      public Builder addKGNBECEFKDC(
          int index, emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH value) {
        if (kGNBECEFKDCBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureKGNBECEFKDCIsMutable();
          kGNBECEFKDC_.add(index, value);
          onChanged();
        } else {
          kGNBECEFKDCBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
       */
      public Builder addKGNBECEFKDC(
          emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH.Builder builderForValue) {
        if (kGNBECEFKDCBuilder_ == null) {
          ensureKGNBECEFKDCIsMutable();
          kGNBECEFKDC_.add(builderForValue.build());
          onChanged();
        } else {
          kGNBECEFKDCBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
       */
      public Builder addKGNBECEFKDC(
          int index, emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH.Builder builderForValue) {
        if (kGNBECEFKDCBuilder_ == null) {
          ensureKGNBECEFKDCIsMutable();
          kGNBECEFKDC_.add(index, builderForValue.build());
          onChanged();
        } else {
          kGNBECEFKDCBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
       */
      public Builder addAllKGNBECEFKDC(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH> values) {
        if (kGNBECEFKDCBuilder_ == null) {
          ensureKGNBECEFKDCIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, kGNBECEFKDC_);
          onChanged();
        } else {
          kGNBECEFKDCBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
       */
      public Builder clearKGNBECEFKDC() {
        if (kGNBECEFKDCBuilder_ == null) {
          kGNBECEFKDC_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          kGNBECEFKDCBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
       */
      public Builder removeKGNBECEFKDC(int index) {
        if (kGNBECEFKDCBuilder_ == null) {
          ensureKGNBECEFKDCIsMutable();
          kGNBECEFKDC_.remove(index);
          onChanged();
        } else {
          kGNBECEFKDCBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
       */
      public emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH.Builder getKGNBECEFKDCBuilder(
          int index) {
        return getKGNBECEFKDCFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
       */
      public emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFHOrBuilder getKGNBECEFKDCOrBuilder(
          int index) {
        if (kGNBECEFKDCBuilder_ == null) {
          return kGNBECEFKDC_.get(index);  } else {
          return kGNBECEFKDCBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFHOrBuilder> 
           getKGNBECEFKDCOrBuilderList() {
        if (kGNBECEFKDCBuilder_ != null) {
          return kGNBECEFKDCBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(kGNBECEFKDC_);
        }
      }
      /**
       * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
       */
      public emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH.Builder addKGNBECEFKDCBuilder() {
        return getKGNBECEFKDCFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH.getDefaultInstance());
      }
      /**
       * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
       */
      public emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH.Builder addKGNBECEFKDCBuilder(
          int index) {
        return getKGNBECEFKDCFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH.getDefaultInstance());
      }
      /**
       * <code>repeated .AIMKBAPHFFH KGNBECEFKDC = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH.Builder> 
           getKGNBECEFKDCBuilderList() {
        return getKGNBECEFKDCFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH, emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH.Builder, emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFHOrBuilder> 
          getKGNBECEFKDCFieldBuilder() {
        if (kGNBECEFKDCBuilder_ == null) {
          kGNBECEFKDCBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH, emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFH.Builder, emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.AIMKBAPHFFHOrBuilder>(
                  kGNBECEFKDC_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          kGNBECEFKDC_ = null;
        }
        return kGNBECEFKDCBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 6;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 11;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 11;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:DHINGPICLAL)
    }

    // @@protoc_insertion_point(class_scope:DHINGPICLAL)
    private static final emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL();
    }

    public static emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DHINGPICLAL>
        PARSER = new com.google.protobuf.AbstractParser<DHINGPICLAL>() {
      @java.lang.Override
      public DHINGPICLAL parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DHINGPICLAL(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DHINGPICLAL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DHINGPICLAL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DHINGPICLALOuterClass.DHINGPICLAL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DHINGPICLAL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DHINGPICLAL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021DHINGPICLAL.proto\032\021AIMKBAPHFFH.proto\"V" +
      "\n\013DHINGPICLAL\022!\n\013KGNBECEFKDC\030\005 \003(\0132\014.AIM" +
      "KBAPHFFH\022\017\n\007retcode\030\006 \001(\005\022\023\n\013schedule_id" +
      "\030\013 \001(\rB\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.getDescriptor(),
        });
    internal_static_DHINGPICLAL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DHINGPICLAL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DHINGPICLAL_descriptor,
        new java.lang.String[] { "KGNBECEFKDC", "Retcode", "ScheduleId", });
    emu.grasscutter.net.proto.AIMKBAPHFFHOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}