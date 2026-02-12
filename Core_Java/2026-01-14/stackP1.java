// WAJP for checking the validity of parentheses using stack.

import java.util.Scanner;
import java.util.Stack;

public class stackP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a parentheses string: ");
        String s = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    System.out.println("The parentheses are not valid.");
                    return;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {

                    System.out.println("The parentheses are not valid.");
                    return;
                }
            } else {
                System.out.println("Invalid character found.");
                return;
            }
        }

        if (stack.isEmpty()) {
            System.out.println("The parentheses are valid.");
        } else {
            System.out.println("The parentheses are not valid.");
        }
    }
}
