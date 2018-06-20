package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Student on 20.06.2018.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Toy> map = new HashMap<>();
        map.put("kubic", new Toy("kubic", 45));
        map.put("dool", new Toy("dool", 95));
        map.put("car", new Toy("car", 60));

        printByEntrySet(map);
        printByKeys(map);
    }

    public static void printByEntrySet(Map<String, Toy> map) {
        Set<Map.Entry<String, Toy>> entries = map.entrySet();
        for (Map.Entry<String, Toy> entry : entries) {
            System.out.println("key: " + entry.getKey());
            System.out.println("Value: : " + entry.getValue());
        }
    }

    public static void printByKeys(Map<String, Toy> map) {
        Set<String>keys = map.keySet();
        for(String key : keys){
            System.out.println(key);
        }

    }
}
