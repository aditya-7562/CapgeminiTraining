// program to check divisibility by both 3 and 5

import java.util.*;

class div35{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int a = sc.nextInt();
		if(a%3==0 && a%5!=0){
			System.out.println(a + " is divisible by 3 only.");
		} else if(a%5==0 && a%3!=0){
			System.out.println(a + " is divisible by 5 only.");
		} else if(a%3==0 && a%5==0){
			System.out.println(a + " is divisible by both 3 and 5.");
		} else{
			System.out.println(a + " is not divisible by either 3 or 5.");
		}
		sc.close();
	}
}
