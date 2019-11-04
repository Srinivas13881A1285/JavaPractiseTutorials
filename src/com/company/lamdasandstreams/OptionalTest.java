package com.company.lamdasandstreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) throws Exception {
        attendesOptional();
        notAttendesOptional();
        creatingOptionals();
        ifElse();
        ifElseThrowOptionals();
        filterMapOptionals();
    }

    private static void notAttendesOptional() {
        System.out.println("OptionalTest.notAttendesOptional");
        List<Integer> attendes = Arrays.asList();
        Optional<Integer> reduce = attendes.stream().reduce(Integer::sum);
        System.out.println("reduce = " + reduce);
        if (reduce.isPresent()) System.out.println(reduce.get());
    }

    private static void attendesOptional() {
        System.out.println("OptionalTest.attendesOptional");
        List<Integer> attendes = Arrays.asList(10, 20, 30, 40);
        Optional<Integer> reduce = attendes.stream().reduce(Integer::sum);
        System.out.println("reduce = " + reduce);
        System.out.println(reduce.get());
    }

    private static void creatingOptionals() {
        System.out.println("OptionalTest.creatingOptionals");
        Student student = new Student();
        Optional<Student> studentOptional = Optional.of(student);
        System.out.println("studentOptional = " + studentOptional);
        System.out.println(studentOptional.get());
        System.out.println("Student if Present");
        studentOptional.ifPresent(System.out::println);

        student = null;
        Optional<Student> studentOptional1 = Optional.ofNullable(student);
        System.out.println("studentOptional1 = " + studentOptional1);
    }

    private static void ifElse() {
        System.out.println("OptionalTest.ifElse");
        Student student = null;
        Student defaultStudent = new Student();
        defaultStudent.setName("Default John");
        Optional<Student> studentOptional = Optional.ofNullable(student);
        String name = studentOptional.orElse(defaultStudent).getName();
        System.out.println("Get Name:" + name);
    }

    private static void ifElseThrowOptionals() throws Exception {
        System.out.println("OptionalTest.ifElseThrowOptionals");
        Student student = null;
        Optional<Student> optionalStudent = Optional.ofNullable(student);
        //optionalStudent.orElseThrow(Exception::new);
    }

    private static void filterMapOptionals() {
        System.out.println("OptionalTest.filterMapOptionals");
        Student student = new Student();
        student.setName("Srinivas");
        student.setHasTeacher(true);


        Optional<Student> studentOptional = Optional.of(student);
        studentOptional.filter(student1 -> student.hasTeacher()).ifPresent(System.out::println);
    }

}
