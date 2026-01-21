/* Q1. Write a regular expression to validate a mobile number with the following rules:
	Must start with 6, 7, 8, or 9
	Must contain exactly 10 digits
 */

import java.util.Scanner;

public class regexP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mobile number: ");
        String input = sc.nextLine();
        if((input.matches("[6-9]\\d{9}"))){
            System.out.println("Validation Successfull.");
        }else{
            System.out.println("Invalid mobile number!");
        }

    }
}
