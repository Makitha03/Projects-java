package com.app;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneDateAndTime {
    public static  void main(String[] args) {

        //getting current zone
        ZonedDateTime zonedDateTime= ZonedDateTime.now();
        System.out.println("current time: " + zonedDateTime.getZone());
        System.out.println(zonedDateTime);

        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        System.out.println(zoneId);


        ZonedDateTime tokyoZone=zonedDateTime.withZoneSameInstant(zoneId);
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime=tokyoZone.format(dateTimeFormatter);
        System.out.println(formattedDateTime);

    }
}
