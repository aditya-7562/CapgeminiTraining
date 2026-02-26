package AnnotationBasedDiDemo.MultiChannelNotificationAndAlertSystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AlertManager alertManager = context.getBean(AlertManager.class);
        alertManager.sendNotification("Hii");

        context.close();
    }
}
