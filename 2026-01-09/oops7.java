/* Interface: 
   - interface is a keyword.
   - used to create non primitive data type.
   - used to achieve full abstraction.
   - used to achieve multiple inheritance.
   - to inherit interface we use "implements" keyword.
   - with the help of implements keyword a class can inherit more than one interface.
   - we cannot create the object of interface.
   - we cannot create static initializer block, instance initializer block and constructor in interface.
   - by default all the non static methods of interface are abstract and public.
   - by default all the variables of interface are final and static and public, since it's final we cannot change the value of variable.
   - static methods of interface can be called by using interface name.


   Note:
    - If we want to inherit one class into another class, we use "extends" keyword.
    - If we want to inherit one interface into another interface, we use "extends" keyword.
    - If we want to inherit one interface into a class, we use "implements" keyword.
    - If we try to inherit a class into an interface, it's not possible in java.


    Types of interface:
        1. Regular interface
        2. Marker interface
        3. Functional interface
 */


// interface Father {
//     abstract public void test();
//     abstract public int add(int a, int b);
// }

// class Son implements Father {
//     @Override
//     public void test() {
//         System.out.println("This is test method from Father interface.");
//     }

//     @Override
//     public int add(int a, int b) {
//         return a + b;
//     }
// }

// public class oops7 {
//     public static void main(String[] args) {
//         System.out.println(("Main starts"));
//         // Father ref = new Father(); // Cannot instantiate interface
//         Father ref = new Son();
//         ref.test();
//         System.out.println("Sum: " + ref.add(5, 10));
//         System.out.println("Main ends");
//     }
// }


// interface Father{
//     static int a = 10;
//     int b = 20;
//     public static void test(){
//         System.out.println("This is static test method from Father interface.");
//     }
//     abstract public void abs();
// }

// class Son implements Father{
//     @Override
//     public void abs() {
//         System.out.println("This is abstract method from Father interface implemented in Son class.");
//     }
// }

// public class oops7 {
//     public static void main(String[] args) {
//         System.out.println(("Main starts"));
//         // Father ref = new Father(); // Cannot instantiate interface
//         Father ref = new Son();
//         ref.abs();
//         System.out.println(Father.a);
//         System.out.println(Father.b);
//         // ref.b = 30; // Cannot assign a value to final variable b

//         // ref.test(); // Cannot call static method using instance reference
//         Father.test(); // Correct way to call static method of interface
//         System.out.println("Main ends");
//     }
// }


//marker interface
interface I1 {
    // No methods or fields
}

// regular or normal interface
interface I2{
    void test1();
    void test2();
}

// Functional interface
@FunctionalInterface
interface I3{
    void demo(); // can have only one abstract method
}

public class oops7 {
    public static void main(String[] args) {

    }
}