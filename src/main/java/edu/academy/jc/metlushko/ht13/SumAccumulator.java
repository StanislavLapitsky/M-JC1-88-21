package edu.academy.jc.metlushko.ht13;

import java.util.ArrayList;
import java.util.List;

public class SumAccumulator extends Thread {
    List<Integer> list;

    public SumAccumulator() {
        list = new ArrayList<>();
    }

    @Override
    public void run() {

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            list.add(i * i);
        }
        System.out.println("SumAccumulator " + list);
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println("SumAccumulator Delete " + list.get(i));
            sum += list.get(i);
            list.remove(i);
        }
        System.out.println("SumAccumulator Sum :" + sum);
    }
}
