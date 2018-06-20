package com.company;

import java.util.Comparator;

/**
 * Created by Student on 20.06.2018.
 */
public class NameComparator implements Comparator<Tovar> {
    @Override
    public int compare(Tovar o1, Tovar o2) {
        return o1.getName().compareTo(o2.getName());

    }
}
