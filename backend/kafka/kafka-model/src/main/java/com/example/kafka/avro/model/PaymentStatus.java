/**
 * Autogenerated by Avro
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package com.example.kafka.avro.model;

@org.apache.avro.specific.AvroGenerated
public enum PaymentStatus implements org.apache.avro.generic.GenericEnumSymbol<PaymentStatus> {
    PENDING, COMPLETED, CANCELLED, FAILED;
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"PaymentStatus\",\"namespace\":\"com.example.kafka.avro.model\",\"symbols\":[\"PENDING\",\"COMPLETED\",\"CANCELLED\",\"FAILED\"]}");

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }
}
