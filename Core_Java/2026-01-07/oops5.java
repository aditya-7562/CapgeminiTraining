/* Diamond Problem in Java
   When a class inherits from two classes that have a common base class, it can lead to ambiguity.
   Java avoids this problem by not allowing multiple inheritance with classes. Instead, Java uses interfaces to achieve similar functionality.


   TypeCasting in Java
   Type casting is the process of converting a variable from one data type to another. In Java, there are two types of type casting:

   - Primitive Type Casting: Converting between primitive data types (e.g., int to double).
        1. Widening Casting (automatically) - converting a smaller type to a larger type size
           byte -> short -> char -> int -> long -> float -> double
        2. Narrowing Casting (manually) - converting a larger type to a smaller size type
           double -> float -> long -> int -> char -> short -> byte

   - Non-Primitive Type Casting: Converting between object types (e.g., subclass to superclass).
        1. Upcasting (automatically) - converting a subclass type to a superclass type
        2. Downcasting (manually) - converting a superclass type to a subclass type


    - Upcasting:
        Upcasting is the process of converting a subclass type to a superclass type. This is done automatically by the Java compiler.
        Example:
            Son son = new Son();
            Father father = son; // Upcasting
                        OR
            Father father = new Son(); // Upcasting
        
        We create an object of the subclass (Son) and assign it to a reference variable of the superclass (Father).
        With upcasting, we can only access the members (methods and variables) that are defined in the superclass.

    - Downcasting:
        Downcasting is the process of converting a superclass type to a subclass type. This must be done manually by the programmer.
        Example:
            Father father = new Son(); // Upcasting
            Son son = (Son) father; // Downcasting
        We first upcast a Son object to a Father reference, and then downcast it back to a Son reference.
        If we try to do downcasting without upcasting first, it will result in a ClassCastException at runtime.
        With downcasting, we can access all the members of subclass and superclass.

        // class Father{
        //     int a = 10;
        // }
        // class Son extends Father{
        //     int b = 20;
        // }
        // public class oops5 {
        //     public static void main(String[] args) {
        //         Father ref1 = new Father();
        //         System.out.println(ref1.a);
        //         // System.out.println(ref1.b); // Error: b not found in Father
        
        //         Son ref2 = new Son();
        //         System.out.println(ref2.a); // Inherited from Father
        //         System.out.println(ref2.b);
        
        //         // Upcasting
        //         Father ref3 = new Son(); // Son object referenced by Father type
        //         System.out.println(ref3.a);
        //         // System.out.println(ref3.b); // Error: b not found in Father
        
        //         // Downcasting
        //         Son ref4 = (Son) ref3; // Casting back to Son
        //         System.out.println(ref4.a); // Inherited from Father
        //         System.out.println(ref4.b); // Now accessible
        //     }
        // }
    


    Polymorphism in Java:
        - Ability of object to exhibit multiple forms.
        - One name but different behaviors.
        
        Types of Polymorphism:
        1. Compile-time Polymorphism (Method Overloading, Operator Overloading):
        - happens during compile time.
        - static binding(early binding).
            1. Method Overloading: Same method name with different parameters (type, number, order).
            2. Operator Overloading: Same operator behaves differently based on operand types (e.g., + for addition and concatenation).
            3. Constructor Overloading: Same constructor name with different parameters.
            4. Variable Shadowing: Local variable with same name as instance variable.
            5. Method Shadowing: Subclass method with same name as superclass method (static methods).

        - Variable Shadowing:
            Variable shadowing happens when a variable declared in an inner scope has the same name as a variable in an outer scope, and the inner one hides the outer one. It's decided at compile-time. Variable access depends on reference type, not object type

            This applies to:
            - Local variable vs instance variable
            - Instance variable vs static variable
            - Child class variable vs parent class variable

        - Variable Shadowing Example:
            class A {
                int x = 10;
                void display() {
                    int x = 20; // Local variable shadows instance variable
                    System.out.println(x); // prints 20
                    System.out.println(this.x); // prints 10
                }
            }

        - Method Shadowing:
            Method shadowing (a.k.a. static method hiding) occurs when a static method in a child class has the same signature as a static method in the parent class.
            This is method hiding, not method overriding, as static methods are resolved at compile-time based on reference type.


    2. Runtime Polymorphism (Method Overriding):
        - happens during runtime.
        - dynamic binding(late binding).
        - depends on object type, not reference type.
        - Method Overriding: Subclass provides specific implementation of a method already defined in its superclass.
            Rules for Method Overriding:
            1. Same method name, return type, and parameters.
            2. Access level cannot be more restrictive than the overridden method.
            3. Cannot override final methods.
            4. Cannot override static methods (method hiding instead).
            5. Can override methods declared in abstract classes or interfaces.
            6. Can throw same or narrower exceptions. 

        - Example of Method Overriding:
            class Animal {
                void sound() {
                    System.out.println("Animal makes a sound");
                }
            }
            class Dog extends Animal {
                @Override
                void sound() {
                    System.out.println("Dog barks");
                }
            }
            public class TestPolymorphism {
                public static void main(String[] args) {
                    Animal myAnimal = new Dog(); // Upcasting
                    myAnimal.sound(); // Outputs: Dog barks
                }
            }
        
        - Annotation @Override:
            - Used to indicate that a method is intended to override a method in a superclass.
            - Helps catch errors at compile-time if the method does not correctly override a method in the superclass.
*/

