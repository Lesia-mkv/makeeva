package com.company;

/**
 * Created by Student on 20.06.2018.
 */

public class HeavyBox1 extends Box6 {
    int weight; // вес коробки

    public HeavyBox1() {
    }

    @Override
    public String toString() {
        return "HeavyBox1{" +
                "weight=" + weight +
                "} " + super.toString();
    }

    public HeavyBox1(int width, int height, int depth, int weight) {

        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;


    }
}
