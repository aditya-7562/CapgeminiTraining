// program to check wether the character is a digit or not

import java.util.*;

class digitCheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char c = sc.next().charAt(0);
		if(c >= '0' && c <= '9'){
			System.out.println(c + " is a digit.");
		} else {
			System.out.println(c + " is not a digit.");
		}
	}
}
