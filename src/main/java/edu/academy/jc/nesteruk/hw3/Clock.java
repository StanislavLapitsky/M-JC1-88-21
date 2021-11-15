package edu.academy.jc.nesteruk.hw3;

public class Clock {
    int alarmHours;
    int alarmMinutes;

    public String setAlarm(int hours, int minutes) {
        if (hours >= 24) {
            return "invalid hours";
        }
        if (minutes >= 60) {
            return "invalid minutes";
        }
        alarmHours = hours;
        alarmMinutes = minutes;
        return "The time has been set successfully";
    }

    public String checkAlarm(int hours, int minutes) {
        if (alarmHours == hours && alarmMinutes == minutes) {
            return "Chime";
        } else {
            return "";
        }
    }

    public int checkTimeCount(int hours, int minutes) {
        if (minutes == 0) {
            if (hours > 12) {
                return hours - 12;
            } else {
                return hours;
            }
        } else if (minutes % 15 == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
