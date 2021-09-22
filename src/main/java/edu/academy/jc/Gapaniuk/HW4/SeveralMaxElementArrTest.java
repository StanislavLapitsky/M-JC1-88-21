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
        if (arr1[0]!=48){
            System.out.println("error for"+1);
        }
        arr1=test.setElement(arr,3);
        System.out.println(Arrays.toString(arr1));
        if ((arr1[0]!=48)||(arr1[1]!=35)||(arr1[2]!=19)){
            System.out.println("error for"+3);        }

    }
}
