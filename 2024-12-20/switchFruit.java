// program to use switch for printing some info associated with the input
import java.util.Scanner;
public class switchFruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter a fruit: ");
        String fruit = sc.nextLine();

        switch (fruit) {
            case "Apple":
                System.out.println("Apples are rich in fibre and vitamin C.");
                break;
            case "Banana":
                System.out.println("Bananas are a great source of potassium.");
                break;
            case "Orange":
                System.out.println("Oranges are packed with vitamin C.");
                break;
            case "Mango":
                System.out.println("Mangos are the king of fruits.");
                break;
        
            default:
                System.out.println("Sorry, I don't have information about " + fruit);
                break;
        }
        sc.close();
    }
}
