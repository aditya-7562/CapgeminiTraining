/*
SmartTracker App – Daily Sales and Weather Insights
Welcome to the world of SmartTracker, a digital assistant used by small shop owners and local weather stations.
The app stores and analyzes daily sales and temperature data using arrays — helping users make smarter business and lifestyle decisions.

Through this scenario, you’ll learn how 1D arrays can make data tracking and analysis efficient, accurate, and automated.

Background Story
You’ve been hired as a Java developer for SmartTracker Labs, a startup creating intelligent dashboards for community businesses.
Your job is to write a Java module that analyzes:

Shop sales over 7 days
Temperature patterns for the same week
Using arrays and methods, you’ll design algorithms that process, search, and update data — much like what real apps do behind the scenes.

Data Setup
int[] sales = {120, 80, 150, 90, 200, 75, 110}; // Sales for 7 days (in ₹)
int[] temperatures = {32, 28, 31, 29, 35, 27, 30}; // Temperatures (°C) for 7 days
Each array represents a week’s worth of data — from Monday to Sunday.

Activity 1 – Average Temperature
Goal: Find the average weekly temperature.
Use a method to sum all values and divide by the total number of days.

Expected Output:
Average Temperature: 30.3°C


Activity 2 – Hottest and Coldest Day
Goal: Identify the highest and lowest recorded temperatures.
Bonus: Try to print which day (e.g., Day 5) had those temperatures.

Expected Output:
Highest Temperature: 35°C
Lowest Temperature: 27°C


Activity 3 – Count Hot Days
Goal: Count how many days the temperature was above 30°C.

Expected Output:
Number of hot days (>30°C): 3


Activity 4 – Total and Average Sales
Goal: Calculate total revenue and average daily sales using array traversal.

Expected Output:
Total Sales: 825
Average Sales: 117.86


Activity 5 – Record-Breaking Sales
Goal: Identify the highest and lowest sales of the week and the days they occurred.

Expected Output:
Highest Sale: 200 on Day 5
Lowest Sale: 75 on Day 6


Activity 6 – Count High-Sales Days
Goal: Find out how many days had sales above ₹100.

Expected Output:
Number of high sales days (>100): 4


Activity 7 – Search for a Specific Sale
Goal: Search the array for a specific sale amount (for example, ₹150).
If found, print which day it occurred.

Expected Output:
Sale 150 found on Day 3


Activity 8 – Update Sales Record
Goal: Suppose the shop owner updated the sales for Day 2 to ₹95.
Update the array and display the new value.

Expected Output:
Updated sales for Day 2: 95
*/

public class array25 {
    public static void main(String[] args) {
        int[] sales = { 120, 80, 150, 90, 200, 75, 110 }; // Sales for 7 days (in ₹)
        int[] temperatures = { 32, 28, 31, 29, 35, 27, 30 }; // Temperatures (°C) for 7 days

        // Activity 1
        int sum = 0;
        for (int i = 0; i < temperatures.length; i++) {
            sum += temperatures[i];
        }
        System.out.println("Activty 1, Average temperature is: " + (double) sum / temperatures.length);

        // Activity 2
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > highest)
                highest = temperatures[i];
            if (temperatures[i] < lowest)
                lowest = temperatures[i];
        }
        System.out.println("Highest: " + highest + "\u00B0C");
        System.out.println("Lowest: " + lowest + "\u00B0C");

        // Activity 3
        int count = 0;
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > 30)
                count++;
        }
        System.out.println("Number of hot days: " + count);

        // Activity 4
        int total = 0;
        double avg = 0;

        for (int i = 0; i < sales.length; i++) {
            total += sales[i];
        }
        avg = (double) (total / sales.length);
        System.out.println("Total sales: " + total);
        System.out.println("Average sales: " + avg);

        // Activity 5
        int highestSales = Integer.MIN_VALUE;
        int lowestSales = Integer.MAX_VALUE;
        for(int i = 0; i < sales.length; i++){
            if(sales[i] > highestSales) highestSales = sales[i]; 
            if(sales[i] < lowestSales) lowestSales = sales[i]; 
        }
        int hDay = -1;
        int lDay = -1;
        for(int i = 0; i < sales.length; i++){
            if(sales[i] == highestSales) hDay = i+1;
            if(sales[i] == lowestSales) lDay = i+1;
        }
        System.out.println("Highest sale was " + highestSales + " on Day " + hDay);
        System.out.println("Lowest sale was " + lowestSales + " on Day " + lDay);

        // Activity 6
        int countSales = 0;
        for(int i = 0; i < sales.length; i++){
            if(sales[i] > 100) countSales++;
        }
        System.out.println("Number of high sales day: " + countSales);

        // Activity 7
        int target = 150;
        for(int i = 0; i < sales.length; i++){
            if(sales[i] == target){
                System.out.println("Sale " + target + " was found on day on "+ (i+1));
            }
        }

        // Activity 8
        int updatedSales = 95;
        int newDate = 2;
        for(int i = 0; i < sales.length; i++){
            sales[newDate - 1] = updatedSales;
        }
        System.out.println("Updated sales for day " + newDate + " is " + updatedSales);
    }
}
