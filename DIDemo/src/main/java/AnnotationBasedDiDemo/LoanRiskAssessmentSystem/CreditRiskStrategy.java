package AnnotationBasedDiDemo.LoanRiskAssessmentSystem;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CreditRiskStrategy implements RiskAssessmentStrategy {
    @Override
    public void assessRisk(double amount) {
        System.out.println("Income Risk Assessment for " + amount);
    }
}
