package edu.academy.jc.nesteruk.hw3;

public class Main {
    public static void main(String[] args) {
        testAlarm(12,45,"Chime");

        testAlarmCount(15, 45, 1);
        testAlarmCount(3, 15, 1);
        testAlarmCount(15, 43, 1);

    }

    static void testAlarm (int hours, int minutes, String result){
        Clock clock = new Clock();
        clock.setAlarm(hours, minutes);

        if (clock.checkAlarm(hours, minutes).equals(result)){
            System.out.println("Проверка на будильник прошла успешно!");
        } else {
            System.out.println("Проверка на будильник не прошла!");
        }
    }
    static void testAlarmCount (int hours, int minutes, int result){
        Clock clock = new Clock();
        if (clock.checkTimeCount(hours, minutes) == result){
            System.out.println("Проверка на число звонков прошла успешно!");
        } else {
            System.out.println("Проверка на число звонков не прошла!");
        }
    }
}
