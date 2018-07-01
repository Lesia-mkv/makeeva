package com.company;

/**
 * Created by student on 01.07.2018.
 */
public class NewThread extends Thread {
    public void run() {
        char j = 'v';
        for (int i = 0; i < 99; i++) {
            System.out.println(j);
        }
    }
}
