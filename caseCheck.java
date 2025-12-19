// program to check wether the char is uppercase, lowercase, digit or special character

import java.util.*;

class caseCheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char c = sc.next().charAt(0);
		if(c >= 'A' && c <= 'Z'){
			System.out.println(c + " is an uppercase character.");
		} else if(c >= 'a' && c <= 'z'){
			System.out.println(c + " is a lowercase character.");
		} else if(c >= '0' && c <= '9'){
			System.out.println(c + " is a digit.");
		} else{
			System.out.println(c + " is a special character.");
		}
	}
}
