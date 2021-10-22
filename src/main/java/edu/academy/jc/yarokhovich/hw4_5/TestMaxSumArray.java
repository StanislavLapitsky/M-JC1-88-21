package edu.academy.jc.yarokhovich.hw4_5;

public class TestMaxSumArray {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }
    public static void test1(){
        int a [] = {1,1,1};
        int b [] = {1,2,3};
        int c [] = {3,3,3};
        Loops loops = new Loops();
        if( loops.getMaxSumArray(a,b,c)==3){
            System.out.println("test 1 good");
        }
    }
    public static void test2(){
        int a [] = {3,3,3};
        int b [] = {3,3,3};
        int c [] = {1,1,1};
        Loops loops = new Loops();
        if( loops.getMaxSumArray(a,b,c)==1){
            System.out.println("test 2 good");
        }
    }
    public static void test3(){
        int a [] = {3,3,3};
        int b [] = {3,300,3};
        int c [] = {1,1,1};
        Loops loops = new Loops();
        if( loops.getMaxSumArray(a,b,c)==2){
            System.out.println("test 3 good");
        }
    }
}
