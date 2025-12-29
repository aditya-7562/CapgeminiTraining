/*
Fitness Tracker

A health and wellness company wants to build a Fitness Tracker in Java to help users monitor their daily step count and estimate calorie expenditure.
The program should demonstrate methods, parameterized methods, and method overloading, while providing an interactive and meaningful user experience.

The system must allow users to input their daily steps, calculate calories burned using different methods, and display a personalized summary report.

Real-World Context
The company, FitTrack Technologies, plans to launch a digital wellness program for employees.
The tracker will record the number of steps each employee takes daily and estimate the calories they burn — either:

using a standard formula (for general users), or
an adjusted formula that considers user weight (for personalized tracking).
This system will serve as a prototype for their upcoming mobile fitness app.

Sample User Data
User	Steps	Weight (kg)
1		5000	60
2		10000	70
3		7500	65
4		12000	80


Methods Overview
1. inputSteps()
Type: No-argument method
Purpose: Prompts the user to enter their daily step count using the Scanner class.

2. calculateCalories(int steps)
Type: Parameterized method
Purpose: Calculates calories burned based only on step count.
Formula:
Calories = steps × 0.04
Returns: Estimated calories burned (without weight consideration).

3. calculateCalories(int steps, double weight) (Overloaded Method)
Type: Parameterized and Overloaded method
Purpose: Calculates calories burned considering the user’s weight for better accuracy.
Formula:
Calories = steps × weight × 0.0005
Returns: Personalized calorie estimate.

4. showSummary()
Type: No-argument method
Purpose: Displays a summary showing total steps and calories burned for the day.

Example Workflow
1> Accept user input using inputSteps().
Example:
Steps = 10000
Weight = 70 kg

2> Compute calories burned using either:
Standard formula: calculateCalories(steps)
Weight-adjusted formula: calculateCalories(steps, weight)

3> Round the result using Math.round() for a clean display.

4> Display results using showSummary().

Example Output
Total Steps: 10000
Calories Burned: 350

Explanation:
Calories = 10000 × 70 × 0.0005 = 350
The program calculates calories based on the user’s step count and weight, rounding the result for clear presentation.
*/
import java.util.*;
public class arrayProblem6 {
    static int steps;
    static double weight;
    public static void main(String[] args) {
        inputSteps();
        showSummary();
    }

    public static void inputSteps() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your daily step count: ");
        steps = scanner.nextInt();
        System.out.print("Enter your weight (kg): ");
        weight = scanner.nextDouble();
    }

    public static double calculateCalories(int steps) {
        return steps * 0.04;
    }

    public static double calculateCalories(int steps, double weight) {
        return steps * weight * 0.0005;
    }

    public static void showSummary() {
        System.out.println("Total Steps: " + steps);
        System.out.println("Calories Burned: " + Math.round(calculateCalories(steps, weight)));
    }
}