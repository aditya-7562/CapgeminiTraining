package AnnotationBasedDiDemo.Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "AnnotationBasedDiDemo.Annotations")
public class AppConfig {

}
