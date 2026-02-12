// program to check day type

import java.util.*;

class dayType{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day: ");

        String day = sc.next();

        if(day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Thursday") ||day.equalsIgnoreCase("Friday")){
            System.out.println("Weekday");
        } else if(day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")){
            System.out.println("Weekend");
        } else{
            System.out.println("Invalid day!");
        }

        sc.close();
    }
}

