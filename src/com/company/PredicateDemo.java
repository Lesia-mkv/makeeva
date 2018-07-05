package com.company;

import java.util.function.Predicate;

/**
 * Created by Student on 05.07.2018.
 */
public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> predicate1 = str -> str.startsWith("J");
        Predicate<String> predicate2 = str -> str.startsWith("N");
        Predicate<String> predicate3 = str -> str.endsWith("A");
        Predicate<String> predicate = predicate1.or(predicate2).and(predicate3);
        System.out.println(predicate1.test("JANE"));
        System.out.println(predicate1.test("Kol"));
        System.out.println(predicate1.test("NANA"));
        System.out.println(predicate2.test("OLA"));
        System.out.println(predicate2.test("NINA"));
        System.out.println(predicate2.test("JOIN"));
        System.out.println(predicate3.test("NANA"));
        System.out.println(predicate3.test("MAMA"));
        System.out.println(predicate3.test("LOLO"));
        System.out.println(predicate.test("JANE"));
        System.out.println(predicate.test("Kol"));
        System.out.println(predicate.test("NANA"));
    }
}
