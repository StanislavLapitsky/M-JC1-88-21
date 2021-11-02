package edu.academy.jc.likhina.hw12and13;


import java.util.concurrent.BlockingQueue;

public class SumAccumulator extends Thread {

    private final BlockingQueue<Integer> blockingQueue;
    private int count = 0;
    private int sum = 0;

    public SumAccumulator(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (count < 100) {
            try {
                int readAndremove = blockingQueue.take();
                System.out.println("Read and remove : " + readAndremove);
                sum = sum + readAndremove;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
            System.out.println("Sum = " + sum);
        }
    }
}
