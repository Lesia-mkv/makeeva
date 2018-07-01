package com.company;

/**
 * Created by student on 01.07.2018.
 */
public class NewRunnableDemo {
    public static void main(String[] args) {
        NewRunnable newRunnable = new NewRunnable();
        Thread thread1 = new Thread(newRunnable);
        thread1.setName("First");
        thread1.start();
        Thread thread2 = new Thread(newRunnable);
        thread2.setName("Second");
        thread2.start();
        Thread thread3 = new Thread(newRunnable);
        thread3.setName("Third");
        thread3.start();

    }
}
