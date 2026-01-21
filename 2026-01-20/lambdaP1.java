/* Create Functional Interface MathOperation with a method int operation(int a, int b).
Use Lambda Expressions to implement: Addition Subtraction Multiplication Division Call and print the result of each operation.

Driver Class Execution
Perform the following tasks:

Store two numbers 60 and 30 in the variables a and b respectively.
Provide adding implementation to the operation method via lambda expression, pass the two variables and print the result with suitable message.
Provide subtraction implementation to the operation method via lambda expression, pass the two variables and print the result.
Provide multiplication implementation to the operation method via lambda expression, pass the two variables and print the result.
Provide division implementation to the operation method via lambda expression, pass the two variables and print the result.
Example Output
Sum of 60 and 30 is 90
Difference between 60 and 30 is 30
Product of 60 and 30 is 1800
Quotient of 60 and 30 is 2
 */


@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}
public class lambdaP1 {
    public static void main(String[] args) {
        int a = 60;
        int b = 30;

        MathOperation add = (x, y) -> x + y;
        System.out.println("Sum of " + a + " and " + b + " is " + add.operation(a, b));

        MathOperation sub = (x, y) -> x - y;
        System.out.println("Difference between " + a + " and " + b + " is " + sub.operation(a, b));

        MathOperation mul = (x, y) -> x * y;
        System.out.println("Product of " + a + " and " + b + " is " + mul.operation(a, b));

        MathOperation div = (x, y) -> x / y;
        System.out.println("Quotient of " + a + " and " + b + " is " + div.operation(a, b));
    }
}
