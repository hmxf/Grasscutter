// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReunionPrivilegeInfo.proto

package emu.grasscutter.net.proto;

public final class ReunionPrivilegeInfoOuterClass {
    private ReunionPrivilegeInfoOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface ReunionPrivilegeInfoOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:ReunionPrivilegeInfo)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 EDBAKLDPAAD = 6;</code>
         *
         * @return The eDBAKLDPAAD.
         */
        int getEDBAKLDPAAD();

        /**
         * <code>uint32 NJGIJJIJGCJ = 12;</code>
         *
         * @return The nJGIJJIJGCJ.
         */
        int getNJGIJJIJGCJ();

        /**
         * <code>uint32 privilege_id = 9;</code>
         *
         * @return The privilegeId.
         */
        int getPrivilegeId();
    }
    /**
     *
     *
     * <pre>
     * Obf: KOJNFAKDGFL
     * </pre>
     *
     * Protobuf type {@code ReunionPrivilegeInfo}
     */
    public static final class ReunionPrivilegeInfo extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:ReunionPrivilegeInfo)
            ReunionPrivilegeInfoOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use ReunionPrivilegeInfo.newBuilder() to construct.
        private ReunionPrivilegeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private ReunionPrivilegeInfo() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new ReunionPrivilegeInfo();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ReunionPrivilegeInfo(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
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
                        case 48:
                            {
                                eDBAKLDPAAD_ = input.readUInt32();
                                break;
                            }
                        case 72:
                            {
                                privilegeId_ = input.readUInt32();
                                break;
                            }
                        case 96:
                            {
                                nJGIJJIJGCJ_ = input.readUInt32();
                                break;
                            }
                        default:
                            {
                                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass
                    .internal_static_ReunionPrivilegeInfo_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass
                    .internal_static_ReunionPrivilegeInfo_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.class,
                            emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.Builder
                                    .class);
        }

        public static final int EDBAKLDPAAD_FIELD_NUMBER = 6;
        private int eDBAKLDPAAD_;
        /**
         * <code>uint32 EDBAKLDPAAD = 6;</code>
         *
         * @return The eDBAKLDPAAD.
         */
        @java.lang.Override
        public int getEDBAKLDPAAD() {
            return eDBAKLDPAAD_;
        }

        public static final int NJGIJJIJGCJ_FIELD_NUMBER = 12;
        private int nJGIJJIJGCJ_;
        /**
         * <code>uint32 NJGIJJIJGCJ = 12;</code>
         *
         * @return The nJGIJJIJGCJ.
         */
        @java.lang.Override
        public int getNJGIJJIJGCJ() {
            return nJGIJJIJGCJ_;
        }

        public static final int PRIVILEGE_ID_FIELD_NUMBER = 9;
        private int privilegeId_;
        /**
         * <code>uint32 privilege_id = 9;</code>
         *
         * @return The privilegeId.
         */
        @java.lang.Override
        public int getPrivilegeId() {
            return privilegeId_;
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
        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (eDBAKLDPAAD_ != 0) {
                output.writeUInt32(6, eDBAKLDPAAD_);
            }
            if (privilegeId_ != 0) {
                output.writeUInt32(9, privilegeId_);
            }
            if (nJGIJJIJGCJ_ != 0) {
                output.writeUInt32(12, nJGIJJIJGCJ_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (eDBAKLDPAAD_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(6, eDBAKLDPAAD_);
            }
            if (privilegeId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(9, privilegeId_);
            }
            if (nJGIJJIJGCJ_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(12, nJGIJJIJGCJ_);
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
            if (!(obj
                    instanceof
                    emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo other =
                    (emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo) obj;

            if (getEDBAKLDPAAD() != other.getEDBAKLDPAAD()) return false;
            if (getNJGIJJIJGCJ() != other.getNJGIJJIJGCJ()) return false;
            if (getPrivilegeId() != other.getPrivilegeId()) return false;
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
            hash = (37 * hash) + EDBAKLDPAAD_FIELD_NUMBER;
            hash = (53 * hash) + getEDBAKLDPAAD();
            hash = (37 * hash) + NJGIJJIJGCJ_FIELD_NUMBER;
            hash = (53 * hash) + getNJGIJJIJGCJ();
            hash = (37 * hash) + PRIVILEGE_ID_FIELD_NUMBER;
            hash = (53 * hash) + getPrivilegeId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo
                parseFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(
                emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         *
         *
         * <pre>
         * Obf: KOJNFAKDGFL
         * </pre>
         *
         * Protobuf type {@code ReunionPrivilegeInfo}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:ReunionPrivilegeInfo)
                emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass
                        .internal_static_ReunionPrivilegeInfo_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass
                        .internal_static_ReunionPrivilegeInfo_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.class,
                                emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo
                                        .Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                eDBAKLDPAAD_ = 0;

                nJGIJJIJGCJ_ = 0;

                privilegeId_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass
                        .internal_static_ReunionPrivilegeInfo_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo build() {
                emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo
                    buildPartial() {
                emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo result =
                        new emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo(this);
                result.eDBAKLDPAAD_ = eDBAKLDPAAD_;
                result.nJGIJJIJGCJ_ = nJGIJJIJGCJ_;
                result.privilegeId_ = privilegeId_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index,
                    java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other
                        instanceof
                        emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo other) {
                if (other
                        == emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo
                                .getDefaultInstance()) return this;
                if (other.getEDBAKLDPAAD() != 0) {
                    setEDBAKLDPAAD(other.getEDBAKLDPAAD());
                }
                if (other.getNJGIJJIJGCJ() != 0) {
                    setNJGIJJIJGCJ(other.getNJGIJJIJGCJ());
                }
                if (other.getPrivilegeId() != 0) {
                    setPrivilegeId(other.getPrivilegeId());
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
                emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int eDBAKLDPAAD_;
            /**
             * <code>uint32 EDBAKLDPAAD = 6;</code>
             *
             * @return The eDBAKLDPAAD.
             */
            @java.lang.Override
            public int getEDBAKLDPAAD() {
                return eDBAKLDPAAD_;
            }
            /**
             * <code>uint32 EDBAKLDPAAD = 6;</code>
             *
             * @param value The eDBAKLDPAAD to set.
             * @return This builder for chaining.
             */
            public Builder setEDBAKLDPAAD(int value) {

                eDBAKLDPAAD_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 EDBAKLDPAAD = 6;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearEDBAKLDPAAD() {

                eDBAKLDPAAD_ = 0;
                onChanged();
                return this;
            }

            private int nJGIJJIJGCJ_;
            /**
             * <code>uint32 NJGIJJIJGCJ = 12;</code>
             *
             * @return The nJGIJJIJGCJ.
             */
            @java.lang.Override
            public int getNJGIJJIJGCJ() {
                return nJGIJJIJGCJ_;
            }
            /**
             * <code>uint32 NJGIJJIJGCJ = 12;</code>
             *
             * @param value The nJGIJJIJGCJ to set.
             * @return This builder for chaining.
             */
            public Builder setNJGIJJIJGCJ(int value) {

                nJGIJJIJGCJ_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 NJGIJJIJGCJ = 12;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearNJGIJJIJGCJ() {

                nJGIJJIJGCJ_ = 0;
                onChanged();
                return this;
            }

            private int privilegeId_;
            /**
             * <code>uint32 privilege_id = 9;</code>
             *
             * @return The privilegeId.
             */
            @java.lang.Override
            public int getPrivilegeId() {
                return privilegeId_;
            }
            /**
             * <code>uint32 privilege_id = 9;</code>
             *
             * @param value The privilegeId to set.
             * @return This builder for chaining.
             */
            public Builder setPrivilegeId(int value) {

                privilegeId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 privilege_id = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearPrivilegeId() {

                privilegeId_ = 0;
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

            // @@protoc_insertion_point(builder_scope:ReunionPrivilegeInfo)
        }

        // @@protoc_insertion_point(class_scope:ReunionPrivilegeInfo)
        private static final emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass
                        .ReunionPrivilegeInfo
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo();
        }

        public static emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<ReunionPrivilegeInfo> PARSER =
                new com.google.protobuf.AbstractParser<ReunionPrivilegeInfo>() {
                    @java.lang.Override
                    public ReunionPrivilegeInfo parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new ReunionPrivilegeInfo(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<ReunionPrivilegeInfo> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<ReunionPrivilegeInfo> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.ReunionPrivilegeInfoOuterClass.ReunionPrivilegeInfo
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_ReunionPrivilegeInfo_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_ReunionPrivilegeInfo_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\032ReunionPrivilegeInfo.proto\"V\n\024ReunionP"
                    + "rivilegeInfo\022\023\n\013EDBAKLDPAAD\030\006 \001(\r\022\023\n\013NJG"
                    + "IJJIJGCJ\030\014 \001(\r\022\024\n\014privilege_id\030\t \001(\rB\033\n\031"
                    + "emu.grasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_ReunionPrivilegeInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ReunionPrivilegeInfo_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_ReunionPrivilegeInfo_descriptor,
                        new java.lang.String[] {
                            "EDBAKLDPAAD", "NJGIJJIJGCJ", "PrivilegeId",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}