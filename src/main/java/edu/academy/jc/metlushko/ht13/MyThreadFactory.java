package edu.academy.jc.metlushko.ht13;

import java.util.concurrent.BlockingQueue;

public class MyThreadFactory {
    private BlockingQueue<Integer> blockingQueue = null;

    public Thread create(String type, BlockingQueue<Integer> blockingQueue) {
        if (type.equals("Generator")) {
            System.out.println(Thread.currentThread().getName());
            return  new Generator(this.blockingQueue = blockingQueue);
        }
        if (type.equals("SumAccumulator")) {
            System.out.println(Thread.currentThread().getName());
            return new SumAccumulator(this.blockingQueue = blockingQueue);
        }
        return null;
    }
}
