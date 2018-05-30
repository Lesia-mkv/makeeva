package com.company;

/**
 * Created by Student on 30.05.2018.
 */
public class Book implements Printable {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("LПечатаю книгу " + getName());
    }
}
