/* Q2. Write a regular expression to validate an email ID with the following conditions:
	Username part can contain:
	letters (a–z, A–Z)
	digits (0–9)
	special characters: . _ % + -
	Must contain @
	Domain name should contain only letters
	Extension should contain at least 2 letters
 */

import java.util.Scanner;

public class regexP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you eamil id:");
        String input = sc.nextLine();
        if(input.matches("[a-zA-Z0-9_%+-]+@[A-Za-z]+\\.[A-Za-z]{2,9}")){
            System.out.println("Validation Successfull.");
        }else{
            System.out.println("Invalid email!");
        }
    }
}
