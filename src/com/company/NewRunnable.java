package com.company;

/**
 * Created by student on 01.07.2018.
 */
public class NewRunnable implements Runnable {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
                System.out.println("NameRunnable running");
                System.out.println("Run by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();

                }
            }
        }
    }
}
