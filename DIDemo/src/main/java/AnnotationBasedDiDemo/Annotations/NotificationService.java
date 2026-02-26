package AnnotationBasedDiDemo.Annotations;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public void sendNotification(){
        System.out.println("Notification sent!");
    }
}
