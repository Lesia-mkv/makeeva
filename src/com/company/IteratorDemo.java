package com.company;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Student on 20.06.2018.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List<HeavyBox1> list = new ArrayList<>();
        list.add(new HeavyBox1(1, 1, 1, 1));
        list.add(new HeavyBox1(1, 1, 1, 400));
        list.add(new HeavyBox1(1, 1, 1, 350));
        list.add(new HeavyBox1(1, 1, 1, 200));
        list.add(new HeavyBox1(1, 1, 1, 100));

        List<HeavyBox1> newCollection = createHeavyList(list);
        System.out.println(list);
        System.out.println(newCollection);
    }

    private static List<HeavyBox1> createHeavyList(List<HeavyBox1> list) {
        List<HeavyBox1> result = new ArrayList<>();
        Iterator<HeavyBox1> iterator = list.iterator();
        while (iterator.hasNext()) {
            HeavyBox1 box = iterator.next();
            if (box.weight > 300) {
                iterator.remove();
                result.add(box);
            }
        }
        return result;
    }
}
