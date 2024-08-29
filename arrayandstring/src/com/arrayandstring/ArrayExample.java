package com.arrayandstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayExample {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        //Declaration
        int arr[]=new int[10];
        int []arr1=new int[10];
        int []arr2=new int[10];


        //initialization

        //static initialiazation
        int ar5[]={12,34,45,22,45};


        //Dynamic initialization
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter element at "+i+" index position:");
            arr[i]=Integer.parseInt(bufferedReader.readLine());

        }
    }
}
