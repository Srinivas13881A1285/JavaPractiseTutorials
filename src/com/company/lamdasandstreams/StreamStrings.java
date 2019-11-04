package com.company.lamdasandstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStrings {
    public static void main(String[] args) {
        String[] strings = {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};

        System.out.println("Names in Caps");
        List<String> namesInCaps = Arrays.stream(strings)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        namesInCaps.forEach(System.out::println);

        System.out.println("Strings greater than m ascending order");
        List<String> namesGreathanB = Arrays.stream(strings)
                .filter(s -> s.compareToIgnoreCase("m") > 0)
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());
        namesGreathanB.forEach(System.out::println);

        System.out.println("Strings greater than m descending order");
        List<String> namesGreaterThanBDescOrder = Arrays.stream(strings)
                .filter(s -> s.compareToIgnoreCase("'m") > 0)
                .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                .collect(Collectors.toList());
        namesGreaterThanBDescOrder.forEach(System.out::println);


        CharSequence charSequence = "srinivas".subSequence(1, 3);
        System.out.println("charSequence = " + charSequence);
        
        String subString = "srinivas".substring(1,3);
        System.out.println("subString = " + subString);

        String conversion = charSequence.toString();
    }
}
