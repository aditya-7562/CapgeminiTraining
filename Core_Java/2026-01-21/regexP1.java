/*  Required Output: 

Hello World -> true
Java 8 -> true
User1 Name -> true
Suraj Kumar -> true
A B -> true
Test Case -> true
Hello -> false
Java8 -> false
123 -> false
HelloWorld -> false
 Hello World -> false
Hello  World -> false

*/

import java.util.Scanner;

public class regexP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(input.matches("\\w*(\\s){1}\\w*"));
    }
}
