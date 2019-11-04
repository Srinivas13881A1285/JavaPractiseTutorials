package com.company.lamdasandstreams;

import java.util.*;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        int n = IntStream.of(1,2).min().getAsInt();
        int m = IntStream.of(1,3).max().getAsInt();
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        OptionalInt a = IntStream.of().min();
        System.out.println("a = " + a);
        long sum = IntStream.of(1,2,4).sum();
        System.out.println("sum = " + sum);
        System.out.println("sum = " + sum);
        
        long sumofsq = IntStream.of(1,2,3).reduce(0,(x,y)->x+y*y);
        System.out.println("sumofsq = " + sumofsq);

        IntStream stream = IntStream.of(1);
        stream.forEach(System.out::println);
        //  This is ver interesting
        //  ParallelStream
        //IntSummaryStatistics intSummaryStatistics = IntSummaryStatistics.off
        // This is so called so senesei
        //  Naruto Uzumaki
        //  Naruto uzumaki
        // This is so called functional programiing
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("srinivas",1);
        hashMap.put("Bharathi",2);
        hashMap.entrySet().forEach(System.out::println);

        IntPredicate even = value -> value % 2 == 0;
        IntPredicate greaterThan5 = value -> value > 5 ;

        IntPredicate combine = even.and(greaterThan5);

        System.out.println("combine = " + combine);

        IntStream.of(13,4,5,6,6).filter(combine).forEach(System.out::println);

        System.out.println("Numbers from 1 to 9");
        IntStream.range(1,10).forEach(System.out::println);

        System.out.println("Numbers from 1 to 10");
        IntStream.rangeClosed(1,10).forEach(System.out::println);

        int[] test = {1,2,3};
        int[] test2 = {1,2,3};
        // typng test
        Arrays.stream(test2);


        System.out.println("Names greater than B");
        String names[] = {"Srinivas","Bharathi","Priyanka","Manasa","Mahita"};

       List<String> namesGreatherThanB =  Arrays.stream(names)
              .filter(s -> s.compareToIgnoreCase("B") > 0).
                sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList());
       namesGreatherThanB.forEach(System.out::println);


    }

}
