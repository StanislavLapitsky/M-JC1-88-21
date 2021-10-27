package edu.academy.jc.gapaniuk.cw14;

import java.util.Random;

public class RunnableLambda {
    Integer sum;
    public static void main(String[] args)  {
        final RunnableLambda rnl = new RunnableLambda();
        Thread th = new Thread(()-> {
            Random rand = new Random();
           int rez=0;
           for (int i=0;i<9;i++){
               rez+= rand.nextInt(100);
           }
            rnl.sum=rez;

            System.out.println("end");
        });
        th.start();


        System.out.println(rnl.sum);


    }



}
