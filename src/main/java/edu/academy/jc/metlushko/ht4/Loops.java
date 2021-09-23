package edu.academy.jc.metlushko.ht4;

import java.util.Arrays;
import java.util.Random;

public class Loops {
    public static void main(String[] args) {

        LoopsTest.checkGetSqr(6,36);
        LoopsTest.checkGetSqr(4,16);
        LoopsTest.checkGetSqr(0,0);

        LoopsTest.checkGetMaxSumArray(new int[]{1,2,3},new int[]{9,8,7},new int[]{4,5,6},24);

        LoopsTest.checkRotateNumbers(new int[]{123,1234});

    }
    private static int getSqr(int n){
        return (int) Math.pow(n,2);
    }
    private static int getMaxSumArray(int[] a,int []b,int []c){
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

    private static int[] generationArray(int quantity,int max){
        Random random=new Random();
        int []array=new int[quantity];
        for (int i = 0; i < quantity; i++) {
            array[i]=random.nextInt(max);
        }
        return array;
    }
    private static int[] rotateNumbers(int []a){
        for (int i = 0; i < a.length; i++) {
            a[i]=Integer.parseInt(reverseString(Integer.toString(a[i])));
        }
        return a;
    }

    public static String reverseString(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }


    static class LoopsTest {
        public static void checkGetSqr(int number, int result){
            if(result!=getSqr(number)){
                System.out.println("Not right working!");
            }
            else System.out.println("All right in method getSqr");
        }
        public static void checkGetMaxSumArray(int[] first,int[] second,int[] third, int result){


            if( result!=getMaxSumArray(first,second,third)){
                System.out.println("Not right working!");
            }
            else {
                System.out.println("All right in method getMaxSumArray");
            }

        }
        public static void checkRotateNumbers(int [] arrays){

            for (int i = 0; i < arrays.length; i++) {

                StringBuilder stringBuilder=new StringBuilder(String.valueOf(arrays[i]));
                int n= Integer.parseInt(""+stringBuilder.reverse());

                if(rotateNumbers(arrays)[i]==n){
                    System.out.println(arrays[i]);
                }
                else {
                    System.out.println("not working");
                    return;
                }
            }
            System.out.println("All right in method rotateNumbers");

        }
    }
}
