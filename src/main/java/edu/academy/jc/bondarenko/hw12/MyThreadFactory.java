package edu.academy.jc.bondarenko.hw12;

import java.util.List;

public class MyThreadFactory {
public List<Integer> list;
    public Thread create(String type, List<Integer> list) {
        synchronized (list) {
            if (type.equals("Generator")) {
                return new Generator(list);
            } else if (type.equals("SumAccumulator")) {
                return new SumAccumulator(list);
            } else {
                throw new RuntimeException("Wrong name");
            }
        }
    }
}
