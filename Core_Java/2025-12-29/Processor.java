/*Write a Java program that satisfies all the following conditions:

Requirements
	1.	Create a class named Processor.
	2.	Declare two non-static variables x and y.

	4.	Initialize the instance variables only inside a non-static method using the this keyword.
	5.	Create three non-static methods:
	•	initialize() – assigns values to x and y using this.
	•	update() – modifies the values of x and y and demonstrates variable shadowing by declaring a local variable with the same name as one instance variable.
	•	display() – prints the final values of the instance variables.
	6.	One non-static method must call another non-static method using the this keyword.
 */

public class Processor {
	int x;
	int y;
	public void initialize(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void update(int x) {
		this.x += x;
		int y = 10; // local variable y shadowing instance variable y
		this.y += y;
		this.display();
	}
	public void display() {
		System.out.println("x = " + this.x);
		System.out.println("y = " + this.y);
	}
    public static void main(String[] args) {
        Processor p = new Processor();
		p.initialize(5, 15);
		p.update(10);
    }
}
