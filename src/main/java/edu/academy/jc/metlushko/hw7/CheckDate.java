package edu.academy.jc.metlushko.hw7;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CheckDate {
    public static void main(String[] args) {
        long y=1000L*60*60*24*365*30;
        long m=1000L*60*60*24*365/12;
        long d=1000L*60*60*24;
        long h=1000L*60*60;
        long minute=1000L*60;

        Date date=new Date();
        date.setTime(y-2*m-19*d+5*h+19*minute);
        System.out.println(date);
        Calendar calendar=new GregorianCalendar();
        calendar.setTime(date);

        System.out.println("YEAR "+calendar.get(Calendar.YEAR));
        System.out.println("MONTH "+(calendar.get(Calendar.MONTH)+1));
        System.out.println("HOUR "+calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("MINUTE "+calendar.get(Calendar.MINUTE));
        System.out.println("DATE "+calendar.get(Calendar.DATE));

        System.out.println(checkDate(date));

    }
    public static boolean checkDate(Date date){

        Calendar calendar=new GregorianCalendar();
        calendar.setTime(date);
        long year=calendar.get(Calendar.YEAR);
        long mount=calendar.get(Calendar.MONTH);
        long day=calendar.get(Calendar.DATE);
        long hour=calendar.get(Calendar.HOUR_OF_DAY);
        long minute=calendar.get(Calendar.MINUTE);
        while (year>0){
            if(year%10==2){
                return true;
            }
            year/=10;
        }
        while (mount>0){
            if(mount%10==2){
                return true;
            }
            mount/=10;
        }
        while (day>0){
            if(day%10==2){
                return true;
            }
            day/=10;
        }
        while (hour>0){
            if(hour%10==2){
                return true;
            }
            hour/=10;
        }
        while (minute>0){
            if(minute%10==2){
                return true;
            }
            minute/=10;
        }
        return false;
    }
}
