package com.company;

import java.io.Serializable;

/**
 * Created by Student on 13.06.2018.
 */
public class Obobob<T extends Comparable, V extends Animal & Serializable, K extends Number> {
    private T ob1;
    private V ob2;
    private K ob3;


    Obobob(T o1, V o2, K o3) {
        ob1 = o1;
        ob2 = o2;
        ob3 = o3;
    }

    void showTypes() {
        System.out.println("Type of T is "
                + ob1.getClass().getName());

        System.out.println("Type of V is "
                + ob2.getClass().getName());
        System.out.println("Type of K is "
                + ob3.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {

        return ob2;
    }

    K getOb3() {
        return ob3;
    }
}



