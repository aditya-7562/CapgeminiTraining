package AnnotationBasedDiDemo.Annotations;

import org.springframework.stereotype.Component;

@Component
public class EmailService {
    public void sendEmail(){
        System.out.println("Email sent!");
    }
}
