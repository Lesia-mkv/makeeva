package com.company;

import java.util.function.IntFunction;
import java.util.function.Supplier;

/**
 * Created by Student on 05.07.2018.
 */
public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> newString =  String::new;
        System.out.println(newString.get());

    }
}


