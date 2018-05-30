package com.company;

/**
 * Created by Student on 30.05.2018.
 */
public class Magazine implements Printable {
    private  String name;
    private  int number;

    public Magazine(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void print() {
        System.out.println("Печатаю журнал"+getName()+"выпуск"+getNumber());

    }
}
