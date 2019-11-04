package com.company.lamdasandstreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FilesAndStreams {
    public static void main(String[] args) throws IOException {



        List<Integer> numbers = Arrays.asList(1,1,1,4,5,5,6,7,1,1,2,5);
        numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(),TreeMap::new,Collectors.counting())).entrySet().forEach(System.out::println);

        System.out.println("not sorted");
        numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach(System.out::println);

    }
}
