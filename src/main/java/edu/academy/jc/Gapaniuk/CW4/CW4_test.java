package edu.academy.jc.Gapaniuk.CW4;

public class CW4_test {
    public static void main(String[] args) {
       CW4_Gapaniuk cW = new CW4_Gapaniuk();
     if (cW.getSum(3)!=6){
         System.out.println("error 3");
     }
     else System.out.println("+");
        if (cW.getSum(14)!=91){
            System.out.println("error 3");
        }
        else System.out.println("+");

        if (cW.getSum(-4)!=-10){
            System.out.println("error -10");
        }
        else System.out.println("+");


    }


}
