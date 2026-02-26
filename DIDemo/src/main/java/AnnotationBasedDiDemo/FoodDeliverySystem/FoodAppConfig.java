package AnnotationBasedDiDemo.FoodDeliverySystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "AnnotationBasedDiDemo.FoodDeliverySystem")
public class FoodAppConfig {}
