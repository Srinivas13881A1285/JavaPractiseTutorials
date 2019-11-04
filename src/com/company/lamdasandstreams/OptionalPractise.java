package com.company.lamdasandstreams;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalPractise {
    public static void main(String[] args)throws Exception {
        /*//Creating Optional object from a String
        Optional<String> GOT = Optional.of("Game of Thrones");
        //Optional.empty() creates an empty Optional object
        Optional<String> nothing = Optional.empty();
        System.out.println(GOT.map(String::toLowerCase));
        System.out.println(nothing.map(String::toLowerCase));

        Optional<Optional<String>> anotherOptional = Optional.of(Optional.of("BreakingBad"));

        System.out.println("Value of Optional object"+anotherOptional);

        System.out.println("Optional.map: "
                +anotherOptional.map(gender -> gender.map(String::toUpperCase)));

        //Optional<Optional<String>>    -> flatMap -> Optional<String>
        System.out.println("Optional.flatMap: "
                +anotherOptional.flatMap(gender -> gender.map(String::toUpperCase)));*/

     /*   System.out.println("OptionalTest.filterMapOptionals");
        Student student = new Student();
        student.setName("Srinivas");
        student.setHasTeacher(true);


        Optional<Student> studentOptional = Optional.of(student);
        studentOptional.filter(student1 -> student.hasTeacher()).ifPresent(System.out::println);*/

        Optional<Integer> possible = Optional.empty();
        System.out.println("possible = " + possible);

        Optional<Integer> five = Optional.of(5);
        System.out.println("five = " + five);
        System.out.println("five.get() = " + five.get());
    }
}
