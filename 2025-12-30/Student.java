/* WAJP to create a class named Student with following requirements:
   1. Instance variables: id (int), name (String), marks (int[]) size=3
   2. Create:
        a. Parameterized constructor to initialize all variables
        b. Copy constructor to create a copy of an existing Student object
    3. In the main method:
        a. Create a Student object using the parameterized constructor
        b. Create another Student object using the copy constructor 
        c. Modify the marks of both objects.
        c. Print details of both Student objects.
    4. Ensure that changes made to the copied object do not affect the original object.
*/
public class Student {
    int id;
    String name;
    int[] marks;

    // Parameterized Constructor
    public Student(int id, String name, int[] marks) {
        this.id = id;
        this.name = name;
        this.marks = marks.clone(); // Defensive copy
    }
    // Copy Constructor
    public Student(Student obj) {
        this.id = obj.id;
        this.name = obj.name;
        this.marks = obj.marks.clone(); // Deep copy of the marks array
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Student s1 = new Student(1, "Alice", new int[]{85, 90, 95});
        Student s2 = new Student(s1); // Using Copy Constructor
        s1.displayDetails();
        s1.marks[0] = 100;
        s1.displayDetails();

        s2.displayDetails();
        s2.marks[1] = 80;
        s2.displayDetails();

        s1.displayDetails();
    }
}