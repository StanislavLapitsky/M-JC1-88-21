package edu.academy.jc.gapaniuk.cw9;

import java.util.*;

public class FirstList {
    public static void main(String[] args) {


        List<Integer> number = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            number.add(i, random.nextInt(20));

        }
        Iterator<Integer> iter1 = number.iterator();

       while (iter1.hasNext()){
           if (iter1.next()%2==0){
               iter1.remove();
           }
       }

        Set<Integer> sett = new HashSet<>(number);
         for (int i=1;i<20;i+=2){
             if (!sett.contains(i)){
                 System.out.println(i);
             }
         }


    }
}
