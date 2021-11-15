package edu.academy.jc.nesteruk.hw13;

import java.util.ArrayList;
import java.util.List;

public class MyThreadFactory {
    List<Integer> integerList = new ArrayList<>();

    public Thread create(String type) throws Exception {

        return switch (type) {
            case "Generator" ->  new Generator(integerList);
            case "SumAccumulator" -> new SumAccumulator(integerList);
            default -> throw new Exception();
        } ;
    }
}
