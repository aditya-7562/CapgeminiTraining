// Q7. Write a regular expression to validate a date in the format: dd-mm-yyyy

import java.util.Scanner;

public class regexP8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Indian Vehicle number: ");
        String input = sc.nextLine();
        if((input.matches("([0-9]{2}-){2}[0-9]{4}"))){
            System.out.println("Validation Successfull.");
        }else{
            System.out.println("Invalid Vehicle Number!");
        }
    }
}
