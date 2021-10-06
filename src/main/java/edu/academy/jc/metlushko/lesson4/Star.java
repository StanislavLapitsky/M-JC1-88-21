package edu.academy.jc.metlushko.lesson4;

public class Star {

    public static void main(String[] args) {
        StarTest.checkStar(getN(new int[]{29,1,29,2,29,98,1,3,45,7,9,12,67,6,4,98},5),new int[]{98,98,67,45,29});
        StarTest.checkStar(getN(new int[]{3,3,3,3,2},5),new int[]{3,3,3,3,2});
    }

    public static int[] getN(int[] arr,int n){
        int [] arrNew=new int[n];
        System.arraycopy(arr,0,arrNew,0,n);
        for (int i = n; i < arr.length; i++) {
            if(arrNew[findMin(arrNew)]<arr[i]){
                arrNew[findMin(arrNew)]=arr[i];
            }
        }
        return arrNew;
    }
    public static int findMin(int[]arr){
        int min=arr[0];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                index=i;
                min=arr[index];
            }
        }
        return index;
    }

}