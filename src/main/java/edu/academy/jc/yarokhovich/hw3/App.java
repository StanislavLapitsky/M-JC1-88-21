package edu.academy.jc.yarokhovich.hw3;

public class App {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.setAlarm(15,00);
        clock.checkAlarm(15,00);
        clock.checkTimeCount(17,00);
        System.out.println(clock.setAlarm(15,15));
        System.out.println(clock.checkAlarm(15,15));
        System.out.println(clock.checkTimeCount(17,00));
        System.out.println("//////////");
        System.out.println( clock.setAlarm(25,00));
        System.out.println(clock.checkAlarm(15,00));
        System.out.println(clock.checkTimeCount(20,15));
        System.out.println("///////////");
        System.out.println(clock.checkTimeCount(20,15));
        System.out.println(clock.checkTimeCount(20,30));
        System.out.println(clock.checkTimeCount(26,00));
    }
}
