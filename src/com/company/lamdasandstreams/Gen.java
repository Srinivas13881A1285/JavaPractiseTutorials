package com.company.lamdasandstreams;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Gen {
    public static void main(String[] args) throws ParseException {
        Object[] test = new Object[2];
        test[0] = "srinvias";
        test[1] = 1;
        System.out.println(Arrays.toString(test));
        Object temp = test[0];
        test[0] = test[1];
        test[1] = temp.toString();
        System.out.println(Arrays.toString(test));

        List<Integer> numbers = new ArrayList<Integer>() {{
            add(10);
            add(20);
            add(30);
        }};

        System.out.println("numbers = " + numbers);

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("integers = " + integers);

        List<Integer> integers1 = Arrays.asList(new Integer(5), new Integer(10));
        System.out.println("integers1 = " + integers1);

        Date date = new SimpleDateFormat("MM/dd/yyyy").parse("05/03/2019");
        System.out.println("date = " + date);
        
        List<Number> in = new ArrayList<>();
        in.add(10);
        in.add(10.2);
        in.stream().mapToDouble( e -> (double) e).sum();

        List<?> n = new ArrayList<Double>();
        //  List<Number> numbers1 = new ArrayList<Double>();
        //  This wont work

        ArrayList<Number> numberArrayList = new ArrayList<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();

       //integerArrayList = (ArrayList<Integer>)numberArrayList;


       ArrayList objectArrayList  = new ArrayList();
       integerArrayList = objectArrayList;


        Date date1 = new Date();
        System.out.println(date1);





    }
}
