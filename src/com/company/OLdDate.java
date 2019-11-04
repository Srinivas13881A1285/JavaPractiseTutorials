package com.company;

import java.util.Calendar;
import java.util.Date;

public class OLdDate {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,-1);
        Date yesteday = calendar.getTime();
        System.out.println("yesteday = " + yesteday);
        System.out.println(new Date());
    }
}
