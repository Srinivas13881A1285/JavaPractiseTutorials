package com.company.lamdasandstreams.dateandtime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class DateTimeApiJava8 {

    public static void main(String[] args) {

        LocalDateTime presentTime = LocalDateTime.now();
        System.out.println("presentTime = " + presentTime);

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);

        LocalDate nextWeek = localDate.plus(2,ChronoUnit.WEEKS);
        System.out.println("nextWeek = " + nextWeek);

        Period between = Period.between(localDate,nextWeek);
        System.out.println("between = " + between);

        LocalTime nextHour = localTime.plus(1,ChronoUnit.HOURS);
        System.out.println("nextHour = " + nextHour);

        Duration bet = Duration.between(localTime,nextHour);
        System.out.println("bet = " + bet);

        ZonedDateTime today = ZonedDateTime.now();
        System.out.println("today = " + today);

        Set<String> zones = ZoneId.getAvailableZoneIds();
        zones.forEach(System.out::println);

        ZoneId defaultSystemZone = ZoneId.systemDefault();
        System.out.println("defaultSystemZone = " + defaultSystemZone);

        LocalDate myBirthDay = LocalDate.of(1994,9,23);
        System.out.println("myBirthDay = " + myBirthDay);

        LocalDate dateReadingFromString = LocalDate.parse("1994-09-23");
        System.out.println("dateReadingFromString = " + dateReadingFromString);


        System.out.println(dateReadingFromString.getYear());
        System.out.println(dateReadingFromString.getMonth());
        System.out.println(dateReadingFromString.getMonthValue());
        System.out.println(dateReadingFromString.getDayOfMonth());
        System.out.println(dateReadingFromString.getDayOfWeek());

        LocalDate startJob = LocalDate.of(2017, Month.JANUARY,04);
        System.out.println("startJob = " + startJob);

        LocalDate bDay = LocalDate.of(2052,03,10);
        System.out.println(bDay.plusDays(10));
        System.out.println(bDay.plusMonths(2));
        System.out.println(bDay.minusDays(1));
        System.out.println(bDay.minusWeeks(2));
        System.out.println(bDay.minusYears(2));



        LocalTime timeHrsMin = LocalTime.of(3,10);
        System.out.println("timeHrsMin = " + timeHrsMin);

        LocalTime timeHrsMinSec = LocalTime.of(3,10,40);
        System.out.println("timeHrsMinSec = " + timeHrsMinSec);

        LocalTime timeHrsMinSecNano = LocalTime.of(3,11,50,100000000);
        System.out.println("timeHrsMinSecNano = " + timeHrsMinSecNano);
        

        LocalTime timeReadingFromString = LocalTime.parse("13:30:42");
        System.out.println("timeReadingFromString = " + timeReadingFromString);


        LocalDateTime firstDate = LocalDateTime.of(2010,11,12,13,45,10);
        System.out.println("firstDate = " + firstDate);

        int hourOfFirstDate = firstDate.getHour();
        System.out.println("hourOfFirstDate = " + hourOfFirstDate);

        DayOfWeek day = firstDate.getDayOfWeek();
        System.out.println("day = " + day);

        Period period1 = Period.of(2000,10,1);
        System.out.println("period1 = " + period1);
        
        String str = period1.toString();
        System.out.println("str = " + str);

        Period period = Period.ofYears(2);
        System.out.println("period = " + period);

        LocalDate date1 = LocalDate.of(1994,9,23);
        LocalDate date2 = LocalDate.of(2019,02,28);
        Period period2 = Period.between(date1,date2);
        System.out.println("period2 = " + period2);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter formatter3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        DateTimeFormatter formatter4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);



        DateTimeFormatter formatter5 = DateTimeFormatter.BASIC_ISO_DATE;

        DateTimeFormatter formatter6 =
                DateTimeFormatter.ofPattern("dd. MMMM YYYY");
        LocalDate someDate = LocalDate.of(1995, 4, 30);
        System.out.println(formatter1.format(someDate));
        System.out.println(formatter2.format(someDate));
        System.out.println(formatter3.format(someDate));
        System.out.println(formatter4.format(someDate));
        System.out.println(formatter5.format(someDate));
        System.out.println(formatter6.format(someDate));





    }
}
