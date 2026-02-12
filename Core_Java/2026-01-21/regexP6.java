/* Q5. OTP and PIN Code Validation
	(a) OTP Validation
	Write a regular expression to validate a 6-digit OTP.
	(b) PIN Code Validation
	Write a regular expression to validate a 4-digit PIN.
 */

import java.util.Scanner;

public class regexP6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter OTP: ");
        String otp = sc.nextLine();
        if((otp.matches("([0-9]+){6}"))){
            System.out.println("Validation Successfull.");
        }else{
            System.out.println("Invalid OTP!");
        }

        System.out.println("Enter PIN: ");
        String pin = sc.nextLine();
        if((pin.matches("([0-9]){4}"))){
            System.out.println("Validation Successfull.");
        }else{
            System.out.println("Invalid PIN!");
        }
    }
}
