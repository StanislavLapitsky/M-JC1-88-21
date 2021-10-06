package edu.academy.jc.likhina.hw6and7;

import java.time.LocalTime;
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

        String timeStr = "29:10:59";
        String pattern = "^([0-1][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])$";
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


   public static LocalTime getTime(String timeStr, String pattern) {
       LocalTime now= LocalTime.now();
       int hour = now.getHour();
       int minute = now.getMinute();
       int second = now.getSecond();

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(timeStr);
        if(m.matches()){
           int[]arr=new int[3];
           for (int i = 0; i < 3; i++) {
               arr[i] = Integer.parseInt(timeStr.split(":")[i]);
               hour = arr[0];
               minute = arr[1];
               second = arr[2];
           }
        }

return LocalTime.of(hour,minute,second);
    }
}
