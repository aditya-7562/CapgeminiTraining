package main.com.tyss;

public class LoanService {
    public boolean isEligible(int age, double salary){
        boolean isElegible = false;
        if(age >= 21 && age <= 60){
            if(salary >= 25000){
                isElegible = true;
            }
        }
        return isElegible;
    }

    public double calculateEMI(double loanAmount, int tenureYears) {
        if (loanAmount <= 0) {
            throw new IllegalArgumentException("Loan amount must be greater than 0");
        }
        if (tenureYears <= 0) {
            throw new IllegalArgumentException("Tenure must be greater than 0");
        }
        return loanAmount / (tenureYears * 12);
    }

    public String getLoanCategory(int creditScore){
        String category = "";
        if(creditScore >= 750){
            category = "Premium";
        }else if (creditScore >= 600){
            category = "Standard";
        }else{
            category = "High Risk";
        }
        return category;
    }

}
