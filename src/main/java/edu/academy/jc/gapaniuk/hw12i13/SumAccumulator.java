package edu.academy.jc.gapaniuk.hw12i13;

import java.util.List;

public class SumAccumulator extends Thread {
    public List<Integer> getSumList() {
        return sumList;
    }

    public void setSumList(List<Integer> sumList) {
        this.sumList = sumList;
    }

    private List<Integer> sumList;

    public SumAccumulator(List<Integer> list) {
        this.sumList = list;
    }

    public int sum = 0;

    @Override
    public void run() {
        int s1;
        int i = 0;
        synchronized (this.sumList) {
            if (this.sumList.size() == 0) {
                try {
                    this.sumList.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            while ((this.sumList.size() > 0) & (i < 5)) {
                s1 = this.sumList.get(0);
                System.out.println("Acc "+s1);
                this.sumList.remove(0);
                this.sum += s1;
                i++;
                if (this.sumList.size() == 0) {
                    try {
                        this.sumList.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }


            }
        }


    }


}
