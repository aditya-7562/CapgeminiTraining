/* A company stores employee details along with address information.
Question
Create classes:
	1. Address → city
	2. Employee → id, Address address
Add:
	parameterized constructor
	copy constructor that performs shallow copy
Steps:
	1	Create employee emp1
	2	Create emp2 using copy constructor
	3	Change city via emp2
	4	Print city of both employees
*/
public class Employee {
    int id;
    Address address;

    public Employee(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    public Employee(Employee emp) {
        this.id = emp.id;
        // this.address = new Address(emp.address.city); // Deep copy
        this.address = emp.address; // Shallow copy
    }
    public static void main(String[] args) {
        Address addr1 = new Address("Delhi");
        Employee emp1 = new Employee(101, addr1);
        Employee emp2 = new Employee(emp1); // Using Copy Constructor

        System.out.println("Before changing city:");
        System.out.println("Employee 1 City: " + emp1.address.city);
        System.out.println("Employee 2 City: " + emp2.address.city);

        // Changing city
        emp2.address.city = "Mumbai";
        // emp2.address.city = new Address("Mumbai").city;

        System.out.println("After changing city:");
        System.out.println("Employee 1 City: " + emp1.address.city);
        System.out.println("Employee 2 City: " + emp2.address.city);
    }
}
class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }
}