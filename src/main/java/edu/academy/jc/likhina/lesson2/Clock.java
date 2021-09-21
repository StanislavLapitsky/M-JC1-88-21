package edu.academy.jc.likhina.lesson2;



public class Clock {
    public static void main(String[] args) {

            Clock clock = new Clock();
            clock.setAlarm(02,01);
            System.out.println(clock.checkAlarm(clock.getAlarmHours(), clock.getAlarmMinutes()));
            System.out.println(clock.checkTimeCount(clock.getAlarmHours(), clock.getAlarmMinutes())+" Call");
            System.out.println(clock.getTime());
        }

    private int alarmHours;
    private int alarmMinutes;

    public String setAlarm(int hours, int minutes) {

        alarmHours = hours;
        alarmMinutes = minutes;

        return ((hours>=0 && hours<24)&&(minutes>=0 && minutes<60)) ? alarmHours+":"+alarmMinutes : "Invalid value";
    }


    public String checkAlarm(int hours, int minutes){
        alarmHours=hours;
        alarmMinutes=minutes;
        return (alarmHours==hours && alarmMinutes == minutes)?"Crime":"";
    }

    public int checkTimeCount(int hours, int minutes){
        int call=1;
        if(minutes%15==0){
            call=1;
        }
        if (minutes==0) {
            if (hours >= 1 && hours <= 12) {
                call = hours;
            }
            if (hours >= 13 && hours <= 23) {
                call = hours - 12;
            }
            if (hours == 0) {
                call = 12;
            }
        }
        return call;

    }
   private  String getTime(){
        String s = ((alarmHours <= 9) ? ("0" + Integer.toString(alarmHours)) : Integer.toString(alarmHours))
                + ":" +
                ((alarmMinutes <= 9) ? ("0" + Integer.toString(alarmMinutes)) : Integer.toString(alarmMinutes));
        return s;
    }
    public int getAlarmHours() {
        return alarmHours;
    }

    public void setAlarmHours(int alarmHours) {
        this.alarmHours = alarmHours;
    }

    public int getAlarmMinutes() {
        return alarmMinutes;
    }

    public void setAlarmMinutes(int alarmMinutes) {
        this.alarmMinutes = alarmMinutes;
    }
}
