package edu.academy.jc.metlushko.ht13;

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
                System.out.println("Generator added to queue " + i);
                blockingQueue.put(i);
                Thread.sleep(200L);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
