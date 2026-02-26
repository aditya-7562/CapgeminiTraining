package AnnotationBasedDiDemo.primaryQualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrimaryQualifierConfig.class);

        NotificationManager notificationManager = context.getBean(NotificationManager.class);
        notificationManager.getNotificationService().Notify("Hii");
        context.close();
    }
}
