/*
Savings Prediction Calculation

Question Description
A finance app predicts savings based on monthly income and expense habits.

Implement overloaded methods named predict to calculate the expected savings.

Methods
	double predict(double income, double expenses)
	double predict(double income, double expenses, boolean festiveMonth)
	
Rules
	Base Savings = income − expenses
	Festive Month → expenses increase by 20%
	
Hardcoded Data Set to Use
	Income = 45000
	Expenses = 30000
	Festive Month = true

Expected Output
	Festive expenses = 36000
	Savings = 9000
*/
public class arrayProblem4 {

    public static double predict(double income, double expenses) {
        return income - expenses;
    }
    public static double predict(double income, double expenses, boolean festiveMonth) {
        if (festiveMonth) {
            expenses *= 1.2;
        }
        return income - expenses;
    }
    public static void main(String[] args) {
        double income = 45000;
        double expenses = 30000;
        boolean festiveMonth = true;

        double savings;
        if (festiveMonth) {
            savings = predict(income, expenses, festiveMonth);
        } else {
            savings = predict(income, expenses);
        }
        System.out.println("Festive expenses = " + (expenses * 1.2));
        System.out.println("Savings = " + savings);

    }
}
