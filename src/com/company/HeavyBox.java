package com.company;

/**
 * Created by Student on 05.07.2018.
 */
public class HeavyBox extends Box6 {
    int weight; // вес коробки

    public HeavyBox() {
    }

    public HeavyBox(int width, int height, int depth, int weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }
}