package com.company;

import java.util.function.Consumer;

/**
 * Created by Student on 05.07.2018.
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<HeavyBox> consumer1 = box -> System.out.println("Отгрузили ящик с весом " + box.weight);
        Consumer<HeavyBox> consumer2 = box -> System.out.println("Отправляем ящик с весом " + box.weight);
        consumer1.andThen(consumer2).accept(new HeavyBox(2, 2, 2, 2));
    }
}


