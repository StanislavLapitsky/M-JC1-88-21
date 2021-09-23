package edu.academy.jc.metlushko.Lessons4;

public class Sum {
    public static void main(String[] args) {
        SumTests.methodSumTest();
    }
    public static int getSum(int i){
        int sum=0;
        for (int j = 0; j <= i; j++) {
            sum+=j;
            if(sum>100){
                return sum-j;
            }
        }
        return sum;
    }
}

