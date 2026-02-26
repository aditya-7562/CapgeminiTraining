package diDemoXmlBased;

public class MessageService {

    private EmailService emailService;

//    // Constructor injection
//    public MessageService(EmailService emailService) {
//        this.emailService = emailService;
//    }

//     Setter injection
    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }
//
//    public EmailService getEmailService() {
//        return emailService;
//    }

    public void sendMessage(){
        System.out.println("Message sent!");
        emailService.sendEmail();
    }

}
