package edu.academy.jc.gapaniuk.hw4i5;

public class Loops {
    public int getSqr(int n) {
        int sqrN = 0;
        if (n == 0) {
            return 0;
        }

        for (int i = 1; i <= Math.abs(n); i++) {
            sqrN += Math.abs(n);
        }
        return sqrN;

    }

    public int getMaxSumArray(int[] a, int[] b, int[] c) {
        int sum1 = sumArray(a);
        int sum2 = sumArray(b);
        int sum3 = sumArray(c);

        if (sum1 > sum2) {
            if (sum1 > sum3) {
                if (sum1 == sum3) {
                    System.out.println("error of initial data");
                    return 0;
                } else {
                    return 1;
                }
            } else if (sum1 == sum3) {
                System.out.println("error of initial data");
                return 0;
            } else return 3;

        } else if (sum2 > sum3) {
            if (sum2 == sum3) {
                System.out.println("error of initial data");
                return 0;
            } else {
                return 2;
            }
        } else if (sum2 == sum3) {
            System.out.println("error of initial data");
            return 0;
        } else return 3;

    }
    private int sumArray(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
    public int[] rotateNumbers (int[] a){
        int[] b= new int[a.length];

        for (int i=0;i<a.length;i++){
            b[i]=revers(a[i]);
        }
        return b;
    }
    private int revers (int n){
        int rev=0;
        while (n>0) {
            rev = rev*10+n%10;
            n=n/10;

        }
        return rev;
    }
}
