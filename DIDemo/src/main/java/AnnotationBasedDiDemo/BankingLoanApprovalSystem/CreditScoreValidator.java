package AnnotationBasedDiDemo.BankingLoanApprovalSystem;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CreditScoreValidator implements LoanValidator{

    @Override
    public void validateLoan(double amount) {
        System.out.println("Amount: " + amount + " is validated via Credit Score Validator!!");
    }
}
