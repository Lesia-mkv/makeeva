package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Drive;

/**
 * Created by Student on 30.05.2018.
 */
public class Lorry extends Car {
    private double weight;

    public Lorry(String type, String aClass, Drive drive, Engine engine, double weight) {
        super(type, aClass, drive, engine);
        this.weight = weight;
    }
    public Lorry(){

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }



    @Override
    public String toString() {
        return "Lorry{" +
                "weight=" + weight +
                "} " + super.toString();
    }
}
