package com.company;

/**
 * Created by Student on 15.05.2018.
 */
public class PhoneDemo {
    public static void main(String[] args) {

        Phone phone1 = new Phone();
        Phone phone2 = new Phone("+380950067597", "Lenovo");
        Phone phone3 = new Phone("+38095006759", "Nokia", 34);

        phone1.setModel("Lenovo");
        phone1.setWeight(3);
        phone1.setNumber("+380950067597");

        System.out.println("model: " + phone1.getNumber());
        System.out.println("weight: " + phone1.getWeight());
        System.out.println("number: " + phone1.getNumber());

        phone2.setModel("Apple");
        phone2.setWeight(5);
        phone2.setNumber("+380685449281");

        System.out.println("model: " + phone2.getModel());
        System.out.println("weight: " + phone2.getWeight());
        System.out.println("number: " + phone2.getNumber());

        phone3.setModel("Meizu");
        phone3.setWeight(8);
        phone3.setNumber("+380952013211");

        System.out.println("model: " + phone3.getModel());
        System.out.println("weight: " + phone3.getWeight());
        System.out.println("number: " + phone3.getNumber());

        phone1.receiveCall("Mama");
        phone2.receiveCall("Papa");
        phone3.receiveCall("Sestra");
        String number = phone1.getNumber();
        System.out.println(number);
        String number2 = phone2.getNumber();
        System.out.println(number2);
        String number3 = phone3.getNumber();
        System.out.println(number3);

        phone1.receiveCall(" Mama", " +380952013211");

        phone1.sendMessage(" +380950067597");
        phone1.sendMessage(" +380950067587", " +380951787039");

        System.out.println(phone1 == phone2);
        System.out.println(phone1 == phone3);

        System.out.println(phone1.equals(phone2));
        System.out.println(phone1.equals(phone2));
    }
}
