// Travel Ticket Booking & Fare Processing System

import java.util.*;
public class TicketBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Passenger ID");
        int ID = sc.nextInt();
        System.out.println("Enter Passenger Name: ");
        String name = sc.next();
        System.out.println("Enter Passenger Age: ");
        int age = sc.nextInt();
        if(age < 5){
            System.out.println("Free Ticket - No Booking Required.");
            return;
        }else if(age > 80){
            System.out.println("Medical Clearance Required for Booking.");
            return;
        }
        System.out.println("Travel Type: 1-Bus, 2-Train, 3-Flight");
        int travelType = sc.nextInt();
        System.out.println("Enter Base Fare: ");
        double baseFare = sc.nextDouble();
        System.out.println("Is government employee? (true/false): ");
        boolean isGovEmployee = sc.nextBoolean();
        double final_fare = 0;
        switch (travelType) {
            case 1:
                System.out.println("Enter Bus Class (1-Sleeper, 2-Seater): ");
                int busClass = sc.nextInt();
                if(busClass == 1){
                    final_fare = baseFare * 1.2;
                }else if(busClass == 2){
                    final_fare = baseFare * 1.0;
                }else{
                    System.out.println("Invalid Bus Class.");
                }
                break;
            case 2:
                System.out.println("Enter Train Class (1-General, 2-Sleeper, 3-AC): ");
                int trainClass = sc.nextInt();
                if(trainClass == 1){
                    final_fare = baseFare * 1.0;
                }else if(trainClass == 2){
                    final_fare = baseFare * 1.3;
                }else if(trainClass == 3){
                    final_fare = baseFare * 1.6;
                }else{
                    System.out.println("Invalid Train Class.");
                }
                break;
            case 3:
                System.out.println("Enter Flight Class (1-Economy, 2-Business): ");
                int flightClass = sc.nextInt();
                if(flightClass == 1){
                    final_fare = baseFare * 2.5;
                }else if(flightClass == 2){
                    final_fare = baseFare * 3.5;
                }else{
                    System.out.println("Invalid Flight Class.");
                }
                break;
        
            default:
                System.out.println("Invalid Travel Type.");
                break;
        }
        double discount = 0;
        if(age > 60){
            discount = (final_fare * 30/100);
        }else if(isGovEmployee){
            discount = (final_fare * 15/100);
        }else if(age >= 5 && age <= 12){
            discount = (final_fare * 50/100);
        }
        final_fare = final_fare - discount;
        String bookingStatus = "";
        if(final_fare >= 10000){
            if(travelType == 3){
                bookingStatus = "Confirmed";
            }else{
                bookingStatus = "Waitlisted";
            }
        }else{
            bookingStatus = "Confirmed";
        }

        System.out.println("Passenger ID: " + ID);
        System.out.println("Passenger Name: " + name);
        System.out.println("Passenger Age: " + age);
        System.out.println("Travel Type: " + travelType);
        System.out.println("Base Fare: " + baseFare);
        System.out.println("Final Fare: " + final_fare);
        System.out.println("Discount Applied: " + (discount));
        System.out.println("Booking Status: " + bookingStatus);
    }
}
