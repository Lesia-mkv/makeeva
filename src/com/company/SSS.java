package com.company;

/**
 * Created by Student on 06.06.2018.
 */
public class SSS {
    public static void main(String[] args) {
        print(3,4);
        print(35,45);
    }


    public static void print(int a, int b) {
        StringBuilder str = new StringBuilder(50);
        str.append(a).append("+").append(b).append("=").append(a + b).append("\n");
        str.append(a).append("-").append(b).append("=").append(a + b).append("\n");
        str.append(a).append("*").append(b).append("=").append(a + b).append("\n");
        System.out.println(str);
    }


}

