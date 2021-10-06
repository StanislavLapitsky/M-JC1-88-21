package edu.academy.jc.likhina.hw4;


import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Loops {
    public static void main(String[] args) {

        Loops arr = new Loops();
        System.out.println(arr.getSqr(arr.n));
        System.out.println(arr.getMaxSumArray(arr.a, arr.b, arr.c));

    }

    int n = 11;
    int res;
    int maxSum;
    int[] a = {1234, 56, 789};
    int[] b = {2, 3, 67};
    int[] c = {7, 64, 9};


    protected int getSqr(int n) {
        int i = 1;
        while (i <= n) {
            res = res + n;
            i++;
        }
        return res;
    }

    protected int getMaxSumArray(int  [] a, int[] b, int[] c) {
        int sumA = 0;
        int sumB = 0;
        int sumC = 0;
        for (int i = 0; i < a.length; i++) {
            sumA = sumA + a[i];
        }
        for (int i = 0; i < b.length; i++) {
            sumB = sumB + b[i];
        }
        for (int i = 0; i < c.length; i++) {
            sumC = sumC + c[i];
        }
        if (sumA > sumB) {
            maxSum = 1;
        } else if (sumB > sumC) {
            maxSum = 2;
        } else maxSum = 3;
        return maxSum;
    }

    protected int[] rotateNumbers(int  [] a) {
        for (int i = 0; i < a.length; i++) {

            a[i] =Integer.parseInt(revStr(Integer.toString(a[i])));

        }
        return a;
    }

    protected String revStr(String str) {
        String result="";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }

}




