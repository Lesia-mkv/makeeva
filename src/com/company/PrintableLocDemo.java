package com.company;

/**
 * Created by Student on 13.06.2018.
 */
public class PrintableLocDemo {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Anonymous  class ");
            }
        };
        printable.print();
    }
}
