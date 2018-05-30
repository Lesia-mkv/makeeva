package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Drive;
import com.company.vehicles.Car;

/**
 * Created by Student on 30.05.2018.
 */
public class CarDemo {
    public static void main(String[] args) {
        Drive drive = new Drive("Petrov ", 60, 30);
        Engine engine = new Engine(50, "Manuf1 ");
        Car car = new Car("type1 ", "class1 ", drive, engine);
        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();
        System.out.println(car);

        Drive drive2 = new Drive("Kozlov ", 45, 15);
        Engine engine2 = new Engine(35, "Manuf2 ");
        Lorry lorry = new Lorry("type2 ", "class2 ", drive2, engine2, 34);
        lorry.start();
        lorry.turnLeft();
        lorry.turnRight();
        lorry.stop();
        System.out.println(lorry);

        Drive drive3 = new Drive("Sidash ", 65, 40);
        Engine engine3 = new Engine(46, "Manuf3 ");
        SportCar sportCar = new SportCar("type3 ", "class3 ", drive3, engine3, 34);
        sportCar.start();
        sportCar.turnLeft();
        sportCar.turnRight();
        sportCar.stop();
        System.out.println(sportCar);
    }


}
