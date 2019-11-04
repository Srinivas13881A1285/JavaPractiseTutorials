package com.company.lamdasandstreams;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeStreams {

    public static void main(String[] args) {
        Employee1[] employees = {
                new Employee1("Srinivas", "Chintakindhi", "Epam", 50000),
                new Employee1("Bharathi", "Chintakindhi", "Kore", 55000),
                new Employee1("Priyanka", "Kotturi", "DBS", 55000),
                new Employee1("Manasa", "Ivaturi", "IvycomTech", 65000),
                new Employee1("MahitaFirstName", "Mahita", "OpenText", 50000),
                new Employee1("Sindhu", "Chamanthi", "OpenText", 50000),
                new Employee1("Manas", "Mohammed", "OpenText", 50000),
                new Employee1("Navya", "Srinivas", "Nothing", 54000)};

        Predicate<Employee1> salaryFiftyToFiftyFive =
                employee -> employee.getSalary() >= 50000 &&  employee.getSalary() <= 55000;

        System.out.println("Employess whose Salary is between 50 and 55 ");
        Arrays.stream(employees)
                .filter(salaryFiftyToFiftyFive)
                .forEach(System.out::println);


        Predicate<Employee1> salaryFiftyFiveToSixty =
                employee -> (employee.getSalary() >= 55000 && employee.getSalary() <=60000);


        System.out.println("Employess whose Salary is between 55 and 60 ");
        Arrays.stream(employees)
                .filter(salaryFiftyFiveToSixty)
                .forEach(System.out::println);


        System.out.println("Employees whoes Salary is between 55 and 60 ascending order");
        Arrays.stream(employees)
                .filter(salaryFiftyFiveToSixty)
                .sorted(Comparator.comparing(Employee1::getSalary))
                .forEach(System.out::println);

        Employee1 employee = Arrays.stream(employees)
                .filter(salaryFiftyToFiftyFive)
                .findFirst().get();
        System.out.println("employee = " + employee);

        System.out.println("Employess sorted on lastname and then first name ");

        Function<Employee1,String> lastName = Employee1::getLastName;
        Function<Employee1,String> firstName = Employee1::getFirstName;

        Comparator<Employee1> lastAndThenFirstName = Comparator.comparing(lastName).thenComparing(firstName);
        Arrays.stream(employees).sorted(lastAndThenFirstName).forEach(System.out::println);
        Arrays.stream(employees).sorted(lastAndThenFirstName.reversed()).forEach(System.out::println);

        System.out.println("Grouping Employees By Lastname");
        Map<String,List<Employee1>> map = Arrays.stream(employees
        ).collect(Collectors.groupingBy(Employee1::getLastName));

        map.forEach(
                (key,values)->
                {
                    System.out.print(key+"--->");
                    values.forEach(System.out::println);
                }
        );


        map.entrySet().forEach(System.out::println);


        System.out.println("counting employes in eac" +
                "" +
                "" +
                "" +
                "h lastname");
        Map<String,Long>  countByLastName = Arrays.stream(employees)
                                                        .collect(Collectors.groupingBy(Employee1::getLastName,TreeMap::new,Collectors.counting()));
        countByLastName.entrySet().forEach(System.out::println);

        System.out.println("printing another time custom map method");
        countByLastName.forEach(
                (key,values)-> {
                    System.out.println(key+"--->");
                    System.out.print(values);
                }
        );

         double sumOfAllEmployeeSalaires = Arrays.stream(employees)
                .mapToDouble(Employee1::getSalary)
                .sum();
        System.out.println("sumOfAllEmployeeSalaires = " + sumOfAllEmployeeSalaires);




        double avgOfAllEmployeesSalaries = Arrays.stream(employees)
                                                    .mapToDouble(Employee1::getSalary)
                                                    .average().getAsDouble();
        System.out.println("avgOfAllEmployeesSalaries = " + avgOfAllEmployeesSalaries);


        //  this is awesome java 8
        //  compete with python
        //  compete with python
        //  complete the program
        //  I thought HashMap But I realized I dont know how it internally works

    }
}