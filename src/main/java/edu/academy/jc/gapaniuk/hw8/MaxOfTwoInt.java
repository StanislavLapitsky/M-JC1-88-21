package edu.academy.jc.gapaniuk.hw8;

public class MaxOfTwoInt {
    public int a;
    public int b;

    public static void main(String[] args) {
        MaxOfTwoInt maxOfTwoInt = new MaxOfTwoInt();
        maxOfTwoInt.a = 2;
        maxOfTwoInt.b = 3;
        int a = 0;
        int b = -2;
        if (a == b) {
            System.out.println("numbers are equal");
        } else {
            System.out.println("Max = " + maxOfTwoInt.Max(a, b));
        }
    }

    byte sign(int a) {
        switch (Math.abs(a + 2) / (Math.abs(a) + 1)) {
            case 1: {
                return 1;
            }
            case 0: {
                return -1;
            }
            default: {
                return 0;
            }

        }
    }

    public int Max(int a, int b) {
        if (sign(a - b) == 1) {
                return a;
            } else return b;


    }
}
