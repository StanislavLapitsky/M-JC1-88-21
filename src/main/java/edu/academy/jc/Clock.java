

package edu.academy.jc;

public class Clock {
    private int alarmMinutes;
    private int alarmHours;

    public String setAlarm(int hours, int minutes){

        alarmHours=hours;
        alarmMinutes=minutes;
        return (hours>=0&&hours<24)&&(minutes>=0&&minutes<60) ?alarmHours+":"+alarmMinutes: "";
    }

    public String checkAlarm(int hours, int minutes){

        alarmMinutes=0;
        alarmHours=6;

        return minutes==alarmMinutes&&hours==alarmHours ? "Chime" :null;
    }



    public int checkTimeCount(int hours, int minutes){
        int bell;

        bell=(minutes == 15 || minutes == 30 || minutes == 45 )&&( hours >= 0 && hours < 24) ? 1: 0 ;

        if (minutes == 0){
            if (hours >= 0 && hours < 13) {
                bell += hours;
            }
            if (hours >= 13 && hours < 24) {
                bell += hours-12;
            }
            if (hours == 0) {
                bell = 12;
            }

        }

        return bell;

    }
    public static void main(String[] args) {
        Clock myClock=new Clock();

        System.out.println(myClock.setAlarm(112,120));
        System.out.println(myClock.setAlarm(12,0)+"\n");

        //Alarm install 6:0
        System.out.println(myClock.checkAlarm(5,0));
        System.out.println(myClock.checkAlarm(6,0)+"\n");

        System.out.println(myClock.checkTimeCount(15,45));
        System.out.println(myClock.checkTimeCount(1,40));
        System.out.println(myClock.checkTimeCount(1,45));
        System.out.println(myClock.checkTimeCount(0,0));
        System.out.println(myClock.checkTimeCount(17,0));

    }

}


