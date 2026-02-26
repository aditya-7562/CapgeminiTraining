package AnnotationBasedDiDemo.LoanRiskAssessmentSystem;

import org.springframework.stereotype.Component;

@Component
public class ComplianceService {
    public void complianceCheck(double amount) {
        System.out.println("Compliance Check for " + amount);
    }
}
