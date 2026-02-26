package AnnotationBasedDiDemo.FoodDeliverySystem;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class SmsNotfication implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("Via SMS: " + message);
    }
}
