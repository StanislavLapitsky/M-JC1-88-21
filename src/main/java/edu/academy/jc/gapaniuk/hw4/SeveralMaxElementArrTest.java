package edu.academy.jc.gapaniuk.hw4;

import java.util.Arrays;

public class SeveralMaxElementArrTest {
    public static void main(String[] args) {
        SeveralMaxElementArr test = new SeveralMaxElementArr();
        int[] arr = new int[]{1, 2, 2, 2, 4};


        System.out.println(Arrays.toString(test.setElement(arr, 1)));
        if (test.setElement(arr, 1)[0] != 4) {
            System.out.println("error for" + 1);
        }

        System.out.println(Arrays.toString(test.setElement(arr, 3)));
        if ((test.setElement(arr,3)[0] != 4) || (test.setElement(arr,3)[1]!= 2) || (test.setElement(arr,3)[2]!= 2)) {
            System.out.println("error for" + 3);
        }

        System.out.println(Arrays.toString(test.setElement(arr, arr.length)));
        if (arr!=test.setElement(arr, arr.length)){
            System.out.println("error for" + arr.length);

        }


    }
}
