package edu.academy.jc.likhina.classwork4;

import java.util.Random;

public class ClassWork4 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
            System.out.println(arr[i]);
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }

        }
        System.out.println("max- " + max);
        System.out.println("min- " + min);

        String[] str = new String[10];
        for (int i = 0; i < arr.length; i++) {
            str[i] = Integer.toString(new Random().nextInt(10000));
            System.out.println(str[i]);
        }


        int maxLengthStr = str[0].length();
        String maxEl = str[0];
        String minEl = str[0];
        int minLengthStr = str[0].length();
        for (int i = 1; i < str.length; i++) {
            if (maxLengthStr < str[i].length()) {
                maxLengthStr = str[i].length();
                maxEl = str[i];
            }
            if (minLengthStr > str[i].length()) {
                minLengthStr = str[i].length();
                minEl = str[i];
            }

        }
        System.out.println("maxLength :" + maxLengthStr + " element: " + maxEl);
        System.out.println("minLength :" + minLengthStr + " element: " + minEl);

        char[] maxCharArr = maxEl.toCharArray();
        for (int i = 0; i < maxCharArr.length; i++) {
            System.out.print(maxCharArr[i]);
        }
        System.out.println("");
        char[] minCharArr = minEl.toCharArray();
        for (int i = 0; i < minCharArr.length; i++) {
            System.out.print(minCharArr[i]);
        }

        System.out.println(" ");
        int[][] twoArr = new int[10][2];
        for (int i = 0; i < twoArr.length; i++) {
            for (int k = 0; k < twoArr[i].length; k++) {
                twoArr[i][k] = new Random().nextInt(2);
            }


        }
        for (int s = 0; s < twoArr.length; s++) {
            for (int j = 0; j < twoArr[s].length; j++) {
                System.out.print(twoArr[s][j] + "\t");
            }
            System.out.println();
        }
        int sumEl = 0;
        for (int i = 0; i < twoArr.length; i++) {
            for (int j = 0; j < twoArr[i].length; j++) {
                sumEl += twoArr[i][j];
            }

        }
        System.out.println("Sum element to array: " + sumEl);
    }
}
