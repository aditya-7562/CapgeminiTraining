package AnnotationBasedDiDemo.LoanRiskAssessmentSystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RiskConfig.class);

        LoanApprovalService loanApprovalService = context.getBean(LoanApprovalService.class);
        loanApprovalService.assess(50000);

        context.close();
    }
}
