package com.company;

/**
 * Created by student on 20-May-18.
 */
public class Aspirant extends Ctudent {
    private  String work;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String work) {
        super(firstName, lastName, group, averageMark);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
}
