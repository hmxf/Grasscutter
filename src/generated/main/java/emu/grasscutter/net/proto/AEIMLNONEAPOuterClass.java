// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AEIMLNONEAP.proto

package emu.grasscutter.net.proto;

public final class AEIMLNONEAPOuterClass {
    private AEIMLNONEAPOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }
    /** Protobuf enum {@code AEIMLNONEAP} */
    public enum AEIMLNONEAP implements com.google.protobuf.ProtocolMessageEnum {
        /** <code>AEIMLNONEAP_PacmanDungeonStopNone = 0;</code> */
        AEIMLNONEAP_PacmanDungeonStopNone(0),
        /** <code>AEIMLNONEAP_PacmanDungeonStopSuccess = 1;</code> */
        AEIMLNONEAP_PacmanDungeonStopSuccess(1),
        /** <code>AEIMLNONEAP_PacmanDungeonStopTimeup = 2;</code> */
        AEIMLNONEAP_PacmanDungeonStopTimeup(2),
        /** <code>AEIMLNONEAP_PacmanDungeonStopClientInterrupt = 3;</code> */
        AEIMLNONEAP_PacmanDungeonStopClientInterrupt(3),
        /** <code>AEIMLNONEAP_PacmanDungeonStopCancel = 4;</code> */
        AEIMLNONEAP_PacmanDungeonStopCancel(4),
        /** <code>AEIMLNONEAP_PacmanDungeonStopActivityClosed = 5;</code> */
        AEIMLNONEAP_PacmanDungeonStopActivityClosed(5),
        /** <code>AEIMLNONEAP_PacmanDungeonStopFail = 6;</code> */
        AEIMLNONEAP_PacmanDungeonStopFail(6),
        UNRECOGNIZED(-1),
        ;

        /** <code>AEIMLNONEAP_PacmanDungeonStopNone = 0;</code> */
        public static final int AEIMLNONEAP_PacmanDungeonStopNone_VALUE = 0;
        /** <code>AEIMLNONEAP_PacmanDungeonStopSuccess = 1;</code> */
        public static final int AEIMLNONEAP_PacmanDungeonStopSuccess_VALUE = 1;
        /** <code>AEIMLNONEAP_PacmanDungeonStopTimeup = 2;</code> */
        public static final int AEIMLNONEAP_PacmanDungeonStopTimeup_VALUE = 2;
        /** <code>AEIMLNONEAP_PacmanDungeonStopClientInterrupt = 3;</code> */
        public static final int AEIMLNONEAP_PacmanDungeonStopClientInterrupt_VALUE = 3;
        /** <code>AEIMLNONEAP_PacmanDungeonStopCancel = 4;</code> */
        public static final int AEIMLNONEAP_PacmanDungeonStopCancel_VALUE = 4;
        /** <code>AEIMLNONEAP_PacmanDungeonStopActivityClosed = 5;</code> */
        public static final int AEIMLNONEAP_PacmanDungeonStopActivityClosed_VALUE = 5;
        /** <code>AEIMLNONEAP_PacmanDungeonStopFail = 6;</code> */
        public static final int AEIMLNONEAP_PacmanDungeonStopFail_VALUE = 6;

        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalArgumentException(
                        "Can't get the number of an unknown enum value.");
            }
            return value;
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @java.lang.Deprecated
        public static AEIMLNONEAP valueOf(int value) {
            return forNumber(value);
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         */
        public static AEIMLNONEAP forNumber(int value) {
            switch (value) {
                case 0:
                    return AEIMLNONEAP_PacmanDungeonStopNone;
                case 1:
                    return AEIMLNONEAP_PacmanDungeonStopSuccess;
                case 2:
                    return AEIMLNONEAP_PacmanDungeonStopTimeup;
                case 3:
                    return AEIMLNONEAP_PacmanDungeonStopClientInterrupt;
                case 4:
                    return AEIMLNONEAP_PacmanDungeonStopCancel;
                case 5:
                    return AEIMLNONEAP_PacmanDungeonStopActivityClosed;
                case 6:
                    return AEIMLNONEAP_PacmanDungeonStopFail;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<AEIMLNONEAP> internalGetValueMap() {
            return internalValueMap;
        }

        private static final com.google.protobuf.Internal.EnumLiteMap<AEIMLNONEAP> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<AEIMLNONEAP>() {
                    public AEIMLNONEAP findValueByNumber(int number) {
                        return AEIMLNONEAP.forNumber(number);
                    }
                };

        public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalStateException(
                        "Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(ordinal());
        }

        public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
            return emu.grasscutter.net.proto.AEIMLNONEAPOuterClass.getDescriptor().getEnumTypes().get(0);
        }

        private static final AEIMLNONEAP[] VALUES = values();

        public static AEIMLNONEAP valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[desc.getIndex()];
        }

        private final int value;

        private AEIMLNONEAP(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:AEIMLNONEAP)
    }

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021AEIMLNONEAP.proto*\272\002\n\013AEIMLNONEAP\022%\n!A"
                    + "EIMLNONEAP_PacmanDungeonStopNone\020\000\022(\n$AE"
                    + "IMLNONEAP_PacmanDungeonStopSuccess\020\001\022\'\n#"
                    + "AEIMLNONEAP_PacmanDungeonStopTimeup\020\002\0220\n"
                    + ",AEIMLNONEAP_PacmanDungeonStopClientInte"
                    + "rrupt\020\003\022\'\n#AEIMLNONEAP_PacmanDungeonStop"
                    + "Cancel\020\004\022/\n+AEIMLNONEAP_PacmanDungeonSto"
                    + "pActivityClosed\020\005\022%\n!AEIMLNONEAP_PacmanD"
                    + "ungeonStopFail\020\006B\033\n\031emu.grasscutter.net."
                    + "protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    }

    // @@protoc_insertion_point(outer_class_scope)
}