package edu.academy.jc.Gapaniuk.HW4;

public class SeveralMaxElementArr {
    public int[] setElement(int arr[], int n) {
        int[] arrMax = new int[n];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int max = min;
        for (int i = 0; i < n; i++) {
            max = min;
            for (int j = 0; j < arr.length; j++) {
                if ((arr[j]>max)&&(check(arrMax,arr[j]))){
                    max=arr[j];
                }


            }
            arrMax[i]=max;
        }
        return arrMax;
    }
    boolean check(int[] a, int m){
        boolean flag = true;
        for (int i1=0;i1<a.length;i1++){
            if (a[i1]==m){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
