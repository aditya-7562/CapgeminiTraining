package com.example.DoctorService.client;

import org.springframework.stereotype.Component;

@Component
public class UserClientFallback implements UserClient {

    @Override
    public String getUsers() {
        return "User Service is DOWN. Returning fallback response.";
    }
}
