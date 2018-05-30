package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Drive;

/**
 * Created by Student on 30.05.2018.
 */
public class SportCar extends  Car{
    private double speed;

    public SportCar(String type, String aClass, Drive drive, Engine engine, double speed) {
        super(type, aClass, drive, engine);
        this.speed = speed;
    }
    public  SportCar(){

    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                "} " + super.toString();
    }
}
