package AnnotationBasedDiDemo.beanScope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanScopeConfig.class);

        SingletonBean s1 = context.getBean(SingletonBean.class);
        SingletonBean s2 = context.getBean(SingletonBean.class);

        System.out.println("Same instance? " + (s1 == s2));
        System.out.println(s1);
        System.out.println(s2);

        PrototypeBean p1 = context.getBean(PrototypeBean.class);
        PrototypeBean p2 = context.getBean(PrototypeBean.class);

        System.out.println("Same instance? " + (p1 == p2));
        System.out.println(p1);
        System.out.println(p2);


    }
}
