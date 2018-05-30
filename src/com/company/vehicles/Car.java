package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Drive;

/**
 * Created by Student on 30.05.2018.
 */
public class Car {
    private String type, aClass;
    private Drive drive;
    private Engine engine;

    public Car(String type, String aClass, Drive drive, Engine engine) {
        this.type = type;
        this.aClass = aClass;
        this.drive = drive;
        this.engine = engine;
    }

    public Car() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getaClass() {
        return aClass;
    }

    public void setaClass(String aClass) {
        this.aClass = aClass;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("I am starting");
    }

    public void stop() {
        System.out.println("I am stoping");
    }

    public void turnRight() {
        System.out.println("I am turn right");
    }

    public void turnLeft() {
        System.out.println("I am turn left");
    }

    public void printInfo() {
        System.out.println(type + aClass);
        if (drive!=null){
            System.out.println(drive.getExperience()+drive.getFullName()+drive.getAge());
        }
        System.out.println(type + aClass);
        if (engine!=null){
            System.out.println(engine.getManufacturer()+engine.getPower());
        }
                System.out.println(type + aClass
                + drive.getExperience() + drive.getFullName() + drive.getAge()
                + engine.getManufacturer() + engine.getPower());
    }



    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", aClass='" + aClass + '\'' +
                ", drive=" + drive +
                ", engine=" + engine +
                '}';
    }
}
