
/*
    WAP to check the given character is

    uppercase vowel
    uppercase consonant
    lowercase vowel
    lowercase consonant

    if the given character is uppercase vowel, print numbers from the range 10 to 20 using do while loop
    if the given character is lowercase vowel, print numbers from the range -10 to -20 using while loop
    if the given character is uppercase consonant, print numbers from the range 25 to 15 using for loop
    if the given character is lowercase consonant, print numbers from the range -25 to -15 using for loop
*/
import java.util.*;

public class forLoopProblem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            int i = 10;
            do {
                System.out.print(i + " ");
                i++;
            } while (i <= 20);
        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            int i = -10;
            while (i >= -20) {
                System.out.print(i + " ");
                i--;
            }
        } else if (ch >= 'A' && ch <= 'Z') {
            for (int i = 25; i >= 15; i--) {
                System.out.print(i + " ");
            }
        } else if (ch >= 'a' && ch <= 'z') {
            for (int i = -25; i <= -15; i++) {
                System.out.print(i + " ");
            }
        }
    }
}