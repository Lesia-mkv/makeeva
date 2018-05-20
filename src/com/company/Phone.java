package com.company;

/**
 * Created by Student on 15.05.2018.
 */
public class Phone {
    String number;
    String model;
    double weight;
    private static int count = 0;


    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }


    Phone() {
        count++;
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public Phone(String model, String number) {
        this.model = model;
        this.number = number;
        count++;
    }

    static int getCountInstance() {
        return count;
    }

    protected void finalize() {
        System.out.println("In finalize");
        count--;
    }

    void receiveCall(String name) {
        System.out.println("Zvonit " + name);

    }

    String getNumber() {
        return number;
    }

}
