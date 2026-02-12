// progrma to use switch to display student grades.

import java.util.Scanner;

public class switchGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade: ");
        char c = sc.next().charAt(0);

        switch (c) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Fair");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            case 'F':
                System.out.println("Fail");
                break;
        
            default:
                System.out.println("Invalid Grade!");
                break;
        }
        sc.close();
    }
}
