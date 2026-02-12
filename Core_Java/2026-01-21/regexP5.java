/* Q4. Write a regular expression to validate a username with these rules:
	Must start with a letter
	Can contain letters, digits, and underscore (_)
	Length should be between 5 and 15 characters
*/

import java.util.Scanner;

public class regexP5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String input = sc.nextLine();
        if((input.matches("([A-Za-z][A-Za-z0-9_]){4,14}"))){
            System.out.println("Validation Successfull.");
        }else{
            System.out.println("Invalid Username!");
        }
    }
}
