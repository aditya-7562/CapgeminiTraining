// WAJP to calculate area of different shapes based on user input using switch case.
// Shapes: Circle, Rectangle, Triangle, Square
import java.util.Scanner;
public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter shape(Circle, Rectangle, Triangle, Square): ");
        String shape = sc.nextLine();

        switch(shape){
            case "Circle":
                System.out.println("Enter radius: ");
                double radius = sc.nextDouble();
                double circleArea = 3.14 * radius * radius;
                System.out.println("Area of Circle: " + circleArea);
                break;
            case "Rectangle":
                System.out.println("Enter length: ");
                double length = sc.nextDouble();
                System.out.println("Enter breadth: ");
                double breadth = sc.nextDouble();
                double rectangleArea = length * breadth;
                System.out.println("Area of Rectangle: " + rectangleArea);
                break;
            case "Triangle":
                System.out.println("Enter base: ");
                double base = sc.nextDouble();
                System.out.println("Enter height: ");
                double height = sc.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("Area of Triangle: " + triangleArea);
                break;
            case "Square":
                System.out.println("Enter side: ");
                double side = sc.nextDouble();
                double squareArea = side * side;
                System.out.println("Area of Square: " + squareArea);
                break;
            default:
                System.out.println("Invalid shape.");
        }
        sc.close();
    }
}
