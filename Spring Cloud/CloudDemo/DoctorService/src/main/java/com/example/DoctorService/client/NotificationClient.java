package com.example.DoctorService.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "NOTIFICATION-SERVICE")
public interface NotificationClient {
    @GetMapping("/notify")
    String Notify();
}
