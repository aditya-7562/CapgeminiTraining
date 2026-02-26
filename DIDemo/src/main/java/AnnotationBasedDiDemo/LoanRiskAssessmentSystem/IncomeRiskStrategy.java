package AnnotationBasedDiDemo.LoanRiskAssessmentSystem;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class IncomeRiskStrategy implements RiskAssessmentStrategy {
    @Override
    public void assessRisk(double amount) {
        System.out.println("Income Risk Assessment for " + amount);
    }
}
