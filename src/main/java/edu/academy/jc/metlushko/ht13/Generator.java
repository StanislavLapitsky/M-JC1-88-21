package edu.academy.jc.metlushko.ht13;
import java.util.*;

public class Generator extends Thread{
    List<Integer> list;

    public Generator(){
        list=new ArrayList<>();
    }

    @Override
    public void run(){
        Random random=new Random();
        for (int i = 0; i < 10; i++) {
            list.add(i*i);
            System.out.println("Num is : "+i+"= "+list.get(i));
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
