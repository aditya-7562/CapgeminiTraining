package AnnotationBasedDiDemo.FoodDeliverySystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FoodAppConfig.class);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.order();

        context.close();
    }
}
