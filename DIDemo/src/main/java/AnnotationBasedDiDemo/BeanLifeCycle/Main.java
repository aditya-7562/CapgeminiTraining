package AnnotationBasedDiDemo.BeanLifeCycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        DBConnection conn = context.getBean(DBConnection.class);
        conn.executeQuery();

        context.close();
    }
}
