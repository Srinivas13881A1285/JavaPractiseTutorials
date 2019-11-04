package com.company.lamdasandstreams;

import javafx.scene.shape.Path;

import java.nio.file.Files;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringMethods {
    public static void main(String[] args) {

        String joined = String.join("/","usr","local","bin");
        System.out.println(joined);

        String ids = String.join(", ", ZoneId.getAvailableZoneIds());
        System.out.println(ids);


        String[] names = {"Srinvias","Srinu"};
        String pair = String.join(",",names);
        System.out.println("pair = " + pair);


        Stream<String> stringStream =   Stream.of("AAA$BB$C".split("\\$"));
        stringStream.forEach(System.out::println);


        IntStream intStream = "0123459_abcdefg".chars();
        intStream.forEach(System.out::println);

//Creating Optional object from a String
        Optional<String> GOT = Optional.of("Game of Thrones");
        //Optional.empty() creates an empty Optional object
        Optional<String> nothing = Optional.empty();

        //orElse() method
        System.out.println(GOT.orElse("Default Value"));
        System.out.println(nothing.orElse("Default Value"));

        //orElseGet() method
        System.out.println(GOT.orElseGet(() -> "Default Value"));
        System.out.println(nothing.orElseGet(() -> "Default Value"));


    }
}
