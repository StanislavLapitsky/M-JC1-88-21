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
        int i = 1;
        synchronized (this.sumList) {
            if (this.sumList.size() == 0) {
                try {
                    this.sumList.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            this.sumList.notify();
        }


        while (i <= 30) {
            try {
                sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (this.sumList) {
                if ((this.sumList.size() == 0) & (i <= 30)) {
                    try {
                        this.sumList.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {


                    s1 = this.sumList.get(0);
                    System.out.println(("Acc " + this.getName() + "  " + s1 + "  sum " + i + " = " + this.sum));
                    this.sumList.remove(0);
                    this.sum += s1;
                    i++;
                }
                this.sumList.notify();


            }


        }


    }


}
