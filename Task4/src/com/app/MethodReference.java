package com.app;

import java.util.function.BiFunction;

class Test

{
    public static int addition(int a,int b)
    {
        return a+b;
    }
}
public class MethodReference {
    public static void main(String[] args) {
        BiFunction< Integer,Integer,Integer > biFunction=Test:: addition;
        System.out.println(biFunction.apply(10,5));


        BiFunction< Integer,Integer,Integer > biFunction1=(a1,b1)->Test.addition(10,20);
        System.out.println(biFunction.apply(10,20));

    }
}
