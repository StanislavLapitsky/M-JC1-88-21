package edu.academy.jc.yarokhovich.hw4and5;

public class Loops {
    public int getSqr(int n) {
        int sqr = 0;
        if (n == 0) {
            return 1;
        }
        for (int i = 0; i < n; i++) {
            sqr += n;
        }
        return sqr;
    }

    public int getMaxSumArray(int[] a, int[] b, int[] c) {
        int temp = 0;
        int max = 0;
        int maxA, maxB, maxC = 0;//decided to do with 3 variables
        for (int i = 0; i < a.length; i++) {
            temp += a[i];
        }
        maxA = temp;
        temp = 0;
        for (int i = 0; i < b.length; i++) {
            temp += b[i];
        }
        maxB = temp;
        temp = 0;
        for (int i = 0; i < c.length; i++) {
            temp += c[i];
            if (temp > max) {
                max = temp;
            }
        }
        maxC = temp;
        if (maxA >= maxB && maxA >= maxB) {
            return 1;
        } else if (maxB >= maxA && maxB >= maxC) {
            return 2;
        } else {
            return 3;
        }
    }

    public int[] rotateNumbers(int[] a) {
        int [] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int rst = 0;
            int sign;
            sign = a[i] > 0 ? 1 : -1;
            a[i] *= sign;
            while (a[i] > 0) {
                int lastNum = a[i] % 10;
                rst = rst * 10 + lastNum;
                a[i] = a[i] / 10;
            }
            c[i] = rst * sign;
        }
        return c;
    }
}
