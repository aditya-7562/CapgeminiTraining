package AnnotationBasedDiDemo.LazyDemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "AnnotationBasedDiDemo.LazyDemo")
public class AppConfig {
}
