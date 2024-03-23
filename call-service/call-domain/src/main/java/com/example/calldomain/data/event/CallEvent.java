package com.example.calldomain.data.event;

import com.example.calldomain.data.aggregate.Call;
import com.example.commondata.domain.event.DomainEvent;
import com.example.commondata.domain.event.publisher.DomainEventPublisher;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
abstract class AbstractCallEvent implements DomainEvent<Call> {
    private final Call call;
}