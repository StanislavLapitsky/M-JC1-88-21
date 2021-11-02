package edu.academy.jc.metlushko.ht13;

import java.util.concurrent.BlockingQueue;

public class SumAccumulator extends Thread {
    private final BlockingQueue<Integer> blockingQueue;
    private int sum = 0;
    private int i = 0;

    public SumAccumulator(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (i != 99) {
            try {
                int a = blockingQueue.take();
                System.out.println("SumAccumulator read and remove." + a);
                sum += a;
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            i++;
            System.out.println("Sum " + sum);
        }
    }
}
