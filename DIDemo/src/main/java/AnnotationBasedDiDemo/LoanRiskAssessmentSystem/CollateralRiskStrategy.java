package AnnotationBasedDiDemo.LoanRiskAssessmentSystem;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CollateralRiskStrategy implements RiskAssessmentStrategy {
    @Override
    public void assessRisk(double amount) {
        System.out.println("Collateral Risk Assessment  for " + amount);
    }
}
