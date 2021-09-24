package edu.academy.jc.metlushko.ht4;

public class LoopsTest extends Loops {


    public  void checkGetSqr(int number, int result){
        if(result!=getSqr(number)){
            System.out.println("Not right working!");
        }
        else System.out.println("All right in method getSqr");
    }
    public void checkGetMaxSumArray(int[] first,int[] second,int[] third, int result){


        if( result!=getMaxSumArray(first,second,third)){
            System.out.println("Not right working!");
        }
        else {
            System.out.println("All right in method getMaxSumArray");
        }

    }
    public void checkRotateNumbers(int [] arrays){

        for (int i = 0; i < arrays.length; i++) {

            StringBuilder stringBuilder=new StringBuilder(String.valueOf(arrays[i]));
            int n= Integer.parseInt(""+stringBuilder.reverse());

            if(rotateNumbers(arrays)[i]==n){
                System.out.println(arrays[i]);
            }
            else {
                System.out.println("not working");
                return;
            }
        }
        System.out.println("All right in method rotateNumbers");

    }
}
