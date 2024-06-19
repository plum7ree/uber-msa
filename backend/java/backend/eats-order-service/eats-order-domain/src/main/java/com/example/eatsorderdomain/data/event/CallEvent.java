package com.example.eatsorderdomain.data.event;

import com.example.eatsorderdomain.data.aggregate.OrderDomainObject;
import com.example.commondata.domain.event.DomainEvent;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.ZonedDateTime;

@Data
@RequiredArgsConstructor
abstract class AbstractCallEvent implements DomainEvent<OrderDomainObject> {
    private final OrderDomainObject orderDomainObject;
    private final ZonedDateTime createdAt;

}