// WAJP that demonstrates method overloading by creating a calculator class with methods for addition, subtraction, multiplication, and division of two numbers.

public class methodProblem7 {

    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return (double) a / b;
    }
    public static void main(String[] args) {
        System.out.println("Addition of 10 and 5: " + add(10, 5));
        System.out.println("Subtraction of 10 and 5: " + subtract(10, 5));
        System.out.println("Multiplication of 10 and 5: " + multiply(10, 5));
        System.out.println("Division of 10 and 5: " + divide(10, 5));
    }
}
