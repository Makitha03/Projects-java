package com.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Agecalculate
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //Take the user's birthdate as input
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");//1990-05-15
        String input = scanner.nextLine();

        // Step Parse the input into a LocalDate object
        LocalDate birthDate = LocalDate.parse(input, DateTimeFormatter.ISO_LOCAL_DATE);

        //  Get the current date
        LocalDate currentDate = LocalDate.now();

        //  Calculate the period between the birthdate and the current date
        Period age = Period.between(birthDate, currentDate);

        // Display the age in years, months, and days
        System.out.printf("Your age is: %d years, %d months, and %d days.%n",
                age.getYears(), age.getMonths(), age.getDays());
        //Your age is: 34 years, 1 months, and 2 days.
    }
}



