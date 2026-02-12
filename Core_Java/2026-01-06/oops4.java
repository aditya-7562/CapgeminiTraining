/*
 * Types of relationship in Java:
 * 1. HAS-A relationship
 * 2. IS-A relationship
 * 
 * -> HAS-A relationship:
 * 1. Aggregation is a weak HAS-A relationship where the child object is created
 * outside the parent class and can exist independently.
 * 
 * // Aggregation (Weak HAS-A relationship) example:
 * 
 * // class Address {
 * // String city;
 * // String state;
 * // Address(String city, String state) {
 * // this.city = city;
 * // this.state = state;
 * // }
 * // public void display() {
 * // System.out.println("Student City: " + this.city);
 * // System.out.println("Student State: " + this.state);
 * // }
 * // }
 * // class Student {
 * // int id;
 * // String name;
 * // double marks;
 * // Address address;
 * // public Student(int id, String name, double marks, Address adr) {
 * // this.id = id;
 * // this.name = name;
 * // this.marks = marks;
 * // this.address = adr;
 * // }
 * // public void display() {
 * // System.out.println("Student ID: " + this.id);
 * // System.out.println("Student Name: " + this.name);
 * // System.out.println("Student Marks: " + this.marks);
 * // // System.out.println("Student City: " + this.address.city);
 * // // System.out.println("Student State: " + this.address.state);
 * // this.address.display();
 * // }
 * // }
 * // public class oops4 {
 * // public static void main(String[] args) {
 * // Address ad = new Address("Jalandhar", "Punjab");
 * // Student st = new Student(1, "Aditya", 82, ad);
 * // // ad.display();
 * // st.display();
 * // }
 * // }
 * 
 * 
 * 2. Composition is a strong HAS-A relationship where the parent class creates
 * and owns the child object, and the child cannot exist independently.
 * 
 * // Composition (Strong HAS-A relationship) example:
 * // class Engine{
 * // public void start(){
 * // System.out.println("Engine Started");
 * // }
 * // public void stop(){
 * // System.out.println("Engine Stopped");
 * // }
 * // }
 * // class Car{
 * // private Engine engine;
 * // public Car(){
 * // this.engine = new Engine();
 * // }
 * // public void drive(){
 * // engine.start();
 * // System.out.println("Car is running");
 * // }
 * // public void park(){
 * // engine.stop();
 * // System.out.println("Car is parked");
 * // }
 * // }
 * // public class oops4 {
 * // public static void main(String[] args) {
 * // Car car = new Car();
 * // car.drive();
 * // car.park();
 * // }
 * // }
 * 
 * 
 * -> IS-A relationship:
 * 1. Inheritance is an IS-A relationship where a class (child) inherits
 * properties and behaviors from another class (parent), with the help of
 * extends keyword and implements keyword.
 * 2.Fields and methods are inherited subject to access rules. Constructors and
 * initializer blocks are not inherited, but initializer blocks still execute
 * during object creation via the constructor chain.
 * 3. Can we inherit static members? Yes, static members can be inherited.
 * Static members are inherited but are resolved at compile time and are not
 * polymorphic. Static initialization (including static blocks) executes first
 * for the parent class, then for the child class.
 * 
 * 4. Class loading & execution order (this is where most people fail)
 * When you create a child object:
 * 
 * Step 1: Class loading (once per class)
 * 
 * Order:
 * Parent class loads
 * static fields
 * static initializer blocks
 * Child class loads
 * static fields
 * static initializer blocks
 * ✔ Parent always first
 * 
 * Step 2: Object creation (every time)
 * 
 * Order:
 * Parent instance fields
 * Parent instance initializer blocks
 * Parent constructor
 * Child instance fields
 * Child instance initializer blocks
 * Child constructor
 * 
 * 5. Super() calling statement:
 * - The first statement in a child class constructor is either an explicit call
 * to super() or this(). If neither is present, super() is called implicitly.
 * - super() calls the parent class constructor.
 * - We cannot use this() and super() together in the same constructor.
 * - We can use only one super() call in a constructor.
 * 
 * 
 * -> Ques. Write the difference between super() and this().
 * 
 * super():
 * 1. Refers to the parent class.
 * 2. Used to call parent class constructor
 * 
 * this():
 * 1. Refers to the current class.
 * 2. Used to call current class constructor
 */

// Inheritance (IS-A relationship) example:
// class Father {
// int a = 10;
// static int c = 30;

// public static void show() {
// System.out.println("Static method in Father class");
// }

// static {
// System.out.println("Static initializer block in Father class");
// }
// }

// class Son extends Father {
// int b = 20;
// static int d = 40;

// public static void display() {
// System.out.println("Static method in Son class");
// }

// static {
// System.out.println("Static initializer block in Son class");
// }
// }

// public class oops4 {
// static {
// System.out.println("Static initializer block in oops4 class");
// }

// public static void main(String[] args) {
// System.out.println("Main method started");
// Son s = new Son();
// System.out.println("Value of a (inherited from Father): " + s.a);
// System.out.println("Value of b (in Son): " + s.b);

// // Accessing static members
// System.out.println("Value of c (inherited from Father): " + s.c);
// System.out.println("Value of d (in Son): " + s.d);
// s.show(); // Calling inherited static method
// s.display(); // Calling static method in Son class

// // Accessing static members using class names
// System.out.println("Value of c Father: " + Father.c);
// Father.show();
// System.out.println("Value of d Son: " + Son.d);
// Son.display();
// System.out.println("Main method ended");
// }

// }

// -> Types of Inheritance in Java:
// 1. Single Inheritance
// 2. Multilevel Inheritance
// 3. Hierarchical Inheritance
// 4. Multiple Inheritance (through interfaces)
// 5. Hybrid Inheritance (through interfaces)

// Single Inheritance: A subclass inheriting from only one superclass.
// Multilevel Inheritance: A subclass inheriting from a superclass, which in
// turn inherits from another superclass, at different levels.
// Hierarchical Inheritance: Multiple subclasses inheriting from a single
// superclass at same level.
// Multiple Inheritance: A subclass inheriting from multiple superclasses at
// same level (through interfaces). In Java, multiple inheritance is achieved
// using interfaces because of diamond problem. Diamond problem occurs when two
// superclasses have a method with same signature and a subclass inherits from
// both superclasses. This creates ambiguity as to which method the subclass
// should inherit.
// Hybrid Inheritance: A combination of two or more types of inheritance.
