package edu.academy.jc.gapaniuk.hw4i5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LoopsTest {
    public static void main(String[] args) {
    // testForLoop1();
     //testForLoop2();
     testForLoop3();

    }
    private static void testForLoop3(){
        Loops lp1=new Loops();
        int[] a=new int[]{123,258,1258,12,4,0,101};

        if (!Arrays.equals(a,lp1.rotateNumbers(lp1.rotateNumbers(a)))){
            System.out.println("error");
        }

    }
    private static void testForLoop1 (){
        Loops lp1 = new Loops();
        for (int i=-10;i<10;i++) {

            if (lp1.getSqr(i) != Math.pow(i, 2)) {
                System.out.println("error Sqr for N=" + i);
            }

        }
    }
    private static void testForLoop2(){
        Loops lp1 = new Loops();
        int a[]={1,2,3};
        int b[]={3,4,5};
        int c[]={10,11};
        if (lp1.getMaxSumArray(a,b,c)!=3){
            System.out.println("error");
        }
        int a1[]={1,2,3};
        int b1[]={3,4,1,100};
        int c1[]={10,11};
        if (lp1.getMaxSumArray(a1,b1,c1)!=2){
            System.out.println("error");
        }
        int a2[]={1,2,3};
        int b2[]={1,2,3};
        int c2[]={10,11};
        if (lp1.getMaxSumArray(a2,b2,c2)!=3){
            System.out.println("error");
        }
        int a3[]={1,2,3};
        int b3[]={1,2,3};
        int c3[]={0,6};
        if (lp1.getMaxSumArray(a3,b3,c3)!=0){
            System.out.println("error");
        }

    }

}
