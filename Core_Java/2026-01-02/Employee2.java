/* Q2. Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, and employee_salary. Provide public getter and setter methods to access and modify the id and name variables, but provide a getter method for the salary variable that returns a formatted string.
------------------------------------------------------------------------------------------
 */
class employee {

    private int employee_id;
    private String employee_name;
    private double employee_salary;

    // Getter and Setter methods
    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_salary() {
        return String.format("%.2f", employee_salary);
    }

    public void setEmployee_salary(double employee_salary) {
        this.employee_salary = employee_salary;
    }
}

public class Employee2 {

    public static void main(String[] args) {
        employee e1 = new employee();
        e1.setEmployee_id(101);
        e1.setEmployee_name("Rahul");
        e1.setEmployee_salary(75000.50);
        System.out.println("Employee ID: " + e1.getEmployee_id());
        System.out.println("Employee Name: " + e1.getEmployee_name());
        System.out.println("Employee Salary: " + e1.getEmployee_salary());
    }

}
