package edu.academy.jc.nesteruk.hw13;

public class Main {
    public static void main(String[] args) throws Exception {
        MyThreadFactory myThreadFactory = new MyThreadFactory();
        myThreadFactory.create("Generator").run();
        myThreadFactory.create("SumAccumulator").run();
    }
}
