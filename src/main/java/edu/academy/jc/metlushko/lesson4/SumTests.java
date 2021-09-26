package edu.academy.jc.metlushko.lesson4;

public class SumTests {
    public static void methodSumTest(){
        if(6!=Sum.getSum(3)){
            System.out.println("Method don't work right!");
        }
        if(15!=Sum.getSum(5)){
            System.out.println("Method don't work right!");
        }
        if(78!=Sum.getSum(12)){
            System.out.println("Method don't work right!");
        }
        if(91!=Sum.getSum(14)){
            System.out.println("Method don't work right!");
        }
        if(91!=Sum.getSum(18)){
            System.out.println("Method don't work right!");
        }
        else {
            System.out.println("All test good!");
        }
    }
}
