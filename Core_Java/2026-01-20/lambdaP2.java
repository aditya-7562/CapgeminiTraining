/* Auto-Approval System for Loan Applications
Scenario
A small digital-lending company wants to automate the loan pre-approval process for applicants.
The company uses simple business rules (like checking income, credit score, or requested loan amount) to decide whether an application should be auto-approved before it is reviewed by a human loan officer.

To keep the system flexible and easy to extend, the company wants to avoid creating multiple rule classes.
Instead, they want to pass approval rules as behavior, allowing the system to switch or add rules at runtime.

The development team decides to use functional programming concepts in Java, specifically:

A custom functional interface representing an approval rule\
Lambda expressions to implement these rules dynamically\
A method that accepts these rules as input
What Students Must Build
Students should write Java code (without using streams) to:

1. Create a functional interface
Represents a loan approval rule.
Contains one abstract method that accepts a loan application and returns a boolean.
2. Create a LoanApplication class
Include fields such as: - Applicant income

Applicant credit score
Loan amount requested
3. Implement approval rules using lambda expressions
Below are the exact business rules you must implement:

✔ Rule 1: Credit Score Rule
Approve the loan only if:
creditScore >= 700

✔ Rule 2: Income Rule
Approve the loan only if:
income >= 50000

✔ Rule 3: Safe Borrowing Rule
The amount requested must be less than or equal to 30% of the applicant's income:
amountRequested <= income * 0.30

4. Write a method that accepts
A LoanApplication object
A functional-interface-based approval rule
Returns whether the application is approved by that rule
5. Demonstrate usage
Students must:

Create a sample loan application with the following values:
Field	Value
Income	60,000
Credit Score	720
Amount Requested	36,000
Apply all three rules using lambda expressions
Print whether each rule approves or rejects the application
​
Learning Outcomes
By completing this task, students will understand:

How to define and use functional interfaces
How to implement lambda expressions
How to pass behavior (rules) as function parameters
How functional programming reduces boilerplate compared to traditional OOP strategies
Expected Output (Sample)
After implementing the scenario, and using the provided object values:

Credit Score Rule: Approved
Income Rule: Approved
Safe Borrow Rule: Rejected
 */

@FunctionalInterface
interface LoanApprovalRule {
    boolean approve(LoanApplication app);
}

public class lambdaP2 {
    public static void main(String[] args) {

        LoanApplication application = new LoanApplication(60000, 720, 36000);

        LoanApprovalRule creditScoreRule = (app) -> app.getCreditScore() >= 700;
        LoanApprovalRule incomeRule = (app) -> app.getIncome() >= 50000;
        LoanApprovalRule safeBorrowingRule = (app) -> app.getAmountRequested() <= app.getIncome() * 0.30;

        lambdaP2 processor = new lambdaP2();

        boolean creditScoreResult = processor.processLoan(application, creditScoreRule);
        System.out.println("Credit Score Rule: " + (creditScoreResult ? "Approved" : "Rejected"));

        boolean incomeResult = processor.processLoan(application, incomeRule);
        System.out.println("Income Rule: " + (incomeResult ? "Approved" : "Rejected"));

        boolean safeBorrowingResult = processor.processLoan(application, safeBorrowingRule);
        System.out.println("Safe Borrow Rule: " + (safeBorrowingResult ? "Approved" : "Rejected"));
    }

    private boolean processLoan(LoanApplication app, LoanApprovalRule rule) {
        return rule.approve(app);
    }
}

class LoanApplication {
    double income;
    int creditScore;
    double amountRequested;

    LoanApplication(double income, int creditScore, double amountRequested) {
        this.income = income;
        this.creditScore = creditScore;
        this.amountRequested = amountRequested;
    }

    public double getIncome() {
        return income;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public double getAmountRequested() {
        return amountRequested;
    }
}