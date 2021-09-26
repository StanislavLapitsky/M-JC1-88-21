package edu.academy.jc.metlushko.lesson4;

import java.util.Arrays;
import java.util.Random;

public class Star {

    public static void main(String[] args) {
        int []arr=initializationRandomIntArray(20);
        System.out.println(Arrays.toString(maxNumberInArray(arr,5)));
    }

    public static int[] initializationRandomIntArray (int number){
        Random random=new Random();
        int [] arr=new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(25);
        }
        return arr;
    }

    public static int[] maxNumberInArray(int [] arr,int n){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]){
                arr[i+1]=0;
            }
        }
        Arrays.sort(arr);
        int[]arraysInt=new int[n];
        for (int j = arr.length-1, i=0; j >((arr.length-1)-n);i++, j--) {
            arraysInt[i]=arr[j];
        }
        return arraysInt;
    }
}

