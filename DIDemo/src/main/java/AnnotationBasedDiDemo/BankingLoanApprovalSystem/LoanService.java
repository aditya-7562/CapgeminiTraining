package AnnotationBasedDiDemo.BankingLoanApprovalSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LoanService {

    private final LoanValidator loanValidator;
    private AuditService auditService;

    @Autowired
    public LoanService(@Qualifier("incomeValidator") LoanValidator loanValidator) {
        this.loanValidator = loanValidator;
    }

    @Autowired
    public void setAuditService(AuditService auditService) {
        this.auditService = auditService;
    }

    public void processLoan(double amount) {
        loanValidator.validateLoan(amount);
        auditService.log(amount);
    }
}