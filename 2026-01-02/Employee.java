/* 2. Write a Java program that performs the following tasks:
Create a class Employee with three attributes: id, name, and sal (salary).
Implement a parameterized constructor to initialize these attributes.
Create a non-static method printDetails() to display employee details.
In the main() method:
Create 4 Employee objects
 */
public class Employee {
    int id;
    String name;
    double sal;
    Employee(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
    void printDetails() {
        System.out.println("Employee ID: " + id + ", Name: " + name + ", Salary: " + sal);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Alice", 50000.0);
        Employee emp2 = new Employee(102, "Bob", 60000.0);
        Employee emp3 = new Employee(103, "Charlie", 70000.0);
        Employee emp4 = new Employee(104, "David", 80000.0);

        emp1.printDetails();
        emp2.printDetails();
        emp3.printDetails();
        emp4.printDetails();
    }
}
