package com.string.test;
import java.util.Arrays;
import java.util.Scanner;

public class Anagramex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int st1 = sc.nextInt();
        System.out.println("Enter an integer: ");
        int st2 = sc.nextInt();

        char array1[]= st1.toCharArray();
        char array2[]=st2.toCharArray();


        Arrays.sort(array1);
        Arrays.sort(array2);

        boolean flag=true;
        for(int i=0;i<array1.length;i++){
            if(array1[i]==array2[i]){
                flag=false;
                break;;
            }
        }
        if (flag)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}
