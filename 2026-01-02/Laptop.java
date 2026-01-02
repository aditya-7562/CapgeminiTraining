/* Write a Java program to create a Laptop class that demonstrates constructor chaining using this().

Requirements:

The Laptop class should have three instance variables:
brand (String)
ramSize (int)
price (double)

Implement the following constructors using constructor chaining (this()):

Default constructor that sets default values ("Unknown", 8GB, 50000.0).
Constructor with only brand (calls the default constructor).
Constructor with brand and ramSize (calls the constructor with brand).
Constructor with all three fields (brand, ramSize, price) --(the final constructor)--.

Create a printDetails() method to display laptop details.

In main(), create different Laptop objects using all constructors and print their details.
*/
public class Laptop {
    String brand;
    int ramSize;
    double price;

    Laptop() {
        this.brand = "Unknown";
        this.ramSize = 8;
        this.price = 50000.0;
    }
    Laptop(String brand) {
        this();
        this.brand = brand;
    }
    Laptop(String brand, int ramSize) {
        this(brand);
        this.ramSize = ramSize;
    }
    Laptop(String brand, int ramSize, double price) {
        this(brand, ramSize);
        this.price = price;
    }
    void printDetails() {
        System.out.println("Brand: " + brand + ", RAM Size: " + ramSize + "GB, Price: " + price);
    }
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop("Dell");
        Laptop laptop3 = new Laptop("HP", 16);
        Laptop laptop4 = new Laptop("Lenovo", 32, 75000.0);

        laptop1.printDetails();
        laptop2.printDetails();
        laptop3.printDetails();
        laptop4.printDetails();
    }
}
