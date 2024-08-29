package com.arrayandstring;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter value at "+i+" index position:");
            arr[i]=Integer.parseInt(bufferedReader.readLine());
        }

        int low=0,upper=arr.length-1;
        int key=0;
        System.out.println("Enter the key element:");
        key=Integer.parseInt(bufferedReader.readLine());
        boolean flag=false;


        while(low<=upper)
        {
            int mid=(low+(upper-1))/2;


            if(arr[mid]==key)
            {
                flag=true;
                System.out.println(key +"present at "+mid +" index");
                break;
            }

            else if(arr[mid]>key)
            {
                upper=mid-1;
            }
            else
            {
                low=mid+1;
            }

        }


        if(flag==false)
        {
            System.out.println(key +" is not present");
        }



    }

}