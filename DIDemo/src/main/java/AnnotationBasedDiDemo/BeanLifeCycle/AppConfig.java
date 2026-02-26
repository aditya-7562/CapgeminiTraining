package AnnotationBasedDiDemo.BeanLifeCycle;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "AnnotationBasedDiDemo.BeanLifeCycle")
public class AppConfig {
}
