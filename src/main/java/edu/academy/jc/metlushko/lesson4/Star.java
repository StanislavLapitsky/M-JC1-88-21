package edu.academy.jc.metlushko.lesson4;

import java.util.*;

public class Star {

    public static void main(String[] args) {
        int []arr=initializationRandomIntArray(25);
//        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(maxNumberInArray(arr,5)));
    }

    public static int[] initializationRandomIntArray (int number){
        Random random=new Random();
        int [] arr=new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(28);
        }
        return arr;
    }
    public static int[] maxNumberInArray(int[] arr,int n){
        int[]arraysInt=new int[n];
        int j=0;
        int max=0;
        while (j<n){
            for (int k : arr) {
                if (max < k && k > arraysInt[j] && find(arraysInt, k)) {
                    max = k;
                    arraysInt[j] = k;
                }
            }
            j++;
            max=0;
        }
        return arraysInt;
    }
    public static boolean find(int [] arr, int n){
        boolean b=true;
        for (int j : arr) {
            if (j == n) {
                return false;
            }
        }
        return b;
    }

}
