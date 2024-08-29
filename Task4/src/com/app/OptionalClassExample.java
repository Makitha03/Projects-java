package com.app;

import java.util.Optional;

public class OptionalClassExample {

    public static void main(String[] args) {


        Optional<String> gender=Optional.of("MALE"); //non-empty optional
        Optional<String> status=Optional.empty() ;//empty optional
        Optional<String> value=Optional.ofNullable("Sample");
        if(gender.isPresent())
        {
            System.out.println(gender);
            System.out.println(gender.get());
        }


        if(status.isEmpty())
        {
            System.out.println("empty optional");
        }
        else
        {
            System.out.println("Non-empty optional");
        }

        if(value.isPresent())
        {
            System.out.println("Non-empty optional");
        }
        else
        {
            System.out.println("empty optional");
        }

        String name="Hyderabad";

        String city=Optional.ofNullable(name).orElse("Chennai");
        System.out.println(city);



        String city1=Optional.ofNullable(name).orElseGet(()->"Delhi");
        System.out.println(city1);

        String city2=Optional.ofNullable(name).orElseThrow(IllegalArgumentException::new);
        System.out.println(city2);
    }

}

