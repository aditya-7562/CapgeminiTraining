package diDemoXmlBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        MessageService messageService = context.getBean(MessageService.class);

        messageService.sendMessage();

        ((ClassPathXmlApplicationContext)context).close();
    }
}
