package edu.academy.jc.yarokhovich.hw12_13;
//Tell me please, I'm confused, for some reason writes: "Index 1 out of bounds for length 0". error in SumAccumulator, on line 14
import java.util.List;
import java.util.Random;

public class Generator extends Thread {
    List<Integer> list;

    public Generator(List<Integer> list) {
        this.list = list;
    }

    public void run() {
        createList();
    }
    public void createList(){
        Random rn = new Random();
        for (int i = 0; i < 100; i++) {
            int answer = rn.nextInt(10) + 1;
            list.add(answer);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread.yield();
        }
        System.out.println(list.toString());
    }
}
