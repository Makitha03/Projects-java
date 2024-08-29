package com.test;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseconvertor
{
    public static void main(String[] args)
    {
         //Create a list of strings
        List<String> names = Arrays.asList("abc", "d", "ef");

        // Use Stream API to convert each string to uppercase
        List<String> uppercasedNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Print the result
        System.out.println(uppercasedNames);//[ABC,  D,  EF]
    }
}




