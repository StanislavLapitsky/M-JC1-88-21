package edu.academy.jc.gapaniuk.hw4;

import java.util.Arrays;

public class SeveralMaxElementArrTest {
    public static void main(String[] args) {
        SeveralMaxElementArr test = new SeveralMaxElementArr();
        int[] arr = new int[]{1, 2, 2, 2, 4, 8, 15, 15};


        System.out.println(Arrays.toString(test.setElement(arr, 1)));
        if (test.setElement(arr, 1)[0] != 15) {
            System.out.println("error for" + 1);
        }

        System.out.println(Arrays.toString(test.setElement(arr, 3)));
        if ((test.setElement(arr,3)[0] != 15) || (test.setElement(arr,3)[1]!= 8) || (test.setElement(arr,3)[2]!= 15)) {
            System.out.println("error for" + 3);
        }

        System.out.println(Arrays.toString(test.setElement(arr, arr.length)));
        if (arr!=test.setElement(arr, arr.length)){
            System.out.println("error for " + arr.length);

        }
      //  System.out.println(Arrays.toString(test.setElement(arr, arr.length+1)));
        if (arr!=test.setElement(arr, arr.length+1)){
            System.out.println("error for " + arr.length);

        }


    }
}
