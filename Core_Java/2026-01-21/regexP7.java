// Q6. Write a regular expression to validate an Indian vehicle number in the following format:MH12AB1234

import java.util.Scanner;

public class regexP7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Indian Vehicle number: ");
        String otp = sc.nextLine();
        if((otp.matches("[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}"))){
            System.out.println("Validation Successfull.");
        }else{
            System.out.println("Invalid Vehicle Number!");
        }
    }
}
