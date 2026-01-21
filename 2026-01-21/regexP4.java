/* 	
Q3. Write a regular expression to validate a password with the following rules:
	Minimum 8 characters
	Must contain at least one uppercase letter
	Must contain at least one digit
 */

import java.util.Scanner;

public class regexP4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you password:");
        String input = sc.nextLine();
        if(input.matches("(?=.*[A-Z])(?=.*[0-9]).{8,20}")){
            System.out.println("Validation Successfull.");
        }else{
            System.out.println("Invalid password!");
        }
    }
}
