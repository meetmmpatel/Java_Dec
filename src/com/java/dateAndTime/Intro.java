package com.java.dateAndTime;

import java.util.Calendar;
import java.util.TimeZone;

public class Intro {


    public static void main(String[] args) {

        int year = 2019;
        int month = 01;
        int day = 20;

        Calendar calendar = Calendar.getInstance();

        calendar.clear();

        System.out.println();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DATE, day);

        System.out.println(calendar.getTime());
        System.out.println();

        Calendar cal = Calendar.getInstance();
        // Get and display information of current date from the calendar:
        System.out.println();
        System.out.println("Year: " + cal.get(Calendar.YEAR));
        System.out.println("Month: " + cal.get(Calendar.MONTH));
        System.out.println("Day: " + cal.get(Calendar.DATE));
        System.out.println("Hour: " + cal.get(Calendar.HOUR));
        System.out.println("Minute: " + cal.get(Calendar.MINUTE));
        System.out.println();

        /**
         * Get the Maximum Time and Date and Month.
         */
        System.out.println("\nCurrent Date and Time:" + cal.getTime());
        int actualMaxYear = cal.getActualMaximum(Calendar.YEAR);
        int actualMaxMonth = cal.getActualMaximum(Calendar.MONTH);
        int actualMaxWeek = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
        int actualMaxDate = cal.getActualMaximum(Calendar.DATE);

        System.out.println("Actual Maximum Year: "+actualMaxYear);
        System.out.println("Actual Maximum Month: "+actualMaxMonth);
        System.out.println("Actual Maximum Week of Year: "+actualMaxWeek);
        System.out.println("Actual Maximum Date: "+actualMaxDate+"\n");
        System.out.println();

        /**
         * Get the current time of New York city
         */
        Calendar calNewYork = Calendar.getInstance();
        calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println();
        System.out.println("Time in New York: " + calNewYork.get(Calendar.HOUR_OF_DAY) + ":"
                + calNewYork.get(Calendar.MINUTE)+":"+calNewYork.get(Calendar.SECOND));
        System.out.println();

        /**
         Write a Java program to get current full date and time.
         */

        Calendar now = Calendar.getInstance();
        System.out.println();
        System.out.println("Current full date and time is : " + (now.get(Calendar.MONTH) + 1) + "-"
                + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR) + " "
                + now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ":"
                + now.get(Calendar.SECOND) + "." + now.get(Calendar.MILLISECOND));
        System.out.println();


    }
}
