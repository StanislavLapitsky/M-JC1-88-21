package edu.academy.jc.yarokhovich.hw3;

public class Clock {
    public int alarmHours;
    public int alarmMinutes;

    public String setAlarm(int hours, int minutes) {
        if (((hours >= 0) && (hours < 24)) && ((minutes >= 0) && (minutes < 60))) {
            alarmHours=hours;
            alarmMinutes=minutes;
            return "Good";
        }else { return null;}
    }

    public String checkAlarm(int hours, int minutes) {
        if (hours == alarmHours && minutes == alarmMinutes) {
            return  "Chime";
        } else {
            return "";
        }
    }

    public int checkTimeCount(int hours, int minutes) {
        int temp;
        String check = setAlarm(hours,minutes);
        if(check != null && !check.trim().isEmpty()) {//check for a non-empty string!
            if (minutes == 0) {
                if (hours <= 12) {
                    temp = hours;
                } else temp = hours - 12;
            } else if (minutes == 15 || minutes == 30 || minutes == 45)
                temp = 1;
            else {
                temp = 0;
            }
        }else {System.out.print("Alarm! "); return 0;}//if the string is empty, then the values are not correct, Alarm and 0 are displayed
        return temp;
    }
}
