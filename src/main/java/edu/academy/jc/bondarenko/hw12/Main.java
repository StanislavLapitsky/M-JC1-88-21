package edu.academy.jc.bondarenko.hw12;

import java.util.ArrayList;
import java.util.List;

public class Main extends MyThreadFactory{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        MyThreadFactory myThreadFactory = new MyThreadFactory();
        Thread generate = myThreadFactory.create("Generator", list);
        generate.start();
        Thread sumAcc = myThreadFactory.create("SumAccumulator", list);
        sumAcc.start();

    }
}
