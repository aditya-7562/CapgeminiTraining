
import java.util.Scanner;

class Shape
{
	public double calculateArea() 
	{
		return 0;
	}
}  
class Rectangle extends Shape
{
	double a;
	double b;
	
	Rectangle(double a, double b)
	{
		this.a = a;
		this.b=b;
	}
	@Override
	public double calculateArea()
	{
		return a*b;
	}
}
class Triangle extends Shape
{
	double a1;
	double b1;
	
	Triangle(double a1, double b1)
	{
		this.a1 = a1;
		this.b1 =b1; 
	}
	@Override
	public double calculateArea()
	{
		return 0.5*b1*a1;   
	}	
}
class Circlee extends Shape
{
	double r ;
	Circlee(double r)
	{
		this.r =r;
	}
	public double calculateArea( ) 
	{
		return 2  * 3.14 * r *r ; 
	}	
}
public class Area {
	public static void main(String [] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter base fr triangle ");
		double a = sc.nextDouble();
		
		System.out.println("Enter height fr triangle ");
		double b = sc.nextDouble();
		Triangle t = new Triangle(a,b); 
		
		
		System.out.println("Enter width fr rectangle ");
		double a1 = sc.nextDouble();
		System.out.println("Enter length fr rectangle ");
		double b1 = sc.nextDouble();
		Rectangle rt = new Rectangle(a1,b1);
		
		
		
		System.out.println("Enter radius fr circle ");
		double r = sc.nextDouble();
		Circlee rtt = new Circlee(r); 
		 
		System.out.println("triangle "+t.calculateArea()); 
		System.out.println("rectangle "+rt.calculateArea());	
		System.out.println("circle "+rtt.calculateArea());	
	}
}