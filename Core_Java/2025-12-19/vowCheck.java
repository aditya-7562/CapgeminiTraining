// program to check vowel or consonant

import java.util.*;

class vowCheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character: ");
		char c = sc.next().charAt(0);
		if(c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'o' || c == 'O' || c == 'u' || c == 'U'){
			System.out.println(c + " is a vowel.");
		} else {
			System.out.println(c + " is a consonant.");
		}
	}
}
