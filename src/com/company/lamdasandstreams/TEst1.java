package com.company.lamdasandstreams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TEst1 {
    public static void main(String[] args) {
        int[] values = {7, 4, 3, 5, 1, 3, 7, 8, 6, 0, 9, 7, 4, 3, 5, 6};
        IntStream.of(values).forEach(System.out::println);

        int minElement = IntStream.of(values).min().getAsInt();
        System.out.println("minElement = " + minElement);

        int maxElement = IntStream.of(values).max().getAsInt();
        System.out.println("maxElement = " + maxElement);


        double Average = IntStream.of(values).average().getAsDouble();
        System.out.println("Average = " + Average);

        long count = IntStream.of(values).count();
        System.out.println("count = " + count);

        IntSummaryStatistics intSummaryStatistics = IntStream.of(values).summaryStatistics();
        intSummaryStatistics.getAverage();
        intSummaryStatistics.getCount();
        intSummaryStatistics.getMax();
        intSummaryStatistics.getMin();
        intSummaryStatistics.getSum();

        //IntSummaryStatistics does above operations in only one pass

        // reduce

        //reduce expects a lamda of type BinaryOperator<T>

        int sumOfArray = IntStream.of(values)
                .reduce(0, (sum, y) -> sum + y);

        int sumOfSquares = IntStream.of(values).reduce(0, (sum, y) -> sum + y * y);

        int productOfArray = IntStream.of(values).reduce(1, (sum, y) -> sum * y);

        //even values displayed in sorted order

        IntStream.of(values).filter(value -> value % 2 == 0).sorted().forEach(System.out::println);

        IntPredicate even = value -> value % 2 == 0;
        IntPredicate greaterThan5 = value -> value > 5;

        IntPredicate evenAndGreaterThan5 = even.and(greaterThan5);

        System.out.println("Elements Even and Greather than 5");
        IntStream.of(values).filter(evenAndGreaterThan5).forEach(System.out::println);


        //map accepts lamda of type UnaryOperator
        IntStream.of(values).filter(value -> value % 2 != 0).map(value -> value * 10).sorted().forEach(System.out::println);

        int sumOfFirstNine = IntStream.range(1, 10).sum();
        int sumOfFirstTen = IntStream.range(1, 10).sum();


        long sum = IntStream.concat(IntStream.of(values), IntStream.of(values)).sum();
        System.out.println("sum = " + sum);

        System.out.println("IntStream generates infinite numbers using a supplier defined in lamda");

        IntStream generateExample = IntStream.generate(()->
                                    {
                                            return (int)(Math.random()*1000);
                                    });

        generateExample.limit(7).forEach(System.out::println);

        System.out.println("for each ordered");
        IntStream.of(values).forEachOrdered(System.out::println);

        Integer[] integers = {1,2,3,4};
        System.out.println(IntStream.of(values));

        System.out.println(Arrays.stream(integers));
        Arrays.stream(integers).mapToInt(e -> e).sum();

        List<Integer> collectedListOfIntegers = Arrays.stream(integers).filter(integer -> integer > 4).sorted().collect(Collectors.toList());



    }
}
