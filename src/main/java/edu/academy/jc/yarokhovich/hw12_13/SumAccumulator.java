package edu.academy.jc.yarokhovich.hw12_13;

import java.util.List;

public class SumAccumulator extends Thread {
    List<Integer> list;
    public Integer sum = 0;
    public int counter = 0;
    public SumAccumulator(List<Integer> list) {
        this.list = list;
    }

    public void run() {
        try {
            createSum();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public int createSum() throws InterruptedException {

                while (counter!=100){
                    if(list.size()!=0) {
                        synchronized (list) {
                            Integer val = list.remove(0);
                            sum += val;
                            System.out.println("Sum " + sum);
                            counter++;
                        }
                    }else {
                        Thread.sleep(200);
                    }
                }
                System.out.println("summa " + sum);
                return sum;
    }
}

