/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.kafka.avro.model;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class RequestAvroModel extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1131848868057940738L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RequestAvroModel\",\"namespace\":\"com.example.kafka.avro.model\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"sagaId\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"callerId\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"callId\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"calleeId\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"price\",\"type\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":10,\"scale\":2}},{\"name\":\"createdAt\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"status\",\"type\":{\"type\":\"enum\",\"name\":\"Status\",\"symbols\":[\"PENDING\",\"COMPLETED\",\"CANCELLED\",\"FAILED\",\"APPROVED\",\"REJECTED\"]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimestampMillisConversion());
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.DecimalConversion());
  }

  private static final BinaryMessageEncoder<RequestAvroModel> ENCODER =
      new BinaryMessageEncoder<RequestAvroModel>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<RequestAvroModel> DECODER =
      new BinaryMessageDecoder<RequestAvroModel>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<RequestAvroModel> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<RequestAvroModel> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<RequestAvroModel> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<RequestAvroModel>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this RequestAvroModel to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a RequestAvroModel from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a RequestAvroModel instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static RequestAvroModel fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence id;
   private java.lang.CharSequence sagaId;
   private java.lang.CharSequence callerId;
   private java.lang.CharSequence callId;
   private java.lang.CharSequence calleeId;
   private java.nio.ByteBuffer price;
   private java.time.Instant createdAt;
   private com.example.kafka.avro.model.Status status;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public RequestAvroModel() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param sagaId The new value for sagaId
   * @param callerId The new value for callerId
   * @param callId The new value for callId
   * @param calleeId The new value for calleeId
   * @param price The new value for price
   * @param createdAt The new value for createdAt
   * @param status The new value for status
   */
  public RequestAvroModel(java.lang.CharSequence id, java.lang.CharSequence sagaId, java.lang.CharSequence callerId, java.lang.CharSequence callId, java.lang.CharSequence calleeId, java.nio.ByteBuffer price, java.time.Instant createdAt, com.example.kafka.avro.model.Status status) {
    this.id = id;
    this.sagaId = sagaId;
    this.callerId = callerId;
    this.callId = callId;
    this.calleeId = calleeId;
    this.price = price;
    this.createdAt = createdAt.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
    this.status = status;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return sagaId;
    case 2: return callerId;
    case 3: return callId;
    case 4: return calleeId;
    case 5: return price;
    case 6: return createdAt;
    case 7: return status;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      null,
      null,
      null,
      null,
      null,
      new org.apache.avro.data.TimeConversions.TimestampMillisConversion(),
      null,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: sagaId = (java.lang.CharSequence)value$; break;
    case 2: callerId = (java.lang.CharSequence)value$; break;
    case 3: callId = (java.lang.CharSequence)value$; break;
    case 4: calleeId = (java.lang.CharSequence)value$; break;
    case 5: price = (java.nio.ByteBuffer)value$; break;
    case 6: createdAt = (java.time.Instant)value$; break;
    case 7: status = (com.example.kafka.avro.model.Status)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
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
   * Gets the value of the 'callerId' field.
   * @return The value of the 'callerId' field.
   */
  public java.lang.CharSequence getCallerId() {
    return callerId;
  }


  /**
   * Sets the value of the 'callerId' field.
   * @param value the value to set.
   */
  public void setCallerId(java.lang.CharSequence value) {
    this.callerId = value;
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
   * Gets the value of the 'calleeId' field.
   * @return The value of the 'calleeId' field.
   */
  public java.lang.CharSequence getCalleeId() {
    return calleeId;
  }


  /**
   * Sets the value of the 'calleeId' field.
   * @param value the value to set.
   */
  public void setCalleeId(java.lang.CharSequence value) {
    this.calleeId = value;
  }

  /**
   * Gets the value of the 'price' field.
   * @return The value of the 'price' field.
   */
  public java.nio.ByteBuffer getPrice() {
    return price;
  }


  /**
   * Sets the value of the 'price' field.
   * @param value the value to set.
   */
  public void setPrice(java.nio.ByteBuffer value) {
    this.price = value;
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
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public com.example.kafka.avro.model.Status getStatus() {
    return status;
  }


  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(com.example.kafka.avro.model.Status value) {
    this.status = value;
  }

  /**
   * Creates a new RequestAvroModel RecordBuilder.
   * @return A new RequestAvroModel RecordBuilder
   */
  public static com.example.kafka.avro.model.RequestAvroModel.Builder newBuilder() {
    return new com.example.kafka.avro.model.RequestAvroModel.Builder();
  }

  /**
   * Creates a new RequestAvroModel RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RequestAvroModel RecordBuilder
   */
  public static com.example.kafka.avro.model.RequestAvroModel.Builder newBuilder(com.example.kafka.avro.model.RequestAvroModel.Builder other) {
    if (other == null) {
      return new com.example.kafka.avro.model.RequestAvroModel.Builder();
    } else {
      return new com.example.kafka.avro.model.RequestAvroModel.Builder(other);
    }
  }

  /**
   * Creates a new RequestAvroModel RecordBuilder by copying an existing RequestAvroModel instance.
   * @param other The existing instance to copy.
   * @return A new RequestAvroModel RecordBuilder
   */
  public static com.example.kafka.avro.model.RequestAvroModel.Builder newBuilder(com.example.kafka.avro.model.RequestAvroModel other) {
    if (other == null) {
      return new com.example.kafka.avro.model.RequestAvroModel.Builder();
    } else {
      return new com.example.kafka.avro.model.RequestAvroModel.Builder(other);
    }
  }

  /**
   * RecordBuilder for RequestAvroModel instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RequestAvroModel>
    implements org.apache.avro.data.RecordBuilder<RequestAvroModel> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence sagaId;
    private java.lang.CharSequence callerId;
    private java.lang.CharSequence callId;
    private java.lang.CharSequence calleeId;
    private java.nio.ByteBuffer price;
    private java.time.Instant createdAt;
    private com.example.kafka.avro.model.Status status;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.kafka.avro.model.RequestAvroModel.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.sagaId)) {
        this.sagaId = data().deepCopy(fields()[1].schema(), other.sagaId);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.callerId)) {
        this.callerId = data().deepCopy(fields()[2].schema(), other.callerId);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.callId)) {
        this.callId = data().deepCopy(fields()[3].schema(), other.callId);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.calleeId)) {
        this.calleeId = data().deepCopy(fields()[4].schema(), other.calleeId);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.price)) {
        this.price = data().deepCopy(fields()[5].schema(), other.price);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.createdAt)) {
        this.createdAt = data().deepCopy(fields()[6].schema(), other.createdAt);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.status)) {
        this.status = data().deepCopy(fields()[7].schema(), other.status);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
    }

    /**
     * Creates a Builder by copying an existing RequestAvroModel instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.kafka.avro.model.RequestAvroModel other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.sagaId)) {
        this.sagaId = data().deepCopy(fields()[1].schema(), other.sagaId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.callerId)) {
        this.callerId = data().deepCopy(fields()[2].schema(), other.callerId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.callId)) {
        this.callId = data().deepCopy(fields()[3].schema(), other.callId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.calleeId)) {
        this.calleeId = data().deepCopy(fields()[4].schema(), other.calleeId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.price)) {
        this.price = data().deepCopy(fields()[5].schema(), other.price);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.createdAt)) {
        this.createdAt = data().deepCopy(fields()[6].schema(), other.createdAt);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.status)) {
        this.status = data().deepCopy(fields()[7].schema(), other.status);
        fieldSetFlags()[7] = true;
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
    public com.example.kafka.avro.model.RequestAvroModel.Builder setId(java.lang.CharSequence value) {
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
    public com.example.kafka.avro.model.RequestAvroModel.Builder clearId() {
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
    public com.example.kafka.avro.model.RequestAvroModel.Builder setSagaId(java.lang.CharSequence value) {
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
    public com.example.kafka.avro.model.RequestAvroModel.Builder clearSagaId() {
      sagaId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'callerId' field.
      * @return The value.
      */
    public java.lang.CharSequence getCallerId() {
      return callerId;
    }


    /**
      * Sets the value of the 'callerId' field.
      * @param value The value of 'callerId'.
      * @return This builder.
      */
    public com.example.kafka.avro.model.RequestAvroModel.Builder setCallerId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.callerId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'callerId' field has been set.
      * @return True if the 'callerId' field has been set, false otherwise.
      */
    public boolean hasCallerId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'callerId' field.
      * @return This builder.
      */
    public com.example.kafka.avro.model.RequestAvroModel.Builder clearCallerId() {
      callerId = null;
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
    public com.example.kafka.avro.model.RequestAvroModel.Builder setCallId(java.lang.CharSequence value) {
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
    public com.example.kafka.avro.model.RequestAvroModel.Builder clearCallId() {
      callId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'calleeId' field.
      * @return The value.
      */
    public java.lang.CharSequence getCalleeId() {
      return calleeId;
    }


    /**
      * Sets the value of the 'calleeId' field.
      * @param value The value of 'calleeId'.
      * @return This builder.
      */
    public com.example.kafka.avro.model.RequestAvroModel.Builder setCalleeId(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.calleeId = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'calleeId' field has been set.
      * @return True if the 'calleeId' field has been set, false otherwise.
      */
    public boolean hasCalleeId() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'calleeId' field.
      * @return This builder.
      */
    public com.example.kafka.avro.model.RequestAvroModel.Builder clearCalleeId() {
      calleeId = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'price' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getPrice() {
      return price;
    }


    /**
      * Sets the value of the 'price' field.
      * @param value The value of 'price'.
      * @return This builder.
      */
    public com.example.kafka.avro.model.RequestAvroModel.Builder setPrice(java.nio.ByteBuffer value) {
      validate(fields()[5], value);
      this.price = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'price' field has been set.
      * @return True if the 'price' field has been set, false otherwise.
      */
    public boolean hasPrice() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'price' field.
      * @return This builder.
      */
    public com.example.kafka.avro.model.RequestAvroModel.Builder clearPrice() {
      price = null;
      fieldSetFlags()[5] = false;
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
    public com.example.kafka.avro.model.RequestAvroModel.Builder setCreatedAt(java.time.Instant value) {
      validate(fields()[6], value);
      this.createdAt = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'createdAt' field has been set.
      * @return True if the 'createdAt' field has been set, false otherwise.
      */
    public boolean hasCreatedAt() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'createdAt' field.
      * @return This builder.
      */
    public com.example.kafka.avro.model.RequestAvroModel.Builder clearCreatedAt() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public com.example.kafka.avro.model.Status getStatus() {
      return status;
    }


    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public com.example.kafka.avro.model.RequestAvroModel.Builder setStatus(com.example.kafka.avro.model.Status value) {
      validate(fields()[7], value);
      this.status = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public com.example.kafka.avro.model.RequestAvroModel.Builder clearStatus() {
      status = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public RequestAvroModel build() {
      try {
        RequestAvroModel record = new RequestAvroModel();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.sagaId = fieldSetFlags()[1] ? this.sagaId : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.callerId = fieldSetFlags()[2] ? this.callerId : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.callId = fieldSetFlags()[3] ? this.callId : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.calleeId = fieldSetFlags()[4] ? this.calleeId : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.price = fieldSetFlags()[5] ? this.price : (java.nio.ByteBuffer) defaultValue(fields()[5]);
        record.createdAt = fieldSetFlags()[6] ? this.createdAt : (java.time.Instant) defaultValue(fields()[6]);
        record.status = fieldSetFlags()[7] ? this.status : (com.example.kafka.avro.model.Status) defaultValue(fields()[7]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<RequestAvroModel>
    WRITER$ = (org.apache.avro.io.DatumWriter<RequestAvroModel>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<RequestAvroModel>
    READER$ = (org.apache.avro.io.DatumReader<RequestAvroModel>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










