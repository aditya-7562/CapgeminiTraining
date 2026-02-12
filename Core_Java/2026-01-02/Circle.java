/* Q3. Write a Java program to create a class called Circle with a private instance variable radius. Provide public getter and setter methods to access and modify the radius variable. However, provide two methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter based on the current radius value.
-----------------------------------------------------------------------------------------
 */
class Circle2{
    private double radius;

    // Getter and Setter methods
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}


public class Circle {

    public static void main(String[] args) {
        Circle2 c1 = new Circle2();
        c1.setRadius(5.0);
        System.out.println("Area: " + Math.round(c1.calculateArea()));
        System.out.println("Perimeter: " + Math.round(c1.calculatePerimeter()));
    }
}