package edu.academy.jc.metlushko.lesson9;

import java.util.*;

public class ListAny {
    public static void main(String[] args) {
        Random random=new Random();
        List<Integer>list=new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            list.add(random.nextInt(20));
        }
        System.out.println(list+" size:"+list.size());


        for (int i = list.size()-1; i >0 ; i--) {
            if(list.get(i)%2==0){
                list.remove(i);
            }
        }
        System.out.println(list+" size:"+list.size());

        Set<Integer> hashSet=new HashSet<>(list);

        System.out.println(hashSet+" size:"+hashSet.size());





    }
}
