/*
Write a Java program that uses only parameterized methods (no logic in main) to analyze a given number.
	You must implement the following parameterized methods:

	Required Methods
	1.	int reverseNumber(int num)
	→ Returns the reverse of the number.
	
	2.	boolean isPalindrome(int num, int reversed)
	→ Returns true if the number is a palindrome.
	
	3.	boolean isStrongNumber(int num)
	→ Returns true if the number is a Strong Number
	
	4.	int countPrimeDigits(int num)
	→ Counts how many digits in the number are prime digits.
	
	5.	void numberReport(int num)
	→ Calls all the above methods and prints:
	•	Reverse of the number
	•	Whether it is Palindrome
	•	Whether it is Strong Number
	•	Count of prime digits
*/

public class methodProblem4 {

    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
    public static boolean isPalindrome(int num, int reversed) {
        return num == reversed;
    }
    public static boolean isStrongNumber(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }
        return sum == num;
    }
    public static int countPrimeDigits(int num) {
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    public static void numberReport(int num) {
        int reversed = reverseNumber(num);
        boolean palindrome = isPalindrome(num, reversed);
        boolean strongNumber = isStrongNumber(num);
        int primeDigitsCount = countPrimeDigits(num);
        
        System.out.println("Reverse of the number: " + reversed);
        System.out.println("Is Palindrome: " + palindrome);
        System.out.println("Is Strong Number: " + strongNumber);
        System.out.println("Count of prime digits: " + primeDigitsCount);
    }
    public static void main(String[] args) {
        numberReport(121);
    }
}
