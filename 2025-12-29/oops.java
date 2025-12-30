/**
 * Global Members: members that are accessible from any class.
 * Instance Members: members that are accessible only through instances of a
 * class.
 * Types of global memebers:
 * 1. Static Members: belong to the class itself rather than to any specific
 * instance.
 * - Static Variables: shared among all instances of a class, declared with the
 * 'static' keyword. We can also declare static variables without
 * initialization.
 * - Static Methods: can be called without creating an instance of the class.
 * - Static Blocks: used for static initialization of a class.
 * 2. Non-Static Members (Instance Members): belong to specific instances of a
 * class.
 * - Non-Static Variables: unique to each instance of a class.
 * - Non-Static Methods: operate on instance variables and require an instance
 * to be called.
 * - Non-Static Blocks: used for instance initialization.
 * 
 * 
 * Qus - Write a difference between local and global variable.
 * Ans - Global variables belong to class meanwhile local variables belong to an
 * instance of the class. Global variables have default value so they can be
 * declared without initialization which is not true for local variables. Since
 * global variable belong to class they don't need an instance to be used in the
 * main, meanwhile local variable are tied to an instance. Global variables are
 * static and instance variable are dianamic in nature.
 * 
 * 
 * When we have static variable and local variable with same name used inside
 * static context(local area) priority is given to local variable. To use static
 * variable we have to use .(dot) operator with class << className.variable >>
 * 
 * 
 * for execution program JVM have some memory areas.
 * 1. class static area:
 * Every class will have a dedicated memory to store all static members is known
 * as class static area. The name of class static area is same as ClassName.
 * Every static context is directly pointing towards class static area.
 * 2. Stack area:
 * It is used for execution.
 * 3. Heap area
 * 
 * Note: for execution JVM first calls main method.
 */

// public class oops {

//     // Class Area or Global Area or Static Area
//     // static int a = 10; // Static Variable
//     static int a; // Static Variable can be declared without initialization

//     public static void main(String[] args) {
//         // Method Area or local Area or static context
//         System.out.println("Main Start");
//         System.out.println(a); // Accessing static variable directly
//         test();
//         System.out.println("Main end");
//     }

//     public static void test() {
//         System.out.println("Test start");
//         System.out.println(a);
//         int a = 25;
//         System.out.println(a);
//         System.out.println(oops.a);
//         System.out.println("Test end");
//     }
// }

/**
 * Static Block:
 * - A block of code enclosed in static { ... }.
 * - It is used to initialize static data members.
 * - It is executed ONLY ONCE when the class is loaded into memory, even before
 * the main method.
 * - A class can have multiple static blocks, and they are executed from top to
 * bottom.
 * 
 * Execution Flow:
 * 1. Class Loading -> 2. Static Block Execution -> 3. Main Method Execution
 * 
 * Difference between Static Method and Static Block:
 * 1. Purpose:
 * - Static Method: Define behavior/logic belonging to the class.
 * - Static Block: Initialize static variables or perform one-time setup.
 * 2. Execution:
 * - Static Method: Executed ONLY when called explicitly (e.g., A.test()).
 * - Static Block: Executed AUTOMATICALLY when class is loaded (before main).
 * 3. Recurrence:
 * - Static Method: Can be called multiple times.
 * - Static Block: Executed only once per class loading.
 * 4. Arguments/Return:
 * - Static Method: Can have arguments and return types.
 * - Static Block: No arguments or return types possible.
 */

// public class oops {
// public static void main(String[] args) {
// System.out.println("Main starts");
// A.test();
// System.out.println("Main ends");
// }

// static {
// System.out.println("Welcome to LPU");
// }
// }

// class A {
// static {
// System.out.println("Welcome to class A");
// }

// public static void test() {
// System.out.println("Test starts");
// System.out.println("Test ends");
// }
// }

/*
 * Objects:
 * - An object is an instance of a class that encapsulates data and behavior.
 * - Objects are created in the Heap Area.
 * - We use the 'new' keyword to create an object.
 * - To access instance members (non-static variables and methods), we must
 * create an object.
 * 
 * Syntax:
 * ClassName variableName = new ClassName();
 * 
 * Breakdown:
 * - ClassName variableName: Creates a reference variable in the Stack Area.
 * - new ClassName(): Creates the actual object in the Heap Area and initializes
 * it.
 * - = : Assigns the address of the object in Heap to the reference variable in
 * Stack.
 * 
 * What is New?
 * - The 'new' keyword allocates memory for the object in the Heap Area.
 * - It returns the address of the newly created object.
 * - This address is stored in the reference variable.
 * - It is a unary operator.
 *
 * Note: ClassName is a non primitive data type which is used to store address
 * of an object.
 * 
 * Note: Non-Static members can be accessed inside static context only through
 * object reference variable.
 */

// public class oops {
// // Instance Variable (Non-static)
// int a = 10;

// public static void main(String[] args) {
// // System.out.println(a); // Error: Cannot make a static reference to the
// // non-static field a

// System.out.println("Main starts");

// // Creating an Object of class 'oops'
// oops obj = new oops();

// // Accessing Instance Variable using object reference
// System.out.println("Value of a: " + obj.a);

// // Calling Instance Method using object reference
// obj.display();

// System.out.println("Main ends");
// }

// // Instance Method (Non-static)
// public void display() {
// System.out.println("This is a non-static method.");
// }
// }

/*
 * How to use static members directly inside static context.
 * -> directly use static members.
 * -> using class name with .(dot) operator.
 * -> using object reference with .(dot) operator.
 */

// public class oops {
//     static int a = 10; // Static Variable

//     int b = 20; // Instance Variable

//     public static void main(String[] args) {
//         System.out.println("Main starts");

//         // Accessing static variable directly
//         System.out.println("Static a: " + a);

//         // Accessing static variable using class name
//         System.out.println("Static a: " + oops.a);

//         // Creating an object to access instance variable
//         oops obj = new oops();
//         System.out.println("Instance b: " + obj.a); // Accessing static variable using object reference
//         System.out.println("Instance b: " + obj.b); // Accessing instance variable using object reference

//         System.out.println("Main ends");
//     }
// }

/*
 * Write a difference between static and non-static variables.
 * Static Variables:
 * 1. Belong to the class itself rather than any specific instance.
 * 2. Shared among all instances of the class.
 * 3. Declared with the 'static' keyword.
 * 4. Can be accessed directly in static context.
 * Non-Static Variables:
 * 1. Belong to specific instances of the class.
 * 2. Unique to each instance of the class.
 * 3. Declared without the 'static' keyword.
 * 4. Require an instance to be accessed in static context.
 */

// public class oops {
//     static String user;

//     public static void main(String[] args) {
//         System.out.println("Main starts");
//         oops obj1 = new oops();
//         obj1.user = "Alice";
//         oops obj2 = new oops();
//         obj2.user = "Bob";
//         System.out.println("User of obj1: " + obj1.user); // Both will print "Bob"
//         System.out.println("User of obj2: " + obj2.user);
//         System.out.println("Main ends");
//     }
// }


/* Whenever we have static variable and local variable with same name used inside non-static context(instance area) priority is given to local variable. To use static variable we have to use .(dot) operator with class << className.variable >>. To use instance variable we have to use this keyword << this.variable >>

This :
    - this is a keyword
    - it is a non static reference variable
    - it is used to store address of current object.
    - it can be used only inside non static context(instance area)
 */
public class oops {
    public void test() {
        System.out.println("Test starts");
        System.out.println( "this: " + this);
        System.out.println("test ends");
    }
    public static void main(String[] args) {
        System.out.println("Main starts");
        oops ref1 = new oops();
        System.out.println("ref1: " + ref1);
        oops ref2 = new oops();
        System.out.println("ref2: " + ref2);
        oops ref3 = new oops();
        System.out.println("ref3: " + ref3);
        ref2.test();
//      this.test(); // Error: Cannot use 'this' in a static context
        System.out.println("Main ends");
    }
}

