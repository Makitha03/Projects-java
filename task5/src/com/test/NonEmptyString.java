package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyString
{
    public static void main(String[] args)
    {
        //Create a list of strings
        List<String> strings = Arrays.asList("abc", "", "be", "efg", "abcd", "", "ikl");

        //Use Stream API to filter out empty strings
        List<String> nonEmptyStrings = strings.stream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList());

        // Print the result
        System.out.println(nonEmptyStrings);//[abc, be, efg, abcd, ikl]

    }
}

