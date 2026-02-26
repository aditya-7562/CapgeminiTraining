package AnnotationBasedDiDemo.beanScope;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "AnnotationBasedDiDemo.beanScope")
public class BeanScopeConfig {
}
