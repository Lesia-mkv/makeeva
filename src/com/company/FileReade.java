package com.company;

import java.io.*;

/**
 * Created by Student on 30.06.2018.
 */
public class FileReade {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("a.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                bw.write(s);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Exception");
        }
    }
}
