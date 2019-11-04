package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class pra {
    public static void main(String[] args) {
        Object object = new String("srinivas");
        Object object1 = "srinivas";
        System.out.println(object == object1);

        System.out.println(object.equals(object1));

        Lock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();

        AtomicInteger atomicInteger = new AtomicInteger(10);
        System.out.println("atomicInteger = " + atomicInteger);
        int i = atomicInteger.get();
        int i1 = atomicInteger.incrementAndGet();
        System.out.println("i1 = " + i1);

        SecureRandom secureRandom = new SecureRandom();
        IntStream ints = secureRandom.ints();


        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collect = integers.stream().peek(System.out::println).collect(Collectors.toList());
        System.out.println("collect = " + collect);


        List<List<Integer>> listListInteger = new ArrayList<>();

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(10, 20, 30, 40);

        listListInteger.add(list1);
        listListInteger.add(list2);

        listListInteger.stream().peek(System.out::println).flatMap(integers1 -> integers1.stream()).peek(System.out::println).count();


        Double collect1 = list1.stream().collect(Collectors.averagingDouble(value -> value));
        System.out.println("collect1 = " + collect1);


        IntStream intStream = list1.stream().mapToInt(value -> value);
        double asDouble = intStream.average().getAsDouble();
        System.out.println("asDouble = " + asDouble);
        
       /* IntStream intStream1 = (IntStream) list1.stream();
        double asDouble1 = intStream1.average().getAsDouble();
        System.out.println("asDouble1 = " + asDouble1);*/

    }
}
