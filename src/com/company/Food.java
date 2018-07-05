package com.company;

/**
 * Created by Student on 05.07.2018.
 */
public class Food {
    public void prepare(Cookable c) {
        c.cook();
    }

    public static void main(String[] args) {
        Food food = new Food();
        Cookable cookable = () -> System.out.println("Жарим картошку");
        food.prepare(cookable);
    }
}
