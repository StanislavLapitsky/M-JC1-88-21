package edu.academy.jc.homeworkYaroslavskaya.HOMEWORK;

public class Clock {
    private int alarmMinute;
    private int alarmHour;

    public String setAlarm(int minutes, int hours) {
        alarmMinute = minutes;
        alarmHour = hours;
        return (hours >= 0 && hours < 24) && (minutes >= 0 && minutes < 60) ? alarmHour + ":" + alarmMinute : "";
    }

    public String checkAlarm(int hours, int minute) {
        alarmMinute = 0;
        alarmHour = 8;
        return minute == alarmMinute && hours == alarmHour ? "Chime" : null;
    }

    public int checkTimeCount(int hour, int minute) {
        int bell;

        bell = (minute == 15 || minute == 30 || minute == 45) && (hour >= 0 && hour < 24) ? 1 : 0;
        if (minute == 0) {
            if (hour >= 0 && hour < 13) {
                bell += hour;
            }
            if (hour >= 13 && hour < 24) {
                bell += hour - 12;
            }
            if (hour == 0) {
                bell = 12;
            }
        }
        return bell;
    }

    public static void main(String[] args) {
        Clock myClock = new Clock();

        System.out.println(myClock.setAlarm(112, 120));
        System.out.println(myClock.setAlarm(12, 0) + "\n");

        //Alarm install 6:0
        System.out.println(myClock.checkAlarm(5, 0));
        System.out.println(myClock.checkAlarm(6, 0) + "\n");

        System.out.println(myClock.checkTimeCount(15, 45));
        System.out.println(myClock.checkTimeCount(1, 40));
        System.out.println(myClock.checkTimeCount(1, 45));
        System.out.println(myClock.checkTimeCount(0, 0));
        System.out.println(myClock.checkTimeCount(17, 0));


    }
}