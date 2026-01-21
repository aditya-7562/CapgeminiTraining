/* Functional Interface:
 An interface that contains only one abstract method is known as a functional interface.
 It can have any number of default or static methods.
 It can be used as the assignment target for a lambda expression or method reference.
 Example: Runnable, Comparator, Callable, etc.

 Lambda Expression:
    A lambda expression is a short block of code which takes in parameters and returns a value.
    It is similar to a method, but it does not need a name and can be implemented right in the body of a method.
    It is used primarily to define the implementation of a functional interface.


 Anonymous Class:
    An anonymous class is a class that is defined and instantiated in a single expression.
    It is used to create a one-time use class that implements an interface or extends a class without having to explicitly define a new class.
    It is often used in event handling and callback scenarios.
    Example:
        Button button = new Button();
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });
*/

@FunctionalInterface
interface Factorial {
    int findFactorial(int n);
}

// class AbsBody implements Factorial{
// public int findFactorial(int n){
// int fact = 1;

// for(int i = n; i >= 1; i--){
// fact *= i;
// }
// return fact;
// }
// }

public class functionalInterface {
    public static void main(String[] args) {
        // Factorial ref = new AbsBody();
        // System.out.println(ref.findFactorial(5));

        Factorial ref = new Factorial() {
            @Override
            public int findFactorial(int n) {
                int fact = 1;
                for (int i = n; i >= 1; i--) {
                    fact *= i;
                }
                return fact;
            }
        };

        System.out.println("Using anonymous class:" + ref.findFactorial(5));

        // Using lambda expression
        Factorial ref2 = (n) -> {
            int fact = 1;
            for (int i = n; i >= 1; i--) {
                fact *= i;
            }
            return fact;
        };

        System.out.println("Using lambda expression:" + ref2.findFactorial(6));

    }
}
