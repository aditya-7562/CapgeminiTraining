// Employee Access and Salary Processing System

import java.util.*;

public class EmployeeManagement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();
        System.out.println("Enter Employee Name: ");
        String name = sc.next();
        System.out.println("Enter Employee Age ");
        int age = sc.nextInt();
        if(age < 21){
            System.out.println("Employee is not elegible to work.");
            return;
        }
        System.out.println("Enter Employee Department ID (1-IT, 2-HR, 3-Finance)");
        int department = sc.nextInt();
        System.out.println("Enter Employee Basic Salary: ");
        double baseSalary = sc.nextDouble();


        String role = "";

        switch (department) {
            case 1:
                System.out.println("Enter IT role(Developer, Tester): ");
                role = sc.next();
                break;
            case 2:
                System.out.println("Enter HR role(Recruiter, Payroll): ");
                role = sc.next();
                break;
            case 3:
                System.out.println("Enter Finance role(Accountant, Auditor): ");
                role = sc.next();
                break;
        
            default:
                System.out.println("Invalid department. Try again!");
                break;
        }
        double finalSalary = 0;
        if(department == 1){
            if(role.equalsIgnoreCase("Developer")){
                finalSalary = baseSalary + (baseSalary * 30/100); 
            }else if(role.equalsIgnoreCase("Tester")){
                finalSalary = baseSalary + (baseSalary * 25/100);
            }else{
                System.out.println("Invalid role for IT department.");
            }
        }else if(department == 2){
            if(role.equalsIgnoreCase("Recruiter")){
                finalSalary = baseSalary + (baseSalary * 20/100); 
            }else if(role.equalsIgnoreCase("Payroll")){
                finalSalary = baseSalary + (baseSalary * 22/100);
            }else{
                System.out.println("Invalid role for HR department.");
            }
        }else if(department == 3){
            if(role.equalsIgnoreCase("Accountant")){
                finalSalary = baseSalary + (baseSalary * 28/100); 
            }else if(role.equalsIgnoreCase("Auditor")){
                finalSalary = baseSalary + (baseSalary * 26/100);
            }else{
                System.out.println("Invalid role for Finance department.");
            }
        }else{
            System.out.println("Invalid department!");
        }

        String access = "";
        if(finalSalary >= 60000 && department == 1){
            access = "Admin Access";
        }else if(finalSalary >= 60000 && (department == 2 || department == 3)){
            access = "Manager Access";
        }else{
            access = "Employee Access";
        }

        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Department: " + department);
        System.out.println("Employee Role: " + role);
        System.out.println("Employee Basic Salary: " + baseSalary);
        System.out.println("Employee Final Salary: " + finalSalary);
        System.out.println("Employee Access Level: " + access);

        sc.close();
    }
}
