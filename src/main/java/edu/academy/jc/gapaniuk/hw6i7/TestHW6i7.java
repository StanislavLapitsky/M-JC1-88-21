package edu.academy.jc.gapaniuk.hw6i7;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestHW6i7 {
    public static void main(String[] args) {

        Date today = new Date();
        Calendar cc = new GregorianCalendar(1222, 11, 22);
        today = cc.getTime();
        System.out.println(today.toString());
        TestHW6i7 D = new TestHW6i7();

        D.checkDate(today);
        if (!D.LocalTime("21:04:34")){
            System.out.println("error");
        };if (!D.LocalTime("01:04:39")){
            System.out.println("error");
        };if (D.LocalTime("21.04:34")){
            System.out.println("error");
        };if (D.LocalTime("31:04:34")){
            System.out.println("error");
        };if (D.LocalTime("25:04:34")){
            System.out.println("error");
        };


    }
    boolean LocalTime (String timeStr){
        return timeStr.matches("(([0-1][0-9])|([2][0-3])):{1}([0-5][0-9]):{1}([0-5][0-9])");
    }

    boolean checkDate(Date date) {
        SimpleDateFormat formatDay = new SimpleDateFormat("dd");
        SimpleDateFormat formatMonth = new SimpleDateFormat("MM");
        SimpleDateFormat formatYear = new SimpleDateFormat("yyyy");
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(format.format(date));

        if (format.format(date).matches("(.+2.+)+")) {
            System.out.print(format.format(date) + " true (");
            if (formatDay.format(date).equals("22")) {
                System.out.print(" две 2 в дне");
            } else if (formatDay.format(date).matches("(.2{1})|(2{1}.)")) {
                System.out.print(" 2 в дне");
            }

            if (formatMonth.format(date).matches("(.2{1})")) {
                System.out.print(" 2 в месяце");
            }
            if (formatYear.format(date).matches("2{4}")) {
                System.out.print(" четыре 2 в году");
            } else if (formatYear.format(date).matches("(.?2{1}.?){3}")) {
                System.out.print(" три 2 в году");
            } else if (formatYear.format(date).matches("(.{0,3}2{1}.{0,3}){2}")) {
                System.out.print(" две 2 в году");
            }else if (formatYear.format(date).matches("(.{0,3}2{1}.{0,3}){1}")) {
                System.out.print(" 2 в году");
            }
            System.out.print(")");
            return true;


        }

        return false;
    }
}
