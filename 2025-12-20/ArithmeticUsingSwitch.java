// WAJP to perform Arithmetic operation using nested switch case.

import java.util.*;

public class ArithmeticUsingSwitch {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the operation you want to perform (+, -, *, /): ");
        char operation = sc.next().charAt(0);
        System.out.println("How many numbers do you want to " + operation + " ?");
        int n = sc.nextInt();
        if(operation == '/' && n > 2) {
            System.out.println("Division can only be performed on two numbers. Try again.");
            return;
        }

        switch (operation) {
            case '+':
                int sum = 0;
                for (int i = 1; i <= n; i++) {
                    System.out.println("Enter number " + i + ": ");
                    int num = sc.nextInt();
                    sum += num;
                }
                System.out.println("The sum is: " + sum);
                break;

            case '-':
                System.out.println("Enter number 1: ");
                int resultSub = sc.nextInt();
                for (int i = 2; i <= n; i++) {
                    System.out.println("Enter number " + i + ": ");
                    int num = sc.nextInt();
                    resultSub -= num;
                }
                System.out.println("The result after subtraction is: " + resultSub);
                break;

            case '*':
                int product = 1;
                for (int i = 1; i <= n; i++) {
                    System.out.println("Enter number " + i + ": ");
                    int num = sc.nextInt();
                    product *= num;
                }
                System.out.println("The product is: " + product);
                break;

            case '/':
                System.out.println("Enter number 1: ");
                double resultDiv = sc.nextDouble();
                System.out.println("Enter number 2: ");
                double num2 = sc.nextDouble();
                if (num2 != 0) {
                    resultDiv /= num2;
                } else {
                    System.out.println("Cannot divide by zero.");
                    return;
                    
                }
                System.out.println("The result after division is: " + resultDiv);
                break;

            default:
                System.out.println("Invalid operation!");
                break;
        }
        sc.close();
    }
}
