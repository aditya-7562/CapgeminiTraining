/* 	
Q3. Write a regular expression to validate a password with the following rules:
	Minimum 8 characters
	Must contain at least one uppercase letter
	Must contain at least one digit
 */


//     Password Validation
// 	Rules : Minimum 8 characters ,At least 1 uppercase , At least 1 digit
// 	System.out.println("Pass1234".matches("^(?=.*[A-Z])(?=.*\d).{8,}$"));
	
	
// ^ → start of the string
// (?=.*[A-Z]) → positive lookahead: assert somewhere ahead there is at least one uppercase letter
// (?=.*\d) → positive lookahead: assert somewhere ahead there is at least one digit
// .{8,} → actual matching part: any character (except newline, depending on mode), at least 8 characters
// $ → end of the string
		
		
// cannot merge them into ONE lookahead

// if we write      (?=.*[A-Z]\d)
// This means ,There must be an uppercase letter immediately followed by a digit

// A1bcdefg => true
// Abcde1fg = false


// if we write 	(?=.*[A-Z\d])
// This means, There must be either an uppercase OR a digit
// abcdef  -> false
// abcDef  -> true
// abcdef1 -> true
// ABC     -> true
// 12345   -> true
// abcD1   -> true

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
