package AnnotationBasedDiDemo.MultiChannelNotificationAndAlertSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AlertManager {
    private NotificationChannel notificationChannel;
    private RateLimiter rateLimiter;
    private AlertAuditService alertAuditService;

    @Autowired
    public AlertManager(@Qualifier("pushNotification") NotificationChannel notificationChannel, RateLimiter rateLimiter) {
        this.notificationChannel = notificationChannel;
        this.rateLimiter = rateLimiter;
    }

    @Autowired
    public void setAlertAuditService(AlertAuditService alertAuditService) {
        this.alertAuditService = alertAuditService;
    }


    public void sendNotification(String message) {
        notificationChannel.sendAlert(message);
        rateLimiter.setRateLimit();
        alertAuditService.audit();
    }
}
