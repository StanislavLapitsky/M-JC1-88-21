package edu.academy.jc.gapaniuk.hw4;

public class SeveralMaxElementArr {
    public int[] setElement(int arr[], int n) {
        int[] arrMax = new int[n];
        // сheck inital data
        if (arr.length < n) {
            System.out.println("The original data is not correct.");
            return arrMax;
        }
        // checking a particular case when answer is inital array
        if (arr.length == n) {
            return arr;
        }
        // initial filling of the array with Max Elements

        for (int i = 0; i < n; i++) {
            arrMax[i] = arr[i];
        }
        // solution algorithm
        int minArrMax = minElemet(arrMax);
        for (int i = n; i < arr.length; i++) {
            if ((arr[i] > minArrMax)) { //comparison min of max with current element
                arrMax[minElemetIndex(arrMax)] = arr[i];// changing min of max
                minArrMax = minElemet(arrMax);
            }


        }
        return arrMax;

    }


    public int minElemet(int[] arrMax) {
        //Finding min elenent
        int min = arrMax[0];
        for (int i = 1; i < arrMax.length; i++) {
            if (arrMax[i] < min) {
                min = arrMax[i];

            }

        }
        return min;

    }

    public int minElemetIndex(int[] arrMax) {
        //Finding min elenent index;
        int minInd = 0;
        for (int i = 1; i < arrMax.length; i++) {
            if (arrMax[i] < arrMax[minInd]) {
                minInd = i;

            }


        }
        return minInd;

    }


}
