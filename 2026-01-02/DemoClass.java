/* 4. Write a Java program that defines a class named DemoClass with the following specifications:

The class should contain two Static Initialization Blocks (SIBs) that print messages when they execute.
The class should contain one Instance Initialization Block (IIB) that prints a message when it executes.
The class should contain one non-static method named displayMessage(), which prints a message when called.
The class should contain two static methods:
staticMethodOne(): Prints a message when called.
staticMethodTwo(): Prints a different message when called.

Inside the main() method, perform the following actions:
Call both static methods directly using the class name.
Create an object of the class, which should trigger the execution of SIBs, IIB, and constructor
Call the non-static method using the object reference.

-------------------------------------------------------------------------------------
 */
public class DemoClass {
    static {
        System.out.println("Static Initialization Block 1 executed.");
    }
    static {
        System.out.println("Static Initialization Block 2 executed.");
    }
    {
        System.out.println("Instance Initialization Block executed.");
    }
    void displayMessage() {
        System.out.println("Non-static method displayMessage() called.");
    }
    public static void staticMethodOne() {
        System.out.println("Static method staticMethodOne() called.");
    }
    public static void staticMethodTwo() {
        System.out.println("Static method staticMethodTwo() called.");
    }
    public static void main(String[] args) {
        staticMethodOne();
        staticMethodTwo();
        DemoClass obj = new DemoClass();
        obj.displayMessage();
    }
}
