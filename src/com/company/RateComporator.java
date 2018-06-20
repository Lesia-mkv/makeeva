package com.company;

import java.util.Comparator;

/**
 * Created by Student on 20.06.2018.
 */
public class RateComporator implements Comparator<Tovar> {
    @Override
    public int compare(Tovar o1, Tovar o2) {
        if (o1.getRate() != o2.getRate()) {
            return -1;
        } else if (o1.getPrice() < o2.getPrice()){
            return 1;
        }
            return o1.getRate() - o2.getRate();
    }
}
