package edu.academy.jc.yarokhovich.hw12_13;

import java.util.ArrayList;
import java.util.List;

public class Main extends MyThreadFactory {
    private static volatile List<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
        MyThreadFactory myThreadFactory = new MyThreadFactory();

        Thread generator = myThreadFactory.create("Generator", list);


        Thread sumAccumulator = myThreadFactory.create("SumAccumulator", list);
        generator.start();
        sumAccumulator.start();
    }
}
