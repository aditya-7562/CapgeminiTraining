package AnnotationBasedDiDemo.FoodDeliverySystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Component
public class OrderService {

    private final NotificationService notificationService;

    @Autowired
    private RestaurantService restaurantService;

    @Autowired
    public OrderService(@Qualifier("smsNotfication") NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void order() {
        notificationService.sendNotification("Order Prepared");
        restaurantService.restaurant();
    }
}
