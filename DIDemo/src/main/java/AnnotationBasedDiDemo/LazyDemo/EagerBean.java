package AnnotationBasedDiDemo.LazyDemo;

import org.springframework.stereotype.Component;

@Component
public class EagerBean {
    public EagerBean() {
        System.out.println("Eager bean created...");
    }
    public void work(){
        System.out.println("Eager bean working...");
    }
}
