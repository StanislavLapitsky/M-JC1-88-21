package edu.academy.jc.yarokhovich.hw12_13;
//Tell me please, I'm confused, for some reason writes: "Index 1 out of bounds for length 0". error in SumAccumulator, on line 14
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main extends MyThreadFactory {
    private static volatile List<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
        MyThreadFactory myThreadFactory = new MyThreadFactory();

        Thread generator = myThreadFactory.create("Generator", Collections.synchronizedList(list));


        Thread sumAccumulator = myThreadFactory.create("SumAccumulator", Collections.synchronizedList(list));
        generator.start();
        sumAccumulator.start();
    }
}
