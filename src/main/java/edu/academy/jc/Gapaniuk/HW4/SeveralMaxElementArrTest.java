package edu.academy.jc.Gapaniuk.HW4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SeveralMaxElementArrTest {
    public static void main(String[] args) {
        SeveralMaxElementArr test = new SeveralMaxElementArr();
        int [] arr =new int[] {1,2,15,48,9,7,35,19};
        int [] arr1 = new int[arr.length];
        arr1= test.setElement(arr,1);
        System.out.println(Arrays.toString(arr1));
        arr1=test.setElement(arr,4);
        System.out.println(Arrays.toString(arr1));
    }
}
