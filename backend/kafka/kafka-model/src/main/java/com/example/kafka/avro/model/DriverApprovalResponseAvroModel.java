/**
 * Autogenerated by Avro
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package com.example.kafka.avro.model;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;

@org.apache.avro.specific.AvroGenerated
public class DriverApprovalResponseAvroModel extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DriverApprovalResponseAvroModel\",\"namespace\":\"com.example.kafka.avro.model\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"sagaId\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"driverId\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"callId\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"createdAt\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"driverApprovalStatus\",\"type\":{\"type\":\"enum\",\"name\":\"DriverApprovalStatus\",\"symbols\":[\"PENDING\",\"APPROVED\",\"REJECTED\"]}},{\"name\":\"failureMessages\",\"type\":\"string\"}]}");
    private static final long serialVersionUID = 4863611293591536846L;
    private static final org.apache.avro.Conversion<?>[] conversions =
            new org.apache.avro.Conversion<?>[]{
                    null,
                    null,
                    null,
                    null,
                    new org.apache.avro.data.TimeConversions.TimestampMillisConversion(),
                    null,
                    null,
                    null
            };
    private static SpecificData MODEL$ = new SpecificData();
    private static final BinaryMessageEncoder<DriverApprovalResponseAvroModel> ENCODER =
            new BinaryMessageEncoder<DriverApprovalResponseAvroModel>(MODEL$, SCHEMA$);
    private static final BinaryMessageDecoder<DriverApprovalResponseAvroModel> DECODER =
            new BinaryMessageDecoder<DriverApprovalResponseAvroModel>(MODEL$, SCHEMA$);
    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<DriverApprovalResponseAvroModel>
            WRITER$ = (org.apache.avro.io.DatumWriter<DriverApprovalResponseAvroModel>) MODEL$.createDatumWriter(SCHEMA$);
    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<DriverApprovalResponseAvroModel>
            READER$ = (org.apache.avro.io.DatumReader<DriverApprovalResponseAvroModel>) MODEL$.createDatumReader(SCHEMA$);

    static {
        MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimestampMillisConversion());
    }

    private java.lang.CharSequence id;
    private java.lang.CharSequence sagaId;
    private java.lang.CharSequence driverId;
    private java.lang.CharSequence callId;
    private java.time.Instant createdAt;
    private com.example.kafka.avro.model.DriverApprovalStatus driverApprovalStatus;
    private java.lang.CharSequence failureMessages;
    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public DriverApprovalResponseAvroModel() {
    }
    /**
     * All-args constructor.
     * @param id The new value for id
     * @param sagaId The new value for sagaId
     * @param driverId The new value for driverId
     * @param callId The new value for callId
     * @param createdAt The new value for createdAt
     * @param driverApprovalStatus The new value for driverApprovalStatus
     * @param failureMessages The new value for failureMessages
     */
    public DriverApprovalResponseAvroModel(java.lang.CharSequence id, java.lang.CharSequence sagaId, java.lang.CharSequence driverId, java.lang.CharSequence callId, java.time.Instant createdAt, com.example.kafka.avro.model.DriverApprovalStatus driverApprovalStatus, java.lang.CharSequence failureMessages) {
        this.id = id;
        this.sagaId = sagaId;
        this.driverId = driverId;
        this.callId = callId;
        this.createdAt = createdAt.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
        this.driverApprovalStatus = driverApprovalStatus;
        this.failureMessages = failureMessages;
    }

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    /**
     * Return the BinaryMessageEncoder instance used by this class.
     * @return the message encoder used by this class
     */
    public static BinaryMessageEncoder<DriverApprovalResponseAvroModel> getEncoder() {
        return ENCODER;
    }

    /**
     * Return the BinaryMessageDecoder instance used by this class.
     * @return the message decoder used by this class
     */
    public static BinaryMessageDecoder<DriverApprovalResponseAvroModel> getDecoder() {
        return DECODER;
    }

    /**
     * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
     * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
     * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
     */
    public static BinaryMessageDecoder<DriverApprovalResponseAvroModel> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<DriverApprovalResponseAvroModel>(MODEL$, SCHEMA$, resolver);
    }

    /**
     * Deserializes a DriverApprovalResponseAvroModel from a ByteBuffer.
     * @param b a byte buffer holding serialized data for an instance of this class
     * @return a DriverApprovalResponseAvroModel instance decoded from the given buffer
     * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
     */
    public static DriverApprovalResponseAvroModel fromByteBuffer(
            java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    /**
     * Creates a new DriverApprovalResponseAvroModel RecordBuilder.
     * @return A new DriverApprovalResponseAvroModel RecordBuilder
     */
    public static com.example.kafka.avro.model.DriverApprovalResponseAvroModel.Builder newBuilder() {
        return new com.example.kafka.avro.model.DriverApprovalResponseAvroModel.Builder();
    }

    /**
     * Creates a new DriverApprovalResponseAvroModel RecordBuilder by copying an existing Builder.
     * @param other The existing builder to copy.
     * @return A new DriverApprovalResponseAvroModel RecordBuilder
     */
    public static com.example.kafka.avro.model.DriverApprovalResponseAvroModel.Builder newBuilder(com.example.kafka.avro.model.DriverApprovalResponseAvroModel.Builder other) {
        if (other == null) {
            return new com.example.kafka.avro.model.DriverApprovalResponseAvroModel.Builder();
        } else {
            return new com.example.kafka.avro.model.DriverApprovalResponseAvroModel.Builder(other);
        }
    }

    /**
     * Creates a new DriverApprovalResponseAvroModel RecordBuilder by copying an existing DriverApprovalResponseAvroModel instance.
     * @param other The existing instance to copy.
     * @return A new DriverApprovalResponseAvroModel RecordBuilder
     */
    public static com.example.kafka.avro.model.DriverApprovalResponseAvroModel.Builder newBuilder(com.example.kafka.avro.model.DriverApprovalResponseAvroModel other) {
        if (other == null) {
            return new com.example.kafka.avro.model.DriverApprovalResponseAvroModel.Builder();
        } else {
            return new com.example.kafka.avro.model.DriverApprovalResponseAvroModel.Builder(other);
        }
    }

    /**
     * Serializes this DriverApprovalResponseAvroModel to a ByteBuffer.
     * @return a buffer holding the serialized data for this instance
     * @throws java.io.IOException if this instance could not be serialized
     */
    public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
        return ENCODER.encode(this);
    }

    public org.apache.avro.specific.SpecificData getSpecificData() {
        return MODEL$;
    }

    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }

    // Used by DatumWriter.  Applications should not call.
    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0:
                return id;
            case 1:
                return sagaId;
            case 2:
                return driverId;
            case 3:
                return callId;
            case 4:
                return createdAt;
            case 5:
                return driverApprovalStatus;
            case 6:
                return failureMessages;
            default:
                throw new IndexOutOfBoundsException("Invalid index: " + field$);
        }
    }

    @Override
    public org.apache.avro.Conversion<?> getConversion(int field) {
        return conversions[field];
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value = "unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0:
                id = (java.lang.CharSequence) value$;
                break;
            case 1:
                sagaId = (java.lang.CharSequence) value$;
                break;
            case 2:
                driverId = (java.lang.CharSequence) value$;
                break;
            case 3:
                callId = (java.lang.CharSequence) value$;
                break;
            case 4:
                createdAt = (java.time.Instant) value$;
                break;
            case 5:
                driverApprovalStatus = (com.example.kafka.avro.model.DriverApprovalStatus) value$;
                break;
            case 6:
                failureMessages = (java.lang.CharSequence) value$;
                break;
            default:
                throw new IndexOutOfBoundsException("Invalid index: " + field$);
        }
    }

    /**
     * Gets the value of the 'id' field.
     * @return The value of the 'id' field.
     */
    public java.lang.CharSequence getId() {
        return id;
    }

    /**
     * Sets the value of the 'id' field.
     * @param value the value to set.
     */
    public void setId(java.lang.CharSequence value) {
        this.id = value;
    }

    /**
     * Gets the value of the 'sagaId' field.
     * @return The value of the 'sagaId' field.
     */
    public java.lang.CharSequence getSagaId() {
        return sagaId;
    }

    /**
     * Sets the value of the 'sagaId' field.
     * @param value the value to set.
     */
    public void setSagaId(java.lang.CharSequence value) {
        this.sagaId = value;
    }

    /**
     * Gets the value of the 'driverId' field.
     * @return The value of the 'driverId' field.
     */
    public java.lang.CharSequence getDriverId() {
        return driverId;
    }

    /**
     * Sets the value of the 'driverId' field.
     * @param value the value to set.
     */
    public void setDriverId(java.lang.CharSequence value) {
        this.driverId = value;
    }

    /**
     * Gets the value of the 'callId' field.
     * @return The value of the 'callId' field.
     */
    public java.lang.CharSequence getCallId() {
        return callId;
    }

    /**
     * Sets the value of the 'callId' field.
     * @param value the value to set.
     */
    public void setCallId(java.lang.CharSequence value) {
        this.callId = value;
    }

    /**
     * Gets the value of the 'createdAt' field.
     * @return The value of the 'createdAt' field.
     */
    public java.time.Instant getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the value of the 'createdAt' field.
     * @param value the value to set.
     */
    public void setCreatedAt(java.time.Instant value) {
        this.createdAt = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
    }

    /**
     * Gets the value of the 'driverApprovalStatus' field.
     * @return The value of the 'driverApprovalStatus' field.
     */
    public com.example.kafka.avro.model.DriverApprovalStatus getDriverApprovalStatus() {
        return driverApprovalStatus;
    }

    /**
     * Sets the value of the 'driverApprovalStatus' field.
     * @param value the value to set.
     */
    public void setDriverApprovalStatus(com.example.kafka.avro.model.DriverApprovalStatus value) {
        this.driverApprovalStatus = value;
    }

    /**
     * Gets the value of the 'failureMessages' field.
     * @return The value of the 'failureMessages' field.
     */
    public java.lang.CharSequence getFailureMessages() {
        return failureMessages;
    }

    /**
     * Sets the value of the 'failureMessages' field.
     * @param value the value to set.
     */
    public void setFailureMessages(java.lang.CharSequence value) {
        this.failureMessages = value;
    }

    @Override
    public void writeExternal(java.io.ObjectOutput out)
            throws java.io.IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    @Override
    public void readExternal(java.io.ObjectInput in)
            throws java.io.IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }

    /**
     * RecordBuilder for DriverApprovalResponseAvroModel instances.
     */
    @org.apache.avro.specific.AvroGenerated
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DriverApprovalResponseAvroModel>
            implements org.apache.avro.data.RecordBuilder<DriverApprovalResponseAvroModel> {

        private java.lang.CharSequence id;
        private java.lang.CharSequence sagaId;
        private java.lang.CharSequence driverId;
        private java.lang.CharSequence callId;
        private java.time.Instant createdAt;
        private com.example.kafka.avro.model.DriverApprovalStatus driverApprovalStatus;
        private java.lang.CharSequence failureMessages;

        /** Creates a new Builder */
        private Builder() {
            super(SCHEMA$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         * @param other The existing Builder to copy.
         */
        private Builder(com.example.kafka.avro.model.DriverApprovalResponseAvroModel.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.id)) {
                this.id = data().deepCopy(fields()[0].schema(), other.id);
                fieldSetFlags()[0] = other.fieldSetFlags()[0];
            }
            if (isValidValue(fields()[1], other.sagaId)) {
                this.sagaId = data().deepCopy(fields()[1].schema(), other.sagaId);
                fieldSetFlags()[1] = other.fieldSetFlags()[1];
            }
            if (isValidValue(fields()[2], other.driverId)) {
                this.driverId = data().deepCopy(fields()[2].schema(), other.driverId);
                fieldSetFlags()[2] = other.fieldSetFlags()[2];
            }
            if (isValidValue(fields()[3], other.callId)) {
                this.callId = data().deepCopy(fields()[3].schema(), other.callId);
                fieldSetFlags()[3] = other.fieldSetFlags()[3];
            }
            if (isValidValue(fields()[4], other.createdAt)) {
                this.createdAt = data().deepCopy(fields()[4].schema(), other.createdAt);
                fieldSetFlags()[4] = other.fieldSetFlags()[4];
            }
            if (isValidValue(fields()[5], other.driverApprovalStatus)) {
                this.driverApprovalStatus = data().deepCopy(fields()[5].schema(), other.driverApprovalStatus);
                fieldSetFlags()[5] = other.fieldSetFlags()[5];
            }
            if (isValidValue(fields()[6], other.failureMessages)) {
                this.failureMessages = data().deepCopy(fields()[6].schema(), other.failureMessages);
                fieldSetFlags()[6] = other.fieldSetFlags()[6];
            }
        }

        /**
         * Creates a Builder by copying an existing DriverApprovalResponseAvroModel instance
         * @param other The existing instance to copy.
         */
        private Builder(com.example.kafka.avro.model.DriverApprovalResponseAvroModel other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0], other.id)) {
                this.id = data().deepCopy(fields()[0].schema(), other.id);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.sagaId)) {
                this.sagaId = data().deepCopy(fields()[1].schema(), other.sagaId);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.driverId)) {
                this.driverId = data().deepCopy(fields()[2].schema(), other.driverId);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.callId)) {
                this.callId = data().deepCopy(fields()[3].schema(), other.callId);
                fieldSetFlags()[3] = true;
            }
            if (isValidValue(fields()[4], other.createdAt)) {
                this.createdAt = data().deepCopy(fields()[4].schema(), other.createdAt);
                fieldSetFlags()[4] = true;
            }
            if (isValidValue(fields()[5], other.driverApprovalStatus)) {
                this.driverApprovalStatus = data().deepCopy(fields()[5].schema(), other.driverApprovalStatus);
                fieldSetFlags()[5] = true;
            }
            if (isValidValue(fields()[6], other.failureMessages)) {
                this.failureMessages = data().deepCopy(fields()[6].schema(), other.failureMessages);
                fieldSetFlags()[6] = true;
            }
        }

        /**
         * Gets the value of the 'id' field.
         * @return The value.
         */
        public java.lang.CharSequence getId() {
            return id;
        }


        /**
         * Sets the value of the 'id' field.
         * @param value The value of 'id'.
         * @return This builder.
         */
        public com.example.kafka.avro.model.DriverApprovalResponseAvroModel.Builder setId(java.lang.CharSequence value) {
            validate(fields()[0], value);
            this.id = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'id' field has been set.
         * @return True if the 'id' field has been set, false otherwise.
         */
        public boolean hasId() {
            return fieldSetFlags()[0];
        }


        /**
         * Clears the value of the 'id' field.
         * @return This builder.
         */
        public com.example.kafka.avro.model.DriverApprovalResponseAvroModel.Builder clearId() {
            id = null;
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'sagaId' field.
         * @return The value.
         */
        public java.lang.CharSequence getSagaId() {
            return sagaId;
        }


        /**
         * Sets the value of the 'sagaId' field.
         * @param value The value of 'sagaId'.
         * @return This builder.
         */
        public com.example.kafka.avro.model.DriverApprovalResponseAvroModel.Builder setSagaId(java.lang.CharSequence value) {
            validate(fields()[1], value);
            this.sagaId = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'sagaId' field has been set.
         * @return True if the 'sagaId' field has been set, false otherwise.
         */
        public boolean hasSagaId() {
            return fieldSetFlags()[1];
        }


        /**
         * Clears the value of the 'sagaId' field.
         * @return This builder.
         */
        public com.example.kafka.avro.model.DriverApprovalResponseAvroModel.Builder clearSagaId() {
            sagaId = null;
            fieldSetFlags()[1] = false;
            return this;
        }

        /**
         * Gets the value of the 'driverId' field.
         * @return The value.
         */
        public java.lang.CharSequence getDriverId() {
            return driverId;
        }


        /**
         * Sets the value of the 'driverId' field.
         * @param value The value of 'driverId'.
         * @return This builder.
         */
        public com.example.kafka.avro.model.DriverApprovalResponseAvroModel.Builder setDriverId(java.lang.CharSequence value) {
            validate(fields()[2], value);
            this.driverId = value;
            fieldSetFlags()[2] = true;
            return this;
        }

        /**
         * Checks whether the 'driverId' field has been set.
         * @return True if the 'driverId' field has been set, false otherwise.
         */
        public boolean hasDriverId() {
            return fieldSetFlags()[2];
        }


        /**
         * Clears the value of the 'driverId' field.
         * @return This builder.
         */
        public com.example.kafka.avro.model.DriverApprovalResponseAvroModel.Builder clearDriverId() {
            driverId = null;
            fieldSetFlags()[2] = false;
            return this;
        }

        /**
         * Gets the value of the 'callId' field.
         * @return The value.
         */
        public java.lang.CharSequence getCallId() {
            return callId;
        }


        /**
         * Sets the value of the 'callId' field.
         * @param value The value of 'callId'.
         * @return This builder.
         */
        public com.example.kafka.avro.model.DriverApprovalResponseAvroModel.Builder setCallId(java.lang.CharSequence value) {
            validate(fields()[3], value);
            this.callId = value;
            fieldSetFlags()[3] = true;
            return this;
        }

        /**
         * Checks whether the 'callId' field has been set.
         * @return True if the 'callId' field has been set, false otherwise.
         */
        public boolean hasCallId() {
            return fieldSetFlags()[3];
        }


        /**
         * Clears the value of the 'callId' field.
         * @return This builder.
         */
        public com.example.kafka.avro.model.DriverApprovalResponseAvroModel.Builder clearCallId() {
            callId = null;
            fieldSetFlags()[3] = false;
            return this;
        }

        /**
         * Gets the value of the 'createdAt' field.
         * @return The value.
         */
        public java.time.Instant getCreatedAt() {
            return createdAt;
        }


        /**
         * Sets the value of the 'createdAt' field.
         * @param value The value of 'createdAt'.
         * @return This builder.
         */
        public com.example.kafka.avro.model.DriverApprovalResponseAvroModel.Builder setCreatedAt(java.time.Instant value) {
            validate(fields()[4], value);
            this.createdAt = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
            fieldSetFlags()[4] = true;
            return this;
        }

        /**
         * Checks whether the 'createdAt' field has been set.
         * @return True if the 'createdAt' field has been set, false otherwise.
         */
        public boolean hasCreatedAt() {
            return fieldSetFlags()[4];
        }


        /**
         * Clears the value of the 'createdAt' field.
         * @return This builder.
         */
        public com.example.kafka.avro.model.DriverApprovalResponseAvroModel.Builder clearCreatedAt() {
            fieldSetFlags()[4] = false;
            return this;
        }

        /**
         * Gets the value of the 'driverApprovalStatus' field.
         * @return The value.
         */
        public com.example.kafka.avro.model.DriverApprovalStatus getDriverApprovalStatus() {
            return driverApprovalStatus;
        }


        /**
         * Sets the value of the 'driverApprovalStatus' field.
         * @param value The value of 'driverApprovalStatus'.
         * @return This builder.
         */
        public com.example.kafka.avro.model.DriverApprovalResponseAvroModel.Builder setDriverApprovalStatus(com.example.kafka.avro.model.DriverApprovalStatus value) {
            validate(fields()[5], value);
            this.driverApprovalStatus = value;
            fieldSetFlags()[5] = true;
            return this;
        }

        /**
         * Checks whether the 'driverApprovalStatus' field has been set.
         * @return True if the 'driverApprovalStatus' field has been set, false otherwise.
         */
        public boolean hasDriverApprovalStatus() {
            return fieldSetFlags()[5];
        }


        /**
         * Clears the value of the 'driverApprovalStatus' field.
         * @return This builder.
         */
        public com.example.kafka.avro.model.DriverApprovalResponseAvroModel.Builder clearDriverApprovalStatus() {
            driverApprovalStatus = null;
            fieldSetFlags()[5] = false;
            return this;
        }

        /**
         * Gets the value of the 'failureMessages' field.
         * @return The value.
         */
        public java.lang.CharSequence getFailureMessages() {
            return failureMessages;
        }


        /**
         * Sets the value of the 'failureMessages' field.
         * @param value The value of 'failureMessages'.
         * @return This builder.
         */
        public com.example.kafka.avro.model.DriverApprovalResponseAvroModel.Builder setFailureMessages(java.lang.CharSequence value) {
            validate(fields()[6], value);
            this.failureMessages = value;
            fieldSetFlags()[6] = true;
            return this;
        }

        /**
         * Checks whether the 'failureMessages' field has been set.
         * @return True if the 'failureMessages' field has been set, false otherwise.
         */
        public boolean hasFailureMessages() {
            return fieldSetFlags()[6];
        }


        /**
         * Clears the value of the 'failureMessages' field.
         * @return This builder.
         */
        public com.example.kafka.avro.model.DriverApprovalResponseAvroModel.Builder clearFailureMessages() {
            failureMessages = null;
            fieldSetFlags()[6] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public DriverApprovalResponseAvroModel build() {
            try {
                DriverApprovalResponseAvroModel record = new DriverApprovalResponseAvroModel();
                record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
                record.sagaId = fieldSetFlags()[1] ? this.sagaId : (java.lang.CharSequence) defaultValue(fields()[1]);
                record.driverId = fieldSetFlags()[2] ? this.driverId : (java.lang.CharSequence) defaultValue(fields()[2]);
                record.callId = fieldSetFlags()[3] ? this.callId : (java.lang.CharSequence) defaultValue(fields()[3]);
                record.createdAt = fieldSetFlags()[4] ? this.createdAt : (java.time.Instant) defaultValue(fields()[4]);
                record.driverApprovalStatus = fieldSetFlags()[5] ? this.driverApprovalStatus : (com.example.kafka.avro.model.DriverApprovalStatus) defaultValue(fields()[5]);
                record.failureMessages = fieldSetFlags()[6] ? this.failureMessages : (java.lang.CharSequence) defaultValue(fields()[6]);
                return record;
            } catch (org.apache.avro.AvroMissingFieldException e) {
                throw e;
            } catch (java.lang.Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }

}










