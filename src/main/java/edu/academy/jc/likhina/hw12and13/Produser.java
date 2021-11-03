package edu.academy.jc.likhina.hw12and13;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Produser extends MyThreadFactory{

    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
        Thread generate = new Thread(new Generator(blockingQueue));
        Thread sumAccumulator = new Thread(new SumAccumulator(blockingQueue));

        generate.start();
        sumAccumulator.start();
    }
}
