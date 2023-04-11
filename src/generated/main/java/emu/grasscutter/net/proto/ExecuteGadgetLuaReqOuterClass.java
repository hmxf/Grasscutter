// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExecuteGadgetLuaReq.proto

package emu.grasscutter.net.proto;

public final class ExecuteGadgetLuaReqOuterClass {
    private ExecuteGadgetLuaReqOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface ExecuteGadgetLuaReqOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:ExecuteGadgetLuaReq)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 param1 = 14;</code>
         *
         * @return The param1.
         */
        int getParam1();

        /**
         * <code>int32 param3 = 5;</code>
         *
         * @return The param3.
         */
        int getParam3();

        /**
         * <code>int32 param2 = 4;</code>
         *
         * @return The param2.
         */
        int getParam2();

        /**
         * <code>uint32 source_entity_id = 9;</code>
         *
         * @return The sourceEntityId.
         */
        int getSourceEntityId();
    }
    /**
     *
     *
     * <pre>
     * Name: CPGCKPFMILP
     * CmdId: 217
     * </pre>
     *
     * Protobuf type {@code ExecuteGadgetLuaReq}
     */
    public static final class ExecuteGadgetLuaReq extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:ExecuteGadgetLuaReq)
            ExecuteGadgetLuaReqOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use ExecuteGadgetLuaReq.newBuilder() to construct.
        private ExecuteGadgetLuaReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private ExecuteGadgetLuaReq() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new ExecuteGadgetLuaReq();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ExecuteGadgetLuaReq(
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
                        case 32:
                            {
                                param2_ = input.readInt32();
                                break;
                            }
                        case 40:
                            {
                                param3_ = input.readInt32();
                                break;
                            }
                        case 72:
                            {
                                sourceEntityId_ = input.readUInt32();
                                break;
                            }
                        case 112:
                            {
                                param1_ = input.readInt32();
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
            return emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass
                    .internal_static_ExecuteGadgetLuaReq_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass
                    .internal_static_ExecuteGadgetLuaReq_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq.class,
                            emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq.Builder
                                    .class);
        }

        public static final int PARAM1_FIELD_NUMBER = 14;
        private int param1_;
        /**
         * <code>int32 param1 = 14;</code>
         *
         * @return The param1.
         */
        @java.lang.Override
        public int getParam1() {
            return param1_;
        }

        public static final int PARAM3_FIELD_NUMBER = 5;
        private int param3_;
        /**
         * <code>int32 param3 = 5;</code>
         *
         * @return The param3.
         */
        @java.lang.Override
        public int getParam3() {
            return param3_;
        }

        public static final int PARAM2_FIELD_NUMBER = 4;
        private int param2_;
        /**
         * <code>int32 param2 = 4;</code>
         *
         * @return The param2.
         */
        @java.lang.Override
        public int getParam2() {
            return param2_;
        }

        public static final int SOURCE_ENTITY_ID_FIELD_NUMBER = 9;
        private int sourceEntityId_;
        /**
         * <code>uint32 source_entity_id = 9;</code>
         *
         * @return The sourceEntityId.
         */
        @java.lang.Override
        public int getSourceEntityId() {
            return sourceEntityId_;
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
            if (param2_ != 0) {
                output.writeInt32(4, param2_);
            }
            if (param3_ != 0) {
                output.writeInt32(5, param3_);
            }
            if (sourceEntityId_ != 0) {
                output.writeUInt32(9, sourceEntityId_);
            }
            if (param1_ != 0) {
                output.writeInt32(14, param1_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (param2_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, param2_);
            }
            if (param3_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(5, param3_);
            }
            if (sourceEntityId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(9, sourceEntityId_);
            }
            if (param1_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(14, param1_);
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
                    instanceof emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq other =
                    (emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq) obj;

            if (getParam1() != other.getParam1()) return false;
            if (getParam3() != other.getParam3()) return false;
            if (getParam2() != other.getParam2()) return false;
            if (getSourceEntityId() != other.getSourceEntityId()) return false;
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
            hash = (37 * hash) + PARAM1_FIELD_NUMBER;
            hash = (53 * hash) + getParam1();
            hash = (37 * hash) + PARAM3_FIELD_NUMBER;
            hash = (53 * hash) + getParam3();
            hash = (37 * hash) + PARAM2_FIELD_NUMBER;
            hash = (53 * hash) + getParam2();
            hash = (37 * hash) + SOURCE_ENTITY_ID_FIELD_NUMBER;
            hash = (53 * hash) + getSourceEntityId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq
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
                emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq prototype) {
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
         * Name: CPGCKPFMILP
         * CmdId: 217
         * </pre>
         *
         * Protobuf type {@code ExecuteGadgetLuaReq}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:ExecuteGadgetLuaReq)
                emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReqOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass
                        .internal_static_ExecuteGadgetLuaReq_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass
                        .internal_static_ExecuteGadgetLuaReq_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq.class,
                                emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq.Builder
                                        .class);
            }

            // Construct using
            // emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq.newBuilder()
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
                param1_ = 0;

                param3_ = 0;

                param2_ = 0;

                sourceEntityId_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass
                        .internal_static_ExecuteGadgetLuaReq_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq build() {
                emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq
                    buildPartial() {
                emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq result =
                        new emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq(this);
                result.param1_ = param1_;
                result.param3_ = param3_;
                result.param2_ = param2_;
                result.sourceEntityId_ = sourceEntityId_;
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
                        emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq other) {
                if (other
                        == emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq
                                .getDefaultInstance()) return this;
                if (other.getParam1() != 0) {
                    setParam1(other.getParam1());
                }
                if (other.getParam3() != 0) {
                    setParam3(other.getParam3());
                }
                if (other.getParam2() != 0) {
                    setParam2(other.getParam2());
                }
                if (other.getSourceEntityId() != 0) {
                    setSourceEntityId(other.getSourceEntityId());
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
                emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq parsedMessage =
                        null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int param1_;
            /**
             * <code>int32 param1 = 14;</code>
             *
             * @return The param1.
             */
            @java.lang.Override
            public int getParam1() {
                return param1_;
            }
            /**
             * <code>int32 param1 = 14;</code>
             *
             * @param value The param1 to set.
             * @return This builder for chaining.
             */
            public Builder setParam1(int value) {

                param1_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 param1 = 14;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearParam1() {

                param1_ = 0;
                onChanged();
                return this;
            }

            private int param3_;
            /**
             * <code>int32 param3 = 5;</code>
             *
             * @return The param3.
             */
            @java.lang.Override
            public int getParam3() {
                return param3_;
            }
            /**
             * <code>int32 param3 = 5;</code>
             *
             * @param value The param3 to set.
             * @return This builder for chaining.
             */
            public Builder setParam3(int value) {

                param3_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 param3 = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearParam3() {

                param3_ = 0;
                onChanged();
                return this;
            }

            private int param2_;
            /**
             * <code>int32 param2 = 4;</code>
             *
             * @return The param2.
             */
            @java.lang.Override
            public int getParam2() {
                return param2_;
            }
            /**
             * <code>int32 param2 = 4;</code>
             *
             * @param value The param2 to set.
             * @return This builder for chaining.
             */
            public Builder setParam2(int value) {

                param2_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 param2 = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearParam2() {

                param2_ = 0;
                onChanged();
                return this;
            }

            private int sourceEntityId_;
            /**
             * <code>uint32 source_entity_id = 9;</code>
             *
             * @return The sourceEntityId.
             */
            @java.lang.Override
            public int getSourceEntityId() {
                return sourceEntityId_;
            }
            /**
             * <code>uint32 source_entity_id = 9;</code>
             *
             * @param value The sourceEntityId to set.
             * @return This builder for chaining.
             */
            public Builder setSourceEntityId(int value) {

                sourceEntityId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 source_entity_id = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearSourceEntityId() {

                sourceEntityId_ = 0;
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

            // @@protoc_insertion_point(builder_scope:ExecuteGadgetLuaReq)
        }

        // @@protoc_insertion_point(class_scope:ExecuteGadgetLuaReq)
        private static final emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq();
        }

        public static emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<ExecuteGadgetLuaReq> PARSER =
                new com.google.protobuf.AbstractParser<ExecuteGadgetLuaReq>() {
                    @java.lang.Override
                    public ExecuteGadgetLuaReq parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new ExecuteGadgetLuaReq(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<ExecuteGadgetLuaReq> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<ExecuteGadgetLuaReq> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.ExecuteGadgetLuaReqOuterClass.ExecuteGadgetLuaReq
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_ExecuteGadgetLuaReq_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_ExecuteGadgetLuaReq_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\031ExecuteGadgetLuaReq.proto\"_\n\023ExecuteGa"
                    + "dgetLuaReq\022\016\n\006param1\030\016 \001(\005\022\016\n\006param3\030\005 \001"
                    + "(\005\022\016\n\006param2\030\004 \001(\005\022\030\n\020source_entity_id\030\t"
                    + " \001(\rB\033\n\031emu.grasscutter.net.protob\006proto"
                    + "3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_ExecuteGadgetLuaReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ExecuteGadgetLuaReq_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_ExecuteGadgetLuaReq_descriptor,
                        new java.lang.String[] {
                            "Param1", "Param3", "Param2", "SourceEntityId",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
