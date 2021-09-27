package edu.academy.jc.gapaniuk.hw3;

public class Clock {
    public static void main(String[] args) {
        Clock Watch = new Clock();
        int timeH = 23;
        int timeM = 0;
        int alarmH = 23;
        int alarmM = 0;
        int tepmChime;


        System.out.println("The alarm is set to - " + Watch.setAlarm(alarmH, alarmM));
        System.out.print("On the clock - " + Watch.timeFormat(timeH, timeM) + " -- ");

        System.out.println(Watch.checkAlarm(timeH, timeM));
        tepmChime = Watch.checkTimeCout(timeH, timeM);

        switch (tepmChime) {
            case -1:{
                System.out.println("error");
                break;
            }

            case 1: {
                System.out.println(Watch.timeFormat(timeH, timeM) + " -- Chime once");
                break;
            }
            case 2: {
                System.out.println(Watch.timeFormat(timeH, timeM) + " -- Chime two times");
                break;
            }
            case 3: {
                System.out.println(Watch.timeFormat(timeH, timeM) + " -- Chime three times");
                break;
            }
            case 4: {
                System.out.println(Watch.timeFormat(timeH, timeM) + " -- Chime four times");
                break;
            }
            case 5: {
                System.out.println(Watch.timeFormat(timeH, timeM) + " -- Chime five times");
                break;
            }
            case 6: {
                System.out.println(Watch.timeFormat(timeH, timeM) + " -- Chime six times");
                break;
            }
            case 7: {
                System.out.println(Watch.timeFormat(timeH, timeM) + " -- Chime seven times");
                break;
            }
            case 8: {
                System.out.println(Watch.timeFormat(timeH, timeM) + " -- Chime eigth times");
                break;
            }
            case 9: {
                System.out.println(Watch.timeFormat(timeH, timeM) + " -- Chime nine times");
                break;
            }
            case 10: {
                System.out.println(Watch.timeFormat(timeH, timeM) + " -- Chime ten times");
                break;
            }
            case 11: {
                System.out.println(Watch.timeFormat(timeH, timeM) + " -- Chime eleven times");
                break;
            }
            case 12: {
                System.out.println(Watch.timeFormat(timeH, timeM) + " -- Chime twelve times");
                break;
            }
            default:
                System.out.println(Watch.timeFormat(timeH, timeM) + " -- No need to chime");


        }


    }

    int alarmHours = 0;
    int alarmMinutes = 0;

    private String timeFormat(int hours, int minutes) {
        String tempH = "";
        String tempM = "";
        if (controlValue(hours,minutes).equals("error")){
            return "error";
        }

        if (hours < 10) {
            tempH = "0" + Integer.toString(hours);
        } else {
            tempH = Integer.toString(hours);
        }
        if (minutes < 10) {
            tempM = "0" + Integer.toString(minutes);
        } else {
            tempM = Integer.toString(minutes);
        }
        return tempH + ":" + tempM;

    }
    public String controlValue(int h, int m){
        if (((h<0)||(h>23))||((m<0)||(m>60))){
            return "error";
        }
                return "";
    }
    public String setAlarm(int hours, int minutes) {

        if ((hours >= 0) && (hours < 24)) {
            if ((minutes >= 0) && (minutes < 60)) {
                this.alarmHours = hours;
                this.alarmMinutes = minutes;

                return this.timeFormat(hours, minutes);
            } else {
                System.out.println("Please correct minutes value");
                return "error";
            }
        } else {
            System.out.println("Please correct hours value");
            return "error";
        }
    }

    public String checkAlarm(int hours, int minutes) {
        if (controlValue(hours,minutes).equals("error")){
            return "error";
        }
        if ((this.alarmMinutes == minutes) && (this.alarmHours == hours)) {
            return "Alarm Chime";
        } else return "not alarm";
    }

    public int checkTimeCout(int hours, int minutes) {
        if (controlValue(hours,minutes).equals("error")){
            return -1;
        }


        if ((minutes == 15)||(minutes == 30)||(minutes == 45)) {
            return 1;
        } else if (minutes == 0) {
            if (hours % 12 == 0) {
                return 12;
            } else return hours % 12;

        } else return 0;
    }
}
