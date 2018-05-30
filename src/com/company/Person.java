package com.company;

/**
 * Created by Student on 16.05.2018.
 */
public class Person {
    String fullName;
    int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {

    }

    public Person(String fullName) {
        this.fullName = fullName;
    }


    void move() {

        System.out.println(fullName + " is moving");

    }

    void talk() {
        System.out.println(fullName + " is talking");

    }

    public static void main(String[] args) {

        Person person1 = new Person("Ivanov", 25);

        Person person2 = new Person();
        person1.move();
        person1.talk();

        person2.fullName = "Vovk";
        person2.age = 27;
        person2.move();
        person2.talk();
    }

}
