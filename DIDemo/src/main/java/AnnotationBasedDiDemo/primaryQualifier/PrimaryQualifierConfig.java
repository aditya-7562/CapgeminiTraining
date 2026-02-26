package AnnotationBasedDiDemo.primaryQualifier;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "AnnotationBasedDiDemo.primaryQualifier")
public class PrimaryQualifierConfig {
}
