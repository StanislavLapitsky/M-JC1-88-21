package edu.academy.jc.nesteruk.hw13;

import java.util.List;
import java.util.Random;

public class Generator extends Thread {
    private List<Integer> integerList;

    public Generator(List<Integer> integerList) {
        this.integerList = integerList;
    }

    public void run() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            integerList.add(random.nextInt(100));
            try {
                sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
