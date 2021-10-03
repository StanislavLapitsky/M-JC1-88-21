package edu.academy.jc.likhina.hw6and7;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CheckDate {
    public static void main(String[] args) {
        Date date = new Date(999999992978l);
        System.out.println(date);
        System.out.println(checkDate(date));

        String timeStr = "10:60:59";
        String pattern = "^([0-2][0-9]):([0-5][0-9]):([0-5][0-9])$";
        System.out.println(getTime(timeStr, pattern));
    }

    public static boolean checkDate(Date date) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        long year = calendar.get(Calendar.YEAR);
        long mount = calendar.get(Calendar.MONTH);
        long day = calendar.get(Calendar.DATE);
        while (year > 0) {
            if (year % 10 == 2) {
                return true;
            }
            year = year / 10;
        }
        while (mount > 0) {
            if (mount % 10 == 2) {
                return true;
            }
            mount = mount / 10;
        }
        while (day > 0) {
            if (day % 10 == 2) {
                return true;
            }

            day = day / 10;
        }
        return false;
    }

    public static boolean getTime(String timeStr, String pattern) {
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(timeStr);
        if (m.matches()) {
            return true;
        }
        return false;

    }
}
