package com.arrayandstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Linearsearch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++) {
            System.out.print("enter values at position");
            arr[i] = Integer.parseInt(br.readLine());
        }
        int key=0;
        System.out.println("Enter key");
        key=Integer.parseInt(br.readLine());
        boolean flag=false;
            for(int i=0;i<arr.length;i++)
            {
                    if(key==arr[i])
                    {
                        flag=true;
                        System.out.println(key+"prsent at"+i+"index");
                        break;

                    }
            }
            if(flag==false) {
                System.out.println("Not found");
            }
        }
    }

