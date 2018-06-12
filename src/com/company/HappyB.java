package com.company;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

/**
 * Created by student on 6/12/2018.
 */
public class HappyB {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate happy1998 = LocalDate.of(1998, 9, 28);
        System.out.println(happy1998);


        int year = happy1998.getYear();
        int month = happy1998.getMonthValue();
        int dayYear = happy1998.getDayOfYear();
        int dayMonth = happy1998.getDayOfMonth();
        Month monthAsEnum = happy1998.getMonth();
        DayOfWeek dayWeekEnum = happy1998.getDayOfWeek();

        System.out.println("Год: " + year);
        System.out.println("Месяц: " + month);
        System.out.println("День в году: " + dayYear);
        System.out.println("День месяца: " + dayMonth);
        System.out.println("Название месяца: " + monthAsEnum);
        System.out.println("День недели: " + dayWeekEnum);

        int year1 = today.get(ChronoField.YEAR);
        int month1 = today.get(ChronoField.MONTH_OF_YEAR);
        int dayYear1 = today.get(ChronoField.DAY_OF_YEAR);
        int dayMonth1 = today.get(ChronoField.DAY_OF_MONTH);
        int dayWeek1 = today.get(ChronoField.DAY_OF_WEEK);

        System.out.println("Год: " + year1);
        System.out.println("Месяц: " + month1);
        System.out.println("День в году: " + dayYear1);
        System.out.println("День месяца: " + dayMonth1);
        System.out.println("День недели: " + dayWeek1);

        boolean after = happy1998.isAfter(today);
        boolean before = happy1998.isBefore(today);
        boolean equal = happy1998.equals(today);
        boolean leapYear = happy1998.isLeapYear();

        System.out.println("happy1998.isAfter(today): " + after);
        System.out.println("happy1998.isBefore(today): " + before);
        System.out.println("happy1998.equals(today): " + equal);
        System.out.println("happy1998.isLeapYear(): " + leapYear);

    }
}
