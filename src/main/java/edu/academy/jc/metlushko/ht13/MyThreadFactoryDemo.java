package edu.academy.jc.metlushko.ht13;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MyThreadFactoryDemo extends MyThreadFactory{
    public static void main(String[] args)  {
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
        MyThreadFactory myThreadFactory=new MyThreadFactory();

        Thread generator=myThreadFactory.create("Generator",blockingQueue);
        Thread sumAccumulator=myThreadFactory.create("SumAccumulator",blockingQueue);

        generator.start();
        sumAccumulator.start();
    }
}
