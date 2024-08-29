package com.test;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class StudentList {
    public static void main(String[] args) {
        //  Create a list of student names using the List interface
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Abi");
        studentNames.add("Babithra");
        studentNames.add("Arjun");
        studentNames.add("Catherine");
        studentNames.add("Arun");
        studentNames.add("David");
        studentNames.add("Aishwarya");
        studentNames.add("Elan");
        studentNames.add("Anirudh");
        studentNames.add("Babu");

        // Step 2: Use Stream API to filter names starting with "A"
        List<String> studentsWithA = studentNames.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        // Step 3: Print the result
        System.out.println("Students whose names start with 'A': " + studentsWithA);//[Abi, Arjun, Arun, Aishwarya, Anirudh]
    }
}
