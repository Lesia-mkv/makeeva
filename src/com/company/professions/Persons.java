package com.company.professions;

/**
 * Created by Student on 30.05.2018.
 */
public class Persons {
    private String fullName;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Persons(String fullName, int age) {

        this.fullName = fullName;
        this.age = age;
    }

    public Persons() {

    }
}
