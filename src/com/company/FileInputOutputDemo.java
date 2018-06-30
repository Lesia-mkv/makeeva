package com.company;

import java.io.*;

/**
 * Created by Student on 30.06.2018.
 */
public class FileInputOutputDemo {
    public static void main(String[] args) {
        try (InputStream input = new FileInputStream("src\\io\\a.txt");
             OutputStream output = new FileOutputStream("src\\io\\a.txt"))

        {
            char[] c = {'a', 'b', 'c'};
            // Создание текстового файла
            for (char symbol : c) {
                output.write(symbol);
            }


            int size = input.available();

            for (int j = 0; j < size; j++) {
                // Чтение текстового файла посимвольно
                System.out.print((char) input.read() + " ");
            }
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}

