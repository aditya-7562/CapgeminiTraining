// WAJP to find the designation of an employee based on the department and role selected by user, each department has 3 roles.
// Departments: IT, HR, Finance, Operations
// IT: Developer, Tester, Devops Engineer
// HR: Recruiter, HR Manager, Payroll Officer
// Finance: Accountant, Financial Analyst, Auditor
// Operations: Operations Executive, Team Lead, Manager

import java.util.*;

public class EmployeeDesignationFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the department (IT, HR, Finance, Operations): ");
        String department = sc.nextLine();

        switch (department) {
            case "IT":
                System.out.println("Enter the role (Developer, Tester, Devops Engineer): ");
                String itRole = sc.nextLine();
                switch (itRole) {
                    case "Developer":
                        System.out.println("You work as a Software Developer in IT department.");
                        break;
                    case "Tester":
                        System.out.println("You work as a QA Tester in IT department.");
                        break;
                    case "Devops Engineer":
                        System.out.println("You work as a DevOps Engineer in IT department.");
                        break;
                    default:
                        System.out.println("Invalid role for IT department.");
                }
                break;
            case "HR":
                System.out.println("Enter the role (Recruiter, HR Manager, Payroll Officer): ");
                String hrRole = sc.nextLine();
                switch (hrRole) {
                    case "Recruiter":
                        System.out.println("You work as a Recruiter in HR department.");
                        break;
                    case "HR Manager":
                        System.out.println("You work as a Human Resources Manager in HR department.");
                        break;
                    case "Payroll Officer":
                        System.out.println("You work as a Payroll Officer in HR department.");
                        break;
                    default:
                        System.out.println("Invalid role for HR department.");
                }
                break;
            case "Finance":
                System.out.println("Enter the role (Accountant, Financial Analyst, Auditor): ");
                String finRole = sc.nextLine();
                switch (finRole) {
                    case "Accountant":
                        System.out.println("You work as an Accountant in Finance department.");
                        break;
                    case "Financial Analyst":
                        System.out.println("You work as a Financial Analyst in Finance department.");
                        break;
                    case "Auditor":
                        System.out.println("You work as an Internal Auditor in Finance department.");
                        break;
                    default:
                        System.out.println("Invalid role for Finance department.");
                }
                break;
            case "Operations":
                System.out.println("Enter the role (Operations Executive, Team Lead, Manager): ");
                String opsRole = sc.nextLine();
                switch (opsRole) {
                    case "Operations Executive":
                        System.out.println("You work as an Operations Executive in Operations department.");
                        break;
                    case "Team Lead":
                        System.out.println("You work as an Operations Team Lead in Operations department.");
                        break;
                    case "Manager":
                        System.out.println("You work as an Operations Manager in Operations department.");
                        break;
                    default:
                        System.out.println("Invalid role for Operations department.");
                }
                break;
            default:
                System.out.println("Invalid department entered.");
        }
        sc.close();
    }
}
