/*A mobile phone can be initialized with default settings or custom settings.

Create class Mobile with:
	•	String brand
	•	int storage
	•	boolean is5G

Requirements: 
	1.	Default constructor sets:
	•	brand = “Unknown”
	•	storage = 64
	•	is5G = false
	2.	Parameterized constructor sets all values.
	3.	Use this() to chain constructors.
*/
public class Mobile {
    String brand;
    int storage;
    boolean is5g;

    public Mobile(){
        this.brand = "Unknown";
        this.storage = 64;
        this.is5g = false;
    }
    public Mobile(String brand, int storage, boolean is5g){
        this();
        this.brand = brand;
        this.storage = storage;
        this.is5g = is5g;
    }
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        System.out.println("Brand: " + m1.brand + ", Storage: " + m1.storage + "GB, 5G: " + m1.is5g);
        Mobile m2 = new Mobile("Samsung", 128, true);
        System.out.println("Brand: " + m2.brand + ", Storage: " + m2.storage + "GB, 5G: " + m2.is5g);
    }
}
