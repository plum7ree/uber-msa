package com.example.eatsorderconfigdata;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "call-service")
public class CallServiceConfigData {
    String paymentRequestTopicName;
    String paymentResponseTopicName;
    String driverApprovalRequestTopicName;
    String driverApprovalResponseTopicName;
    String restaurantApprovalRequestTopicName;
    String restaurantApprovalResponseTopicName;
}
