package com.company;

/**
 * Created by Student on 06.06.2018.
 */
public class Stroca {
    public static void main(String[] args) {
        verifyString("I like JAVA!!!");
        verifyString("I like .net!!!");
        printLastChar("I like JAVA");
        String i = "I like JAVA!";
        System.out.println("lastIndexOf(JAVA) = "
                + i.lastIndexOf("JAVA"));
        System.out.println(i.replace('A', 'o'));
        System.out.println(i.toLowerCase());
        System.out.println(i.toUpperCase());
        System.out.println(i.substring(7, 11));
        System.out.println("indexOf(J) = "
                + i.indexOf('J'));
        System.out.println(i.substring(7, 11));
    }

    public static void printLastChar(String str) {
        int length = str.length();
        char lastSymbol = str.charAt(length - 1);
        System.out.println(lastSymbol);

    }

    public static void verifyString(String  str) {


        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));

    }
}
