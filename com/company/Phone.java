package com.company;

/**
 * Created by Student on 15.05.2018.
 */
public class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    Phone() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public Phone(String model, String number) {
        this.model = model;
        this.number = number;
    }


    void receiveCall(String name) {
        System.out.println("Zvonit " + name);

    }

    String getNumber() {
        return number;
    }

}
