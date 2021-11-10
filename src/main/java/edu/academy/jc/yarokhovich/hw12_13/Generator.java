package edu.academy.jc.yarokhovich.hw12_13;


import java.util.List;
import java.util.Random;

public class Generator extends Thread {
    List<Integer> list;

    public Generator(List<Integer> list) {
        this.list = list;
    }

    public void run() {
        createList();
    }

    public void createList() {
        Random rn = new Random();
        for (int i = 0; i < 100; i++) {
            int answer = rn.nextInt(10) + 1;
            synchronized (list) {
                list.add(answer);
                System.out.println("Generator " + answer);
            }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        }System.out.println(list.toString());
    }
}
