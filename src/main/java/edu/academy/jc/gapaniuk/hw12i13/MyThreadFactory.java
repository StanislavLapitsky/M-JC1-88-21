package edu.academy.jc.gapaniuk.hw12i13;

import java.util.ArrayList;

public class MyThreadFactory {
    public Thread create(String type) throws MyException {
        if (type.equals("Generator")) {
            return new Generator(new ArrayList<>());
        } else if (type.equals("SumAccumulator")) {
            return new SumAccumulator(new ArrayList<>());
        } else throw new MyException("Not corect Thred Name");
    }

}
