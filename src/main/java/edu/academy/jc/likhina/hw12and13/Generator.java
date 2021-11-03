package edu.academy.jc.likhina.hw12and13;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;


public class Generator extends Thread {

    private final BlockingQueue<Integer> blockingQueue;

    public Generator(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("Generator add : " + i);
                blockingQueue.put((int) (Math.random() * 100 + 1));
                sleep(200L);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
