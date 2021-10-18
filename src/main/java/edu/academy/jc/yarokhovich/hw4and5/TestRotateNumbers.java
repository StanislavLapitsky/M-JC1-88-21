package edu.academy.jc.yarokhovich.hw4and5;

import java.util.Arrays;

public class TestRotateNumbers {
    public static void main(String[] args) {
        testRotate1();
    }
    public static void testRotate1(){
        int [] a = {1234,56,789};
        Loops loops = new Loops();
        System.out.println(Arrays.toString(a));
        int [] b = loops.rotateNumbers(a);
        System.out.println(Arrays.toString(b));
        if( loops.rotateNumbers(a)==b){
            System.out.println("test 1 good");
        }
    }
}
