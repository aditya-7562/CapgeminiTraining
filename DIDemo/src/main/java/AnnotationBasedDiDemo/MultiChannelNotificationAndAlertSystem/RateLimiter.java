package AnnotationBasedDiDemo.MultiChannelNotificationAndAlertSystem;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class RateLimiter {
    @PostConstruct
    public void init() {
        System.out.println("Rate Limiter Initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Rate Limiter Destroyed");
    }

    public void setRateLimit() {
        System.out.println("Rate Limit has been set");
    }
}
