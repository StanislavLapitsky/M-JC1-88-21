package edu.academy.jc.yarokhovich.hw4and5;

import java.util.Arrays;

public class TestRotateNumbers {
    public static void main(String[] args) {
        int [] a = {1234,56,789};
        testRotate1(a);
    }
    public static void testRotate1(int [] a){
        Loops loops = new Loops();
        System.out.println(Arrays.toString(a));
        int [] b = loops.rotateNumbers(a);
        System.out.println(Arrays.toString(b));
        int [] newB = {4321,65,987};
        if(Arrays.equals(newB, b)){
            System.out.println("test 1 good");
        }else {
            System.out.println("bad");
        }
    }
}
