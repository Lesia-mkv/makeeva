package com.company;

import java.util.function.Function;

/**
 * Created by Student on 05.07.2018.
 */
public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, Integer> function = str -> {
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException e) {
                return 0;
            }
        };
        System.out.println(function.apply("122"));
        System.out.println(function.apply("abc"));
    }
}
