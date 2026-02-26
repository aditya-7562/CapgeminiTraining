package AnnotationBasedDiDemo.LoanRiskAssessmentSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LoanApprovalService {
    private RiskAssessmentStrategy strategy;
    private RiskAuditService auditService;

    @Autowired
    private ComplianceService complianceService;

    @Autowired
    public LoanApprovalService(@Qualifier("incomeRiskStrategy") RiskAssessmentStrategy strategy) {
        this.strategy = strategy;
    }

    @Autowired
    public void setAuditService(RiskAuditService auditService) {
        this.auditService = auditService;
    }


    public void assess(double amount) {
        strategy.assessRisk(amount);
        auditService.auditLoan(amount);
        complianceService.complianceCheck(amount);
    }
}
