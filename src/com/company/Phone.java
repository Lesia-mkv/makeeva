package com.company;

/**
 * Created by Student on 15.05.2018.
 */
public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    Phone() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public Phone(String model, String number) {
        this.model = model;
        this.number = number;
    }


    void receiveCall(String name) {
        System.out.println("Zvonit " + name);

    }

    void receiveCall(String number, String name) {
        System.out.println("Zvonit" + name + number);

    }

    void sendMessage(String... numbers) {
        for (String n : numbers) {
            System.out.println("Sending message to phone" + n);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone phone = (Phone) o;

        if (Double.compare(phone.weight, weight) != 0) return false;
        if (number != null ? !number.equals(phone.number) : phone.number != null) return false;
        return model != null ? model.equals(phone.model) : phone.model == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = number != null ? number.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

}
