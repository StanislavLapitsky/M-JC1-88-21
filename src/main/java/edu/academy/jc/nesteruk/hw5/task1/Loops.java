package edu.academy.jc.nesteruk.hw5.task1;

public class Loops {

    protected int getSqr(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += n;
        }
        return result;
    } // Task 1

    protected int getMaxSumArray(int[] a, int[] b, int[] c) {
        int sumA = 0;
        int sumB = 0;
        int sumC = 0;

        for (int i = 0; i < a.length; i++) {
            sumA += a[i];
        }
        for (int i = 0; i < b.length; i++) {
            sumB += b[i];
        }
        for (int i = 0; i < c.length; i++) {
            sumC += c[i];
        }

        if (sumA > sumB) {
            if (sumA > sumC) {
                return 1;
            } else {
                return 3;
            }
        } else {
            if (sumB > sumC) {
                return 2;
            } else {
                return 3;
            }
        }
    } // Task 2

    protected int[] rotateNumbers(int[] d) {
        int[] revArr = new int[d.length];

        for (int i = 0; i < d.length; i++) {
            while (d[i] != 0) {
                revArr[i] = revArr[i] * 10 + d[i] % 10;
                d[i] /= 10;
            }
        }
        return revArr;
    } // Task 3
}
