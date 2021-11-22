package edu.academy.jc.nesteruk.hw13;

import java.util.List;

public class SumAccumulator extends Thread {
    private List<Integer> integerList;

    public SumAccumulator(List<Integer> integerList) {

        this.integerList = integerList;
    }

    public synchronized void run() {
        int sum = 0;
        for (int i = 0; i < integerList.size(); i++) {
            sum += integerList.get(i);
            integerList.remove(i);
        }
        System.out.println(sum);
    }
}
