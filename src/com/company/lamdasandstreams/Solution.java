package com.company.lamdasandstreams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    Long n= null;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "aaabcbbrccc";
        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            characters.add(s.charAt(i));
        }
        Map<Character, List<Character>> collect = characters.stream().collect(Collectors.groupingBy(Function.identity()));
        collect.entrySet().forEach(System.out::println);


        Map<String, String> collect1 = Stream.of(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.joining()));
        collect1.entrySet().forEach(System.out::println);




            String sentence = "srinvias";

            Map<String, Long> frequentChars = Arrays.stream(
                    sentence.toLowerCase().split(""))
                    .collect(Collectors.groupingBy(c -> c , Collectors.counting()));
            System.out.println(frequentChars);

        Solution solution = new Solution();
        System.out.println("n = " + solution.n);

    }


}
