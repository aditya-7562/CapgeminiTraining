package AnnotationBasedDiDemo.LazyDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        LazyBean lazyBean = context.getBean(LazyBean.class);
//        lazyBean.work();

        context.close();
    }
}
