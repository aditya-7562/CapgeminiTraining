package AnnotationBasedDiDemo.FoodDeliverySystem;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class DeliveryService {
    @PostConstruct
    public void ready(){
        System.out.println("Delivery Service ready...");
    }

    @PreDestroy
    public void close(){
        System.out.println("Delivery Service closed...");
    }

    public void deliver(){
        System.out.println("Deliver food!");
    }
}
