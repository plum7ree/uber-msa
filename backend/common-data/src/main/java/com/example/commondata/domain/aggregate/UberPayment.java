package com.example.commondata.domain.aggregate;

import com.example.commondata.domain.aggregate.valueobject.CallId;
import com.example.commondata.domain.aggregate.valueobject.Money;
import com.example.commondata.domain.aggregate.valueobject.PaymentId;
import com.example.commondata.domain.aggregate.valueobject.UserId;
import com.example.kafka.avro.model.PaymentStatus;
import jakarta.persistence.Transient;
import lombok.Getter;

// https://www.baeldung.com/lombok-builder-inheritance

@Getter
public class UberPayment extends AggregateRootV1<PaymentId> {
    private CallId callId;
    private UserId userId;
    private Money price;
    private String type;
    private String orderId;
    @Transient
    private String paymentKey;
    private PaymentStatus paymentStatus;

    private UberPayment(Builder builder) {
        setId(builder.paymentId);
        callId = builder.callId;
        userId = builder.userId;
        price = builder.price;
        paymentStatus = builder.paymentStatus;
    }

    public static Builder builder() {
        return new Builder();
    }


    public static final class Builder {
        private PaymentId paymentId;
        private CallId callId;
        private UserId userId;
        private Money price;
        private PaymentStatus paymentStatus;

        private Builder() {
        }

        public Builder paymentId(PaymentId val) {
            paymentId = val;
            return this;
        }

        public Builder userId(UserId val) {
            userId = val;
            return this;
        }

        public Builder callId(CallId val) {
            callId = val;
            return this;
        }

        public Builder price(Money val) {
            price = val;
            return this;
        }

        public Builder paymentStatus(PaymentStatus val) {
            paymentStatus = val;
            return this;
        }


        public UberPayment build() {
            return new UberPayment(this);
        }
    }
}