// Method Overloading: Create a class with multiple methods having the same name but different parameter lists. Demonstrate method overloading by calling these methods with different arguments.


public class methodProblem5 {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static long add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2 and 3: " + add(2, 3));
        System.out.println("Sum of 2.5 and 3.5: " + add(2.5, 3.5));
        System.out.println("Sum of 1, 2 and 3: " + add(1, 2, 3));
    }

}
