package com.company;

import java.io.Serializable;

/**
 * Created by Student on 30.06.2018.
 */
public class Horse extends Animal1 implements Serializable {
    private transient Halter halter;
    private String name;

    public Horse(String name, Halter halter) {
        this.name = name;
        this.halter = halter;
    }

    public Halter getHalter() {
        return halter;
    }
}