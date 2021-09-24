package edu.academy.jc.metlushko.ht4;

import java.util.Arrays;
import java.util.Random;

public class Loops {
    public static void main(String[] args) {

        LoopsTest loopsTest=new LoopsTest();


        loopsTest.checkGetSqr(6,36);
        loopsTest.checkGetSqr(4,16);
        loopsTest.checkGetSqr(0,0);

        loopsTest.checkGetMaxSumArray(new int[]{1,2,3},new int[]{9,8,7},new int[]{4,5,6},24);

        loopsTest.checkRotateNumbers(new int[]{123,1234});

    }
    protected int getSqr(int n){

        return (int) Math.pow(n,2);
    }
    protected int getMaxSumArray(int[] a,int []b,int []c){
        int sumA=0;
        int sumB=0;
        int sumC=0;

        for (int i:a) {
            sumA+=i;
        }
        for (int i:b) {
            sumB+=i;
        }
        for (int i:c) {
            sumC+=i;
        }

        System.out.println(Arrays.toString(a)+sumA);
        System.out.println(Arrays.toString(b)+sumB);
        System.out.println(Arrays.toString(c)+sumC);

        return sumA>sumB && sumA>sumC ? sumA: Math.max(sumB, sumC);
    }

    protected int[] generationArray(int quantity,int max){
        Random random=new Random();
        int []array=new int[quantity];
        for (int i = 0; i < quantity; i++) {
            array[i]=random.nextInt(max);
        }
        return array;
    }
    protected int[] rotateNumbers(int []a){
        for (int i = 0; i < a.length; i++) {
            a[i]=Integer.parseInt(reverseString(Integer.toString(a[i])));
        }
        return a;
    }

    protected String reverseString(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }



}


