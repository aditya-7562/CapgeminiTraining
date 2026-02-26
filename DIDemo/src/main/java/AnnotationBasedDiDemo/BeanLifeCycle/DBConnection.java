package AnnotationBasedDiDemo.BeanLifeCycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class DBConnection {
    private String dbName;

    public DBConnection() {
        System.out.println("DB Connection created...");
    }

    @PostConstruct
    public void start(){
        System.out.println("DB Connection started...");
    }

    @PreDestroy
    public void stop(){
        System.out.println("DB Connection stopped...");
    }

    public void executeQuery(){
        System.out.println("Query executing on database...");
    }


}
