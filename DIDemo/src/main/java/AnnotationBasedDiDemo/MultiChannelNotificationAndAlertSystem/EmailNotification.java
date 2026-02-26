package AnnotationBasedDiDemo.MultiChannelNotificationAndAlertSystem;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailNotification implements NotificationChannel {
    @Override
    public void sendAlert(String message) {
        System.out.println(message + " via Email Notification");
    }
}
