package AnnotationBasedDiDemo.LazyDemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyBean {
    public LazyBean() {
        System.out.println("Lazy bean created...");
    }
    public void work(){
        System.out.println("Lazy bean working...");
    }
}
