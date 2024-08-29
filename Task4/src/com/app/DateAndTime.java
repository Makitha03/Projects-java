package com.app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
        //the current date
        LocalDate localdate=LocalDate.now();
        System.out.println(localdate);


        //current time
        LocalTime localtime= LocalTime.now();
        System.out.println(localtime);

    //current date and time
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println(dateTime);
    //formatted date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");
        String formattedDate = formatter.format(dateTime);
    System.out.println(dateTime.format(formatter));

    //printing days,months,seconds,
    Month month=dateTime.getMonth();
    int day=dateTime.getDayOfMonth();
    int seconds=dateTime.getYear();
    System.out.println(month+" "+day+" "+seconds);


    //printing some specified date
        LocalDate localdate2=LocalDate.of(2021,01,23);
        System.out.println(localdate2);


    }
}
