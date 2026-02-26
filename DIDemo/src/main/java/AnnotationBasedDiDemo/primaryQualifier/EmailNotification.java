package AnnotationBasedDiDemo.primaryQualifier;

import org.springframework.stereotype.Component;

@Component
public class EmailNotification implements NotificationService{
    @Override
    public void Notify(String message){
        System.out.println(message + " Via Email Notification!");
    }
}
