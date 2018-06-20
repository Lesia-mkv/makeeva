package com.company;

import com.sun.org.apache.xml.internal.resolver.Catalog;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Student on 20.06.2018.
 */
public class TovarDemo {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar("Telephone", 25000, 3);
        Tovar tovar2 = new Tovar("Radio", 2000, 3);
        Tovar tovar3 = new Tovar("TV", 15000, 5);

        Set<Tovar> set = new TreeSet<>(new PriceComparator());
        set.add(tovar1);
        set.add(tovar2);
        set.add(tovar3);

        Katalog katalog = new Katalog("technic", set);
        print(set, new PriceComparator());
        print(set, new NameComparator());
        print(set, new RateComporator());



    }

    public static void print(Set<Tovar> set, Comparator<Tovar> comparator) {
        Set<Tovar> newSet = new TreeSet<>(comparator);
        newSet.addAll(set);
        System.out.println(newSet);
    }

}
