package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Student on 30.06.2018.
 */
public class SerializeHorse {
    public static void main(String[] args) {
        Halter halter = new Halter(5);
        Horse horse = new Horse("Miki", halter);
        System.out.println("Размер седла перед сериализацией: "
                + horse.getHalter().getSize());

        try (FileOutputStream fs = new FileOutputStream("testSer.ser");
             ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(horse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deserializeHorse(String[] args) {
        Halter halter = new Halter(5);
        Horse horse = new Horse("Miki", halter);
        try (FileInputStream fis = new FileInputStream("testSer.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            horse = (Horse) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();

        }
        System.out.println("Размер седла после сериализации: " + horse.getHalter().getSize());
    }
}
