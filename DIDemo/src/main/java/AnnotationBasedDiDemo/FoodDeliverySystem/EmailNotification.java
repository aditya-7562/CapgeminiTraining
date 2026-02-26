package AnnotationBasedDiDemo.FoodDeliverySystem;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailNotification implements NotificationService{

    @Override
    public void sendNotification(String message) {
        System.out.println("Via Email: " + message);
    }
}
