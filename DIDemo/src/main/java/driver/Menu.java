package driver;

import entity.Car;
import entity.DieselEngine;
import entity.Engine;
import entity.PetrolEngine;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Petrol Engine");
        System.out.println("2. Diesel Engine");
        System.out.print("Enter Choice:");

        byte userChoice = sc.nextByte();
        sc.nextLine();
//        Car car = new Car();
        Engine engine = null;
        switch (userChoice){
            case 1:
                engine = new PetrolEngine();
                break;
            case 2:
                engine = new DieselEngine();
        }

        // Field injection
//        car.engine = engine;
//        car.engine.run();
//        System.out.println(car.engine.getClass());

//        // Setter injection
//        car.setEngine(engine);
//        car.getEngine().run();
//        System.out.println(car.getEngine().getClass());

          // Constructor injection
        Car car = new Car(engine);
        car.setEngine(engine);
        car.getEngine().run();
        System.out.println(car.getEngine().getClass());

    }
}
