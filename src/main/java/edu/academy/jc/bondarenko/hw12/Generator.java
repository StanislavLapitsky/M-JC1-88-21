package edu.academy.jc.bondarenko.hw12;

import java.util.List;
import java.util.Random;

public class Generator extends Thread {
    public List<Integer> list;
    private int counter;
    public Generator(List<Integer> list) {
        this.list = list;
    }

    public void run() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            synchronized (list) {
                list.add(random.nextInt(50) - 10);
                counter++;
                System.out.println("counter for generator: "+ counter);
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
