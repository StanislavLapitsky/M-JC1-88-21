package edu.academy.jc.yarokhovich.hw12_13;
//Tell me please, I'm confused, for some reason writes: "Index 1 out of bounds for length 0". error in SumAccumulator, on line 14
import java.util.List;

public class MyThreadFactory {

    public Thread create(String type, List<Integer> list){
        while (true) {
            synchronized (this) {
                if (type.equals("Generator")) {
                    System.out.println(Thread.currentThread().getName());
                    return new Generator(list);
                } else if (type.equals("SumAccumulator")) {
                    System.out.println(Thread.currentThread().getName());
                    return new SumAccumulator(list);
                } else {
                    throw new RuntimeException("Incorrect name");
                }
            }
        }
    }
}
