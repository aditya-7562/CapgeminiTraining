// program to calculate and display the grade of student based on the marks obtained
// Marks >= 90 -> Grade A
// Marks >=75 and < 90 -> Grade B
// Marks >= 60 and < 75 -> Grade C
// Marks >= 40 and < 60 -> Grade D
// Marks < 40 -> Fail

import java.util.*;

class stGrade{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks: ");
		int marks = sc.nextInt();
		if(marks >= 90){
			System.out.println("Grade A");
		} else if(marks >= 75 && marks < 90){
			System.out.println("Grade B");
		} else if(marks >= 60 && marks < 75){
			System.out.println("Grade C");
		} else if(marks >= 40 && marks < 60){
			System.out.println("Grade D");
		} else{
			System.out.println("Fail");
		}
		sc.close();
	}
}
