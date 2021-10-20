package edu.academy.jc.yarokhovich.hw6and7;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateTime {

    public static void main(String[] args) {
        Date date1 = new Date(1212121212121L);
        Date date2 = new Date(521212L);
        System.out.println(date1);
        System.out.println(date2);

        System.out.println(checkDate(date1));
        System.out.println(checkDate(date2));

        String timeStr = "22:60:05";
        String pattern = "^([0-2][0-3]):([0-5][0-9]):([0-5][0-9])$";
        System.out.println(getTime(timeStr, pattern));
        timeStr = "13:29:05";
        System.out.println(getTime(timeStr, pattern));
    }

    public static boolean checkDate(Date date) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        String dateStr = "";
        String year = String.valueOf(calendar.get(Calendar.YEAR));
        String mount = String.valueOf(calendar.get(Calendar.MONTH));
        String day = String.valueOf(calendar.get(Calendar.DATE));
        dateStr = year + mount + day;

        return containsTwo(dateStr);
    }
    public static boolean containsTwo(String stringDate){
        for (char ch: stringDate.toCharArray()){
            if (2 == Character.getNumericValue(ch)){
                return true;
            }
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

