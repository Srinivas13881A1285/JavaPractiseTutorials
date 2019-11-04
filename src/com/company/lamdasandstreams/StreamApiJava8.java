package com.company.lamdasandstreams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiJava8 {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        stream.forEach(System.out::println);

        Integer[] a = {1,2,3};
        Stream<Integer> stream1 = Stream.of(a);
        stream1.forEach(System.out::println);


        //Stream<Date> stream2 = Stream.generate(()->{return new Date();});
        //stream2.forEach(System.out::println);

        Stream<String> stringStream =   Stream.of("AAA$BB$C".split("\\$"));
        stringStream.forEach(System.out::println);

        IntStream intStream = "0123459_abcdefg".chars();
        intStream.forEach(System.out::println);

        Stream<Integer> stream11 = Stream.of(1,2,3,4,6,7);
        Integer[] b = stream11.toArray(Integer[]::new);
        for(Integer n : b)
            System.out.println(n);

        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        System.out.println("Members Names starting with 'A'");
        memberNames.stream()
                .filter(m -> m.startsWith("A"))
                .forEach(System.out::println);

        System.out.println("startin with and converting to caps");
        memberNames.stream()
                .filter(m -> m.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("sorting and converting to caps");

        memberNames.stream()
                .sorted().map(String::toUpperCase)
                .forEach(System.out::println);



        List<String> memNamesInUpperCase = memberNames.stream()
                                                        .map(String::toUpperCase)
                                                        .collect(Collectors.toList());
        System.out.println("memNamesInUpperCase = " + memNamesInUpperCase);


        boolean matchedResult = memberNames.stream()
                                            .anyMatch(m -> m.startsWith("S"));
        System.out.println("Any Name starting with 'S' = " + matchedResult);

        matchedResult = memberNames.stream().allMatch(m -> m.startsWith("S"));
        System.out.println("all names starts with 'S' = " + matchedResult);

        matchedResult = memberNames.stream().noneMatch(m -> m.startsWith("S"));
        System.out.println("No Name startw with 's' = " + matchedResult);


        long totalMatched = memberNames.stream().filter(m->m.startsWith("S")).count();
        System.out.println("no of names starting with s = " + totalMatched);

        Optional<String> reduced = memberNames.stream().reduce((s1, s2)->s1+"#"+s2);
        System.out.println("reduced = " + reduced);
        String str = String.valueOf(reduced);
        System.out.println("str = " + str);
        String string =  reduced.get();
        System.out.println("string = " + string);


        String firstNameMatche = memberNames.stream().filter(m->m.startsWith("A")).findFirst().get();
        System.out.println("firstNameMatche = " + firstNameMatche);

        Integer maxNumber = Stream.of(1,2,3,5).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("maxNumber = " + maxNumber);
        
        
        Integer minNumber = Stream.of(1,2,3,-1,6).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("minNumber = " + minNumber);
        
        String smallNamePerson = memberNames.stream()
                                            .min(Comparator.comparing(String::length)).get();
        System.out.println("smallNamePerson = " + smallNamePerson);

        List<Integer> list = IntStream.of(1,2,3,4,5,6,7,8,9,10).boxed().collect(Collectors.toList());
        System.out.println("list = " + list);

        List<Integer> list1 = IntStream.of(1,2,4).mapToObj(Integer::valueOf).collect(Collectors.toList());
        System.out.println("list1 = " + list1);


        int[] Array = IntStream.of(1,2,10).toArray();
        System.out.println(Arrays.toString(Array));

        IntSummaryStatistics intSummaryStatistics = IntStream.of(1,2,3,4).summaryStatistics();
        long sum = intSummaryStatistics.getSum();
        System.out.println("sum = " + sum);
        double avg = intSummaryStatistics.getAverage();
        System.out.println("avg = " + avg);
        long max = intSummaryStatistics.getMax();
        System.out.println("max = " + max);
        long min = intSummaryStatistics.getMin();
        System.out.println("min = " + min);
        long count = intSummaryStatistics.getCount();
        System.out.println("count = " + count);


        String maxLengthString = Stream.of("a","b","c","da").max(Comparator.comparing(String::length)).get();
        System.out.println("maxLengthString = " + maxLengthString);
        
        String bigChar = Stream.of("ab","b").max(Comparator.comparing(String::valueOf)).get();
        System.out.println("bigChar = " + bigChar);

        List<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee(1, "Lokesh", 36));
        employees.add(new Employee(2, "Alex", 46));
        employees.add(new Employee(3, "Brian", 52));

        Comparator<Employee> comparator = Comparator.comparing( Employee::getAge );

// Get Min or Max Object
        Employee minObject = employees.stream().min(comparator).get();
        Employee maxObject = employees.stream().max(comparator).get();

        System.out.println("minObject = " + minObject);
        System.out.println("maxObject = " + maxObject);


        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

//1. Map entries
//        Consumer<Map.Entry<String, Integer>> action = System.out::println;
      //  Consumer action = System.out::println;
        map.entrySet().forEach(System.out::println);

        System.out.println("Custom Mapping printing");
        map.forEach(
                (key,values)->{
                    System.out.println(key);
                    System.out.println(values);
                }
        );


        Set<Integer> setOfNumbers = new HashSet<>();
        setOfNumbers.add(1);
        setOfNumbers.add(2);
        setOfNumbers.forEach(System.out::println);

        System.out.println("Set of Numbers after clear");
        setOfNumbers.clear();
        setOfNumbers.forEach(System.out::println);

        employees.stream()
                .filter(employee -> employee.getAge()>100).findFirst().orElseThrow(()-> new RuntimeException("No Employee Age is greater than 100"));



    }
}
class Employee{
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
    }


}
