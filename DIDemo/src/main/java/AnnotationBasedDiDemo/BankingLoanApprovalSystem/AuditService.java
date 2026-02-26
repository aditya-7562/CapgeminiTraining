package AnnotationBasedDiDemo.BankingLoanApprovalSystem;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class AuditService {


    @PostConstruct
    public void start(){
        System.out.println("Audit started...");
    }

    @PreDestroy
    public void end(){
        System.out.println("Audit ended...");
    }

    public void log(double amount) {
        System.out.println("Audit log for loan amount: " + amount);
    }
}
