// WAJP to check the given character is lowercase Vowel or lowercase Consonant or uppercase vowel or uppercase consonant.

import java.util.Scanner;

public class caseVowConstCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a lowercase vowel.");
            } else {
                System.out.println(ch + " is a lowercase consonant.");
            }
        } else if (ch >= 'A' && ch <= 'Z') {

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch + " is an uppercase vowel.");
            } else {
                System.out.println(ch + " is an uppercase consonant.");
            }
        } else {
            System.out.println(ch + " is not an alphabet character.");
        }

        sc.close();
    }
}