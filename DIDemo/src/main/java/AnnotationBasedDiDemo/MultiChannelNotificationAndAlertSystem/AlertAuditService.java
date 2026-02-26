package AnnotationBasedDiDemo.MultiChannelNotificationAndAlertSystem;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class AlertAuditService {
    public void audit() {
        System.out.println("Auditing Notification");
    }
}
