/*
Loan Payable Amount Calculation

Question Description

A bank wants to compute the payable loan amount under different interest structures.

Implement overloaded methods named loan to calculate the final payable amount based on the provided inputs.

Overloads Required
double loan(double principal)
double loan(double principal, int years)
double loan(double principal, int years, String loanType)


Rules
Base Interest
	Default interest is 8% simple interest when only principal is provided.
With Years
	When years are provided, interest is compounded annually at 10%.
With Loan Type
	HOME → compound annually at 7%
	AUTO → compound annually at 9%
	PERSONAL → compound annually at 12%
	
Hardcoded Data Set to Use
	Principal = 200000
	Years = 5
	Loan Type = "HOME"
	
Expected Output
	HOME loan compound rate = 7%
	Amount = 200000 * (1.0.07)^5 = 280510.35
*/
public class arrayProblem5 {
    public static void main(String[] args) {
        double principal = 200000;
        int years = 5;
        String loanType = "HOME";

        double amount = loan(principal, years, loanType);
        System.out.println("HOME loan compound rate = 7%");
        System.out.println("Amount = " + Math.round(amount));
    }

    public static double loan(double principal) {
        return principal + (principal * 0.08);
    }

    public static double loan(double principal, int years) {
        return principal * Math.pow(1.1, years);
    }

    public static double loan(double principal, int years, String loanType) {
        double rate = 0;
        if (loanType.equals("HOME")) {
            rate = 0.07;
        } else if (loanType.equals("AUTO")) {
            rate = 0.09;
        } else if (loanType.equals("PERSONAL")) {
            rate = 0.12;
        }
        return principal * Math.pow(1 + rate, years);
    }
}