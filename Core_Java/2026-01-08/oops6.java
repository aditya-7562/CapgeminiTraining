/* 
 *  Abstraction in Java:
    - Abstraction means showing only essential features and hiding the unnecessary details.
    - It helps in reducing complexity and increases efficiency.
    - In Java, abstraction is achieved using abstract classes and interfaces.
    - Concrete method: 
        A method which has a body and it contains the implementation of the method.
    - Concrete class:
        A class is a normal class that is not declared using abstract keyword, has complete method implementation, and allows object creation.
    - Abstract method:
        A method which does not have a body and it is declared using the abstract keyword.
    - Abstract class:
        An abstract class is a class that can not be instantiated and may contain abstract methods.
        It is declared using the abstract keyword.
 */


// Demonstration of Abstraction + Static & Non-Static Members

abstract class Fatherr {

    // static variable
    static int a = 10;

    // non-static variable
    int b = 20;

    // static method
    public static void test() {
        System.out.println("Static method");
    }

    // non-static method
    public void demo() {
        System.out.println("Non-static method");
    }

    // abstract method
    abstract public void abs();

    // static initializer block
    static {
        System.out.println("Static initializer block");
    }

    // instance initializer block
    {
        System.out.println("Instance initializer block");
    }

    // constructor
    public Fatherr() {
        System.out.println("Father Constructor");
    }
}

class Sonnn extends Fatherr {

    // implementing abstract method
    @Override
    public void abs() {
        System.out.println("Abstract method implemented in Son");
    }

    // constructor
    public Sonnn() {
        System.out.println("Son Constructor");
    }
}

public class oops6 {
    public static void main(String[] args) {

        // static members can be accessed without object
        System.out.println("Static variable a = " + Fatherr.a);
        Fatherr.test();

        System.out.println("---------------------");

        // object creation (runtime polymorphism)
        Fatherr f = new Sonnn();

        // non-static methods
        f.demo();
        f.abs();

        System.out.println("Non-static variable b = " + f.b);
    }
}