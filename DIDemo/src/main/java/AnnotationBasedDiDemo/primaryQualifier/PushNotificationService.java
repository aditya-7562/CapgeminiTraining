package AnnotationBasedDiDemo.primaryQualifier;

import org.springframework.stereotype.Component;

@Component
public class PushNotificationService implements NotificationService{
    @Override
    public void Notify(String message){
        System.out.println(message + " Via Push Notification!");
    }
}
