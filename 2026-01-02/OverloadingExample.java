/* 3. Write a Java program to demonstrate method overloading by defining both static and non-static methods with the same name but different parameter lists. Your program should include the following:

A class named OverloadingExample containing:

A static method named display() that takes an int parameter and prints a message.
A static method named display() that takes a String parameter and prints a message.
A non-static method named display() that takes two parameters: an int and a double, and prints a message.
A non-static method named display() that takes no parameters and prints a default message. 

---------------------------------------------------------------------------------------
 */
public class OverloadingExample {
    public static void display(int num){
        System.out.println("Static method with int parameter: " + num);
    }
    public static void display(String str){
        System.out.println("Static method with String parameter: " + str);
    }
    public void display(int num, double d){
        System.out.println("Non-static method with int and double parameters: " + num + ", " + d);
    }
    public void display(){
        System.out.println("Non-static method with no parameters.");
    }

    public static void main(String[] args) {
        // Calling static methods
        OverloadingExample.display(10);
        OverloadingExample.display("Hello");

        // Creating an instance to call non-static methods
        OverloadingExample ref = new OverloadingExample();
        ref.display(20, 30.5);
        ref.display();
    }
}