package com.company;

/**
 * Created by Student on 15.05.2018.
 */
public class PhoneDemo {
    public static void main(String[] args) {

        Phone phone1 = new Phone();
        Phone phone2 = new Phone("+380950067597", "Lenovo");
        Phone phone3 = new Phone("+38095006759", "Nokia", 34);

        phone1.model = "Lenovo";
        phone1.weight = 3;
        phone1.number = "+380950067597";

        System.out.println("model: " + phone1.model);
        System.out.println("weight: " + phone1.weight);
        System.out.println("number: " + phone1.number);

        phone2.model = "Apple";
        phone2.weight = 5;
        phone2.number = "+380685449281";

        System.out.println("model: " + phone2.model);
        System.out.println("weight: " + phone2.weight);
        System.out.println("number: " + phone2.number);

        phone3.model = "Meizu";
        phone3.weight = 8;
        phone3.number = "+380952013211";

        System.out.println("model: " + phone3.model);
        System.out.println("weight: " + phone3.weight);
        System.out.println("number: " + phone3.number);

        phone1.receiveCall("Mama");
        phone2.receiveCall("Papa");
        phone3.receiveCall("Sestra");
        String number = phone1.getNumber();
        System.out.println(number);
        String number2 = phone2.getNumber();
        System.out.println(number2);
        String number3 = phone3.getNumber();
        System.out.println(number3);
    }
}
