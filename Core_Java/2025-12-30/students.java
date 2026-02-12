// Constructor Overloading

/* WAJP to create student class consist of 4 data such as:
    id, name, percentage, college name
    create Parameterized constructor to initialize only ID
    create Parameterized constructor to initialize only name
    create Parameterized constructor to initialize only percentage
    create Parameterized constructor to initialize id and name
    create Parameterized constructor to initialize id and percentage
    create Parameterized constructor to initialize name and percentage
    create Parameterized constructor to initialize id, name and percentage
    cretae default constructor to assign default values;
    create one static method called printDetails to print all the details of students
    in main method, create objects using all constructor.
*/

public class students {
    int id;
    String name;
    double percentage;
    static String college = "LPU";

    public students() {
        this.id = -1;
        this.name = "Unknown";
        this.percentage = 0.0;
    }

    public students(int id) {
        this();
        this.id = id;
    }

    public students(String name) {
        this();
        this.name = name;
    }

    public students(double percentage) {
        this();
        this.percentage = percentage;
    }

    public students(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    public students(int id, double percentage) {
        this();
        this.id = id;
        this.percentage = percentage;
    }

    public students(String name, double percentage) {
        this();
        this.name = name;
        this.percentage = percentage;
    }

    public students(int id, String name, double percentage) {
        this();
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }
    public static void printDetails(students s) {
        System.out.println("ID: " + s.id);
        System.out.println("Name: " + s.name);
        System.out.println("Percentage: " + s.percentage);
        System.out.println("College: " + s.college);
    }

    public static void main(String[] args) {
        students s1 = new students();
        printDetails(s1);
        students s2 = new students(1);
        printDetails(s2);
        students s3 = new students("Aditya");
        printDetails(s3);
        students s4 = new students(82.2);
        printDetails(s4);
        students s5 = new students(2, "Vikash");
        printDetails(s5);
        students s6 = new students(3, 85.5);
        printDetails(s6);
        students s7 = new students(4, "Ankit", 85.5);
        printDetails(s7);

    }
}
