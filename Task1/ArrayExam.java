package com.test;

public class ArrayExample {

	public static void main(String[] args) {
		
		//declaration
		int a;
		//initialization
		a=20;
		
		int c=10;
		
		int ar1[]= {1,2,3,4,5};
		int ar[]=new int[10];
		
		for(int i=0;i<5;i++)
		{
			ar[i]=i;
		}
		
		for(int i=0;i<=ar1.length-1;i++)
		{
			System.out.println(ar1[i]);
		}
		
		for(int x:ar1)
		{
			System.out.println(x);
		}
		
		
	}

}