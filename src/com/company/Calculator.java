package com.company;

/**
 * Created by Student on 13.06.2018.
 */
public class Calculator {
    public static <T extends Number, V extends Number> Double sum(T value1, V value2 ) {
        return value1.doubleValue() + value2.doubleValue();

    }

    public static void main(String[] args) {
        System.out.println(sum(4, 7.0));
    }
}
