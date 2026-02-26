package AnnotationBasedDiDemo.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageService {

    private EmailService emailService;
    private SmsService smsService;
    private NotificationService notificationService;

    @Autowired
    public MessageService(EmailService emailService, SmsService smsService, NotificationService notificationService) {
        this.emailService = emailService;
        this.smsService = smsService;
        this.notificationService = notificationService;
    }

    public void sendMessage(){
        System.out.println("Message sent!");
        emailService.sendEmail();
        smsService.sendSms();
        notificationService.sendNotification();
    }
}
