package com.example.callapplication.service;

import com.example.calldataaccess.repository.adapter.CallRepositoryAdapter;
import com.example.calldomain.data.dto.DriverApprovalResponseDto;
import com.example.calldomain.data.event.CallRejectedEvent;
import com.example.calldomain.data.event.EmptyEvent;
import com.example.callapplication.service.publisher.kafka.DriverApprovalRequestKafkaProducer;
import com.example.commondata.domain.aggregate.valueobject.CallId;
import com.example.commondata.domain.pattern.SagaStep;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@RequiredArgsConstructor
public class CallAndDriverSaga implements SagaStep<DriverApprovalResponseDto, EmptyEvent, CallRejectedEvent> {

    private final CallDomainService callDomainService;
    private final CallRepositoryAdapter callRepositoryAdapter;
    private final DriverApprovalRequestKafkaProducer driverApprovalRequestKafkaProducer;

    @Override
    @Transactional
    public EmptyEvent process(DriverApprovalResponseDto data) {
        var callId = new CallId(UUID.fromString(data.getId()));
        var callFound = callRepositoryAdapter.findById(callId);
        var event = callDomainService.processCallApproved(callFound.get());
        return event;
    }

    @Override
    @Transactional
    public CallRejectedEvent rollback(DriverApprovalResponseDto data) {
        var callId = new CallId(UUID.fromString(data.getId()));
        var callFound = callRepositoryAdapter.findById(callId);
        var event = callDomainService.processCallRejected(callFound.get());
        return event;
    }


}
