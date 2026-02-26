package AnnotationBasedDiDemo.MultiChannelNotificationAndAlertSystem;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SmsNotification implements NotificationChannel {
    @Override
    public void sendAlert(String message) {
        System.out.println(message + " via SMS Notification");
    }
}
