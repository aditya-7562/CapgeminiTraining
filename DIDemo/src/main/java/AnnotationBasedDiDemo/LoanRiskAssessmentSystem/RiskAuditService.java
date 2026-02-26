package AnnotationBasedDiDemo.LoanRiskAssessmentSystem;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class RiskAuditService {
    @PostConstruct
    public void init() {
        System.out.println("Risk Audit Service Initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Risk Audit Service Destroyed");
    }

    public void auditLoan(double amount) {
        System.out.println("Audit Loan: " + amount);
    }
}
