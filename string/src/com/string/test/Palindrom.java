package com.string.test;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String st = sc.nextLine();
        String rev="";
        String sarray[]=st.split(" ");


        for(int i=0;i<sarray.length;i++)
        {
            String word=sarray[i];
            for(int j=word.length()-1;j>=0;j--)
            {
                rev=rev+word.charAt(j);
            }
            if (rev.equals(word))
            {
                System.out.println(word+" ");
            }
            rev="";
        }
    }
}
