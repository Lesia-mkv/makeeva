package com.company;

import java.io.Serializable;

/**
 * Created by Student on 13.06.2018.
 */
public class Ololo {

    public static void main(String[] args) {

        Obobob<String, Animal, Double> tgObj = new Obobob<>("Hello", new Animal(), 3.14);

        tgObj.showTypes();

        String v = tgObj.getOb1();
        System.out.println("value: " + v);

        Animal str = tgObj.getOb2();
        System.out.println("value: " + str);

        double n = tgObj.getOb3();
        System.out.println("value: " + n);
    }
}

