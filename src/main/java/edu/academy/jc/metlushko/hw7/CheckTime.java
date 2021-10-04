package edu.academy.jc.metlushko.hw7;

import java.time.LocalTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckTime {
    public static void main(String[] args) {

        String myPattern="(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])";

        System.out.println(getTime("02:00:00",myPattern));
        System.out.println(getTime("102:00:00",myPattern));
        System.out.println(getTime("25:00:00",myPattern));
        System.out.println(getTime("02:1:00",myPattern));
        System.out.println(getTime("02:00:1",myPattern));
        System.out.println(getTime("24:00:00",myPattern));
        System.out.println(getTime("23:59:59",myPattern));
        System.out.println(getTime("q:00:00",myPattern));
        System.out.println(getTime("1:00:00",myPattern));
        System.out.println(getTime("00:00:01",myPattern));
        
    }
    public static LocalTime getTime (String timeStr, String pattern){
        int hours=0;
        int minutes=0;
        int seconds=0;
        Pattern p=Pattern.compile(pattern);
        Matcher matcher=p.matcher(timeStr);
        if(matcher.matches()){
            int[]arr=new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i]=Integer.parseInt(timeStr.split(":")[i]);
                hours=arr[0];
                minutes=arr[1];
                seconds=arr[2];
            }
        }
        return LocalTime.of(hours,minutes,seconds);
    }
}
