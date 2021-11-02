package edu.academy.jc.likhina.hw12and13;

import java.util.concurrent.BlockingQueue;

public class MyThreadFactory {
    private BlockingQueue<Integer> blockingQueue = null;


    public Thread create(String type, BlockingQueue<Integer> blockingQueue) throws Exception {
        if (type.equals("Generator")) {
            return new Generator(this.blockingQueue=blockingQueue);
        }
        if (type.equals("SumAccumulator")) {
            return new SumAccumulator(this.blockingQueue=blockingQueue);
        } else {
            throw new TypeException();
        }

    }


}

