/* WAJP that demonstrates method overloading by creating multiple methods to calculate the area of different shapes like circle, rectangle, and square  . */

public class methodProblem6 {
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    public static int calculateArea(int side) {
        return side * side;
    }
    public static int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        System.out.println("Area of Circle with radius 5: " + calculateArea(5.0));
        System.out.println("Area of Square with side 4: " + calculateArea(4));
        System.out.println("Area of Rectangle with length 5 and breadth 3: " + calculateArea(5, 3));
    }
}
