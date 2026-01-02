/*
 -> Why constructor recursion is not possible in Java?
    In Java, constructor recursion is not possible because constructors are meant to initialize objects, and allowing recursion would lead to infinite loops and stack overflow errors. When a constructor calls itself, it creates a new instance of the class each time, which in turn calls the constructor again, leading to an endless cycle. To prevent this, Java does not allow constructors to call themselves directly or indirectly. Instead, constructors can call other constructors of the same class using the "this()" keyword, but this must be done in a way that eventually leads to a base case that does not involve further constructor calls.

->  What is the use of constructor overloading in Java?
    Constructor overloading in Java allows a class to have multiple constructors with different parameter lists. This provides flexibility in object creation, enabling developers to create objects in different ways based on the provided arguments. It enhances code readability and usability by allowing the same class to be instantiated with different sets of data, catering to various initialization needs without the need for multiple classes.

->  Write a difference between constructor overloading and method overloading.
    Constructor Overloading:
    Constructor overloading allows a class to have multiple constructors with different parameter lists. This enables the creation of objects in various ways, providing flexibility in initialization.

    Method Overloading:
    Method overloading allows a class to have multiple methods with the same name but different parameter lists. This enables methods to perform similar tasks with varying inputs, improving code reusability and readability.

->  When do we use parameterized constructor?
    A parameterized constructor is used when we want to initialize an object with specific values at the time of its creation. It allows us to pass arguments to the constructor, enabling the setting of instance variables to desired values right away. This is particularly useful when we need to create objects with different initial states or configurations, as it provides a way to customize the object's attributes during instantiation.

->  What is the use of copy constructor in Java?
    A copy constructor in Java is used to create a new object as a copy of an existing object. It takes another object of the same class as a parameter and initializes the new object's attributes with the values of the passed object's attributes. This is useful for creating duplicates of objects, ensuring that the new object has the same state as the original without affecting it. Copy constructors help in managing object references and preventing unintended modifications to shared data.
*/
public class oops3 {
    public static void main(String[] args) {
        
    }
}
