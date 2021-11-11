package edu.academy.jc.bondarenko.hw12;

import java.util.List;

public class SumAccumulator extends Thread {
    public List<Integer> list;
    private int counter;
    private int temp;
    private int sum;

    public SumAccumulator(List<Integer> list) {
        this.list = list;
    }

    public void run() {
        while (counter < 100) {
            synchronized (list) {
                if (list.size() != 0) {
                    temp = list.get(0);
                    list.remove(0);
                    sum += temp;
                    System.out.println("Sum is: " + sum);
                    counter++;
                    System.out.println("counter for accumulator " + counter);
                } else {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
