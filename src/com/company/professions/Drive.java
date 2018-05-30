package com.company.professions;

/**
 * Created by Student on 30.05.2018.
 */
public class Drive extends Persons {
    private int experience;

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Drive(String fullName, int age, int experience) {

        super(fullName, age);
        this.experience = experience;
    }


    public Drive() {

    }
}
