// program to check divisibility by 7

import java.util.*;

class div7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int a = sc.nextInt();
		if(a%7==0){
			System.out.println(a + " is divisible by 7.");
		} else {
			System.out.println(a + " is not divisible by 7.");
		}
		sc.close();
	}
}
