package AnnotationBasedDiDemo.primaryQualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SmsNotification implements NotificationService{
    @Override
    public void Notify(String message){
        System.out.println(message + " Via SMS Notification!");
    }
}
