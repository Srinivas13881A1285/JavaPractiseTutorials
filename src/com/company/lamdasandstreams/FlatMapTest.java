package com.company.lamdasandstreams;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapTest {
    public static void main(String[] args) {
        String[][] data = new String[][]{{"srinivas", "b"}, {"c", "d"}, {"srinivas", "f"}};
        Stream<String[]> stringStream = Arrays.stream(data);
        stringStream.filter(x->"srinivas".equals(x)).forEach(System.out::println);


    }
}
