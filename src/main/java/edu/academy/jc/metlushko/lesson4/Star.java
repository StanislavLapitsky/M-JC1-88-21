package edu.academy.jc.metlushko.lesson4;

import java.util.*;

public class Star {

    public static void main(String[] args) {
        int []arr=initializationRandomIntArray(29);
        System.out.println(Arrays.toString(maxNumberInArray(arr,8)));
    }

    public static int[] initializationRandomIntArray (int number){
        Random random=new Random();
        int [] arr=new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(28);
        }
        return arr;
    }

    public static int[] maxNumberInArray(int [] arr,int n){
        int j=0;
        Arrays.sort(arr);
        int[]arraysInt=new int[n];
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length-1; i > 0; i--) {
            if(arr[i]!=arr[i-1]){
                arraysInt[j]=arr[i];
                j++;
            }
            if (j>=n){
                break;
            }
        }
        return arraysInt;
    }
}