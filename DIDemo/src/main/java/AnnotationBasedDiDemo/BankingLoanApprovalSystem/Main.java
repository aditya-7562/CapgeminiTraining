package AnnotationBasedDiDemo.BankingLoanApprovalSystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BankAppConfig.class);

        LoanService loanService = context.getBean(LoanService.class);
        loanService.processLoan(500000);

        context.close();
    }
}
