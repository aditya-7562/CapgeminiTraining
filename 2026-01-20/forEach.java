/* For each loop in Java
   A for-each loop is used to iterate through elements in an array or a collection and perform operations on each element.

    Syntax:
     Collection.forEach(element -> {
         // code to be executed for each element
     });
 */

// import java.util.Arrays;
// import java.util.List;

// public class forEach {
//     public static void main(String[] args) {
//         List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Date");
//         fruits.forEach(fruit -> System.out.println(fruit));

//         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//         numbers.forEach(number -> {
//             int square = number * number;
//             System.out.println("Square of " + number + " is: " + square);
//         });

//     }
// }

// WAJP to print objects that ends with sh from names list using forEach loop.

// import java.util.Arrays;
// import java.util.List;
// public class forEach {
//     public static void main(String[] args) {
//         List<String> names = Arrays.asList("Ashish", "Ramesh", "Mihir", "Rajesh", "Anil", "Vikash");
//         names.forEach(name -> {
//             if (name.endsWith("sh")) {
//                 System.out.println(name);
//             }
//         });
//     }
// }

// WAJP to print only even numbers from a list using forEach loop.
// import java.util.Arrays;
// import java.util.List;
// public class forEach {
//     public static void main(String[] args) {
//         List<Integer> numbers = Arrays.asList(10, 15, 22, 33, 40, 55, 60);
//         numbers.forEach(number -> {
//             if(number % 2 == 0) {
//                 System.out.println(number);
//             }
//         });
//     }
// }

// WAJP to print details of students who got more marks than 85.

import java.util.Arrays;
import java.util.List;

public class forEach {
    public static void main(String[] args) {
        List<students> studentList = Arrays.asList(
                new students("Ashish", 90),
                new students("Ramesh", 80),
                new students("Mihir", 88),
                new students("Rajesh", 70));

        studentList.forEach(student -> {
            if (student.marks > 85) {
                System.out.println("Name: " + student.name + ", Marks: " + student.marks);
            }
        });
    }
}

class students {
    String name;
    int marks;

    students(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}