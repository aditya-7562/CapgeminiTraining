/* Method References in Java
   A method reference is a shorthand notation of a lambda expression to call a method. It is used to refer to methods without executing them.
   Method reference works only when lambda directly calls one existing method.

    Syntax:
     ClassName::methodName
     instance::methodName
     ClassName::new (for constructor references)

    Example:
     FI2 obj = Integer::sum; // Method reference to static method
*/

// import java.util.Arrays;
// import java.util.List;

// @FunctionalInterface
// interface FI2 {
//     int add(int a, int b);
// }

// public class methodReference {
//     public static void main(String[] args) {
//         FI2 obj1 = (a, b) -> a + b; // Lambda expression
//         System.out.println("Sum using Lambda: " + obj1.add(5, 10));

//         FI2 obj2 = Integer::sum; // Method reference
//         System.out.println("Sum using Method Reference: " + obj2.add(5, 10));

//         List<String> names = Arrays.asList("Ashish", "Ramesh", "Mihir", "Rajesh", "Anil", "Vikash");
//         System.out.println("Names: " + names);
//         System.out.println("Using Lambda:");
//         names.forEach(name -> System.out.println(name));
//         System.out.println("Using Method Reference:");
//         names.forEach(System.out::println);
//     }
// }

import java.util.List;

class Emp{
    int id;
    String name;
    double sal;

    Emp(int id, String name, double sal){
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public void printDetails(){
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + sal);
    }
}

public class methodReference {
    public static void main(String[] args) {
        List<Emp> employees = List.of(
            new Emp(1, "Ashish", 90000),
            new Emp(2, "Ramesh", 80000),
            new Emp(3, "Mihir", 95000),
            new Emp(4, "Rajesh", 70000),
            new Emp(5, "Anil", 88000)
        );

        System.out.println(employees);
        employees.forEach(emp -> emp.printDetails()); // Using Lambda
        System.out.println("Using Method Reference:");
        employees.forEach(Emp::printDetails); // Using Method Reference
    }
}