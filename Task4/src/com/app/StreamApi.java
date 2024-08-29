package com.app;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<String> list =  Arrays.asList("java","c","python");
        List<String> result=list.stream().filter(language ->!language.equals("c")).collect(Collectors.toList());
        System.out.println(result);

        List<String> integers=Arrays.asList("1","2","3","4","5","6","7","8","9");
        List<Integer> result1=integers.stream().map(Integer::valueOf).map(x->x*x).collect(Collectors.toList());
        System.out.println(result1);

        List<Integer> evens=Arrays.asList(2,4,6);
        List<Integer> ods=Arrays.asList(3,5,7);
        List<Integer> primes=Arrays.asList(2,3,5,7,11);
        List<Integer> result2=Stream.of(evens,ods,primes).flatMap(l->l.stream()).collect(Collectors.toList());
    System.out.println(result2);
    List<Integer> distinctResult=result2.stream()
            .distinct()
            .collect(Collectors.toList());
    System.out.println(distinctResult);
    distinctResult.stream()
            .limit(3)
            .forEach(x->System.out.println(x+","));

    List<Integer> sortedResult=distinctResult.stream().sorted().collect(Collectors.toList());
    System.out.println(sortedResult);

    List<Integer> deslist=distinctResult.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    System.out.println(deslist);

    }

}
