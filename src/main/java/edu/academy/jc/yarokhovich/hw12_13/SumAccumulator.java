package edu.academy.jc.yarokhovich.hw12_13;

import java.util.List;
//Tell me please, I'm confused, for some reason writes: "Index 1 out of bounds for length 0". error in SumAccumulator, on line 14
public class SumAccumulator extends Thread {
    List<Integer> list;
    public Integer sum = 0;

    public SumAccumulator(List<Integer> list) {
        this.list = list;
    }

    public void run() {
        createSum();
    }
    public int createSum(){
        for (int i = 3; i < 100; i++) {
            Integer val = list.get(i);
            list.add(val);
//            Integer integer = list.remove(i);
//            Integer val = list.remove(i);
//            sum += val;
//            System.out.println("Sum " + sum);
//            yield();
        }
        System.out.println("summa " + sum);
        return sum;
    }
}

