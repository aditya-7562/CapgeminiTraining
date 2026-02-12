/*
 * How to use non static members inside non static context(instance area).
 * -> directly use non static members.
 * -> using this keyword with .(dot) operator. << this.variable or this.method()
 * >>
 */

// public class oops2 {
// int a = 10; // Instance Variable

// public void display() { // Instance Method
// System.out.println("Display starts");

// // Accessing instance variable directly
// System.out.println("Instance a: " + a);

// // Accessing instance variable using 'this' keyword
// System.out.println("Instance a using this: " + this.a);

// System.out.println("Display ends");
// }

// public static void main(String[] args) {
// System.out.println("Main starts");

// // Creating an object to access instance members
// oops2 obj = new oops2();

// // Calling instance method using object reference
// obj.display();

// System.out.println("Main ends");
// }
// }


/*
 * How to use static members inside non static context(instance area).
 * -> directly use static members.
 * -> using class name with .(dot) operator.
 * -> using this keyword with .(dot) operator.
 */
// public class oops2 {
// static int a = 10; // Static Variable

// public void display() { // Instance Method
// System.out.println("Display starts");

// // Accessing static variable directly
// System.out.println("Instance a: " + a);

// // Accessing static variable using class name
// System.out.println("Instance a using class name: " + oops2.a);

// // Accessing static variable using 'this' keyword
// System.out.println("Instance a using this: " + this.a);

// System.out.println("Display ends");
// }

// public static void main(String[] args) {
// System.out.println("Main starts");

// // Creating an object to access instance members
// oops2 obj = new oops2();

// // Calling instance method using object reference
// obj.display();

// System.out.println("Main ends");
// }
// }



// Non static blocks or Instance Initializer blocks in Java:
/*
 * A block which is declared inside class area or global area without static
 * keyword is called non-static block.
 * Non static blocks are executed whenever object is created.
 * Non static blocks are used to initialize instance variables.
 */
// public class oops2 {
// // Non-static block or instance initializer block
// {
// System.out.println("--New Object is Created--");
// }

// public static void main(String[] args) {
// System.out.println("Main starts");
// oops2 obj1 = new oops2(); // First Object Creation
// oops2 obj2 = new oops2(); // Second Object Creation
// oops2 obj3 = new oops2(); // Third Object Creation

// System.out.println("Main ends");
// }
// }


/*
 * Constructor in Java:
 * -> A constructor is a special type of non static member that is called when
 * an object is instantiated.
 * -> It has the same name as the class and does not have a return type.
 * -> Constructors are used to initialize objects.
 * -> Every constructor will have:
 * 1. constructor chaining statement:
 * -> super() calling statement
 * -> this() calling statement
 * 2. PLI: Pre Loading Instructions
 * 3. IIB: Instance Initializer Block (non static block)
 * 4. UWS: User Written Statements
 * 
 * 
 * -> Default Constructor: If no constructor is defined, Java provides a default
 * constructor.
 * 1. It is a no-argument constructor.
 * 2. It initializes instance variables with default values.
 * 3. It calls the superclass's no-argument constructor.
 * 
 * Note: When we have default constructor and non static block, first non static
 * block will be executed followed by default constructor.
 */
// public class oops2 {
// // Default Constructor
// public oops2() {
// System.out.println("Constructor executed");
// }



// // Non-static block or instance initializer block
// {
// System.out.println("Instance Initializer Block executed");
// }

// public static void main(String[] args) {
// System.out.println("Main starts");
// oops2 obj1 = new oops2(); // First Object Creation
// oops2 obj2 = new oops2(); // Second Object Creation
// System.out.println("Main ends");
// }

// static {
// System.out.println("Static block executed");
// }
// }
/*


 * Flow of execution:
 * -> first class static area will be loaded.
 * -> then static blocks will be executed in stack area. // Static block
 * executed
 * -> then main method will be called. // Main starts
 * -> inside main method, when object is created, instance area will be created
 * in heap area and its address will be returned.
 * -> then control will move to constructor area.
 * -> inside constructor area, first super() calling statement will be executed.
 * -> then PLI instructions will be executed which will load non-static members
 * in instance area.
 * -> then IIB instructions will be executed. // Instance Initializer Block
 * executed
 * -> then UWS instructions will be executed. // Constructor executed
 * -> then control will return to main method. // Main ends
 */

/*
 * Ques 1: Write difference between static block and non static block.
 * Ans:
 * Static Block:
 * -> A block which is declared inside class area or global area with static
 * keyword is called static block.
 * -> Static blocks are executed only once when the class is loaded into memory.
 * -> Static blocks are used to initialize static variables.
 * 
 * Non Static Block:
 * -> A block which is declared inside class area or global area without static
 * keyword is called non-static block.
 * -> Non static blocks are executed whenever object is created.
 * -> Non static blocks are used to initialize instance variables.
 * 
 * 
 * Ques 2: Write difference betweeen constructor and method.
 * Ans:
 * Constructor:
 * -> A constructor is a special type of non static member that is called when
 * an object is instantiated.
 * -> It has the same name as the class and does not have a return type.
 * -> Constructors are used to initialize objects.
 * Method:
 * -> Methods are regular functions defined inside a class that perform specific
 * task.
 * -> Methods must have any name and must have a return type (void if no value
 * is returned).
 */



/*
 * Parameterized Constructor:
 * -> A constructor that takes parameters to initialize an object with specific
 * values.
 * -> Used to initialize non static variables during object creation.
 * -> Allows creating multiple objects with different initial values.
 */
// public class oops2 {
//     int id;
//     String name;
//     public oops2(int id, String name){
//         this.id = id;
//         this.name = name;
//         System.out.println("Parameterized Constructor executed: ID = " + this.id + ", Name = " + this.name);
//     }
//     public static void main(String[] args) {
//         System.out.println("Main method start");
//         oops2 ref = new oops2(1, "Aditya");
//         System.out.println("Main method end");
//     }
// }



/* Copy Constructor:
 * -> A constructor that creates a new object as a copy of an existing object.
 * -> It takes an object of the same class as a parameter.
 * -> Used to duplicate objects with the same values.
 */
// public class oops2 {
//     int id;
//     String name;

//     // Parameterized Constructor
//     public oops2(int id, String name){
//         this.id = id;
//         this.name = name;
//     }

//     // Copy Constructor
//     public oops2(oops2 obj){
//         this.id = obj.id;
//         this.name = obj.name;
//     }

//     public static void main(String[] args) {
//         System.out.println("Main method start");
//         oops2 obj1 = new oops2(1, "Aditya");
//         System.out.println(obj1.id + " " + obj1.name);
//         System.out.println("After Copy Constructor");
//         oops2 obj2 = new oops2(obj1); // Using Copy Constructor
//         System.out.println(obj2.id + " " + obj2.name);
//         System.out.println("Main method end");
//     }
// }



/* Constructor Chaining:
 * -> The process of calling one constructor from another constructor within the
 * same class or from the superclass.
 * -> Achieved using this() for same class and super() for superclass.
 * 
 * this():
 *  -> It is a constructor calling statement.
 *  -> Used to call another constructor in the same class.
 *  -> If we have n numbers of constructors, then we can use this() in (n-1)
 *  constructors.
 *  -> If any constructor will have this() calling statement, then it does not have PIL and IIB.
 *  -> In constructor we can use only one this calling statement.
 *  -> It must be the first statement in the constructor.
 *  
 *  Note: Constructor recursion is not allowed in Java because it leads to infinite loop.
 * 
 * super():
 *  -> It is a constructor calling statement.
 *  -> Used to call a constructor from the superclass.
 *  -> It must be the first statement in the subclass constructor
 *  -> If a subclass constructor does not explicitly call super(), the Java compiler automatically inserts a call to the no-argument constructor of the superclass.
 */
public class oops2 {
    int id;
    String name;
    double salary;

    // Default Constructor
    public oops2() {
        this.id = 101;
        this.name = "Unknown";
        this.salary = 50000;
    }

    // Parameterized Constructor
    public oops2(int id) {
        this();
        this.id = id;
    }

    public oops2(String name) {
        this();
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("Main method start");
        oops2 ref = new oops2(1);
        System.out.println(ref.id);
        System.out.println(ref.name);
        System.out.println(ref.salary);
        oops2 ref2 = new oops2("Aditya");
        System.out.println(ref2.id);
        System.out.println(ref2.name);
        System.out.println(ref2.salary);
        System.out.println("Main method end");
    }
}