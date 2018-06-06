package com.company;

/**
 * Created by Student on 06.06.2018.
 */
public class DoubleDemo {
    public static void main(String[] args) {
        Double i1 = 2.0;
        Double i2 = new Double("3");
        Double i3 = Double.valueOf(3);
        Double i4 = Double.valueOf("3");
        double i5 = Double.parseDouble("67");
        String i6 = Double.toString(3.14);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);
        System.out.println(i1.byteValue());
        System.out.println(i1.floatValue());
        System.out.println(i1.longValue());
        System.out.println(i1.intValue());
        System.out.println(i1.doubleValue());
        System.out.println(i1.shortValue());
    }
}
