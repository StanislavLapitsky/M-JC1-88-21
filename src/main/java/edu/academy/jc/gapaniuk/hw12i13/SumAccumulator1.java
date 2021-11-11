package edu.academy.jc.gapaniuk.hw12i13;

import java.util.List;

public class SumAccumulator1 extends Thread {
    public List<Integer> getSumList() {
        return sumList;
    }

    public void setSumList(List<Integer> sumList) {
        this.sumList = sumList;
    }

    private List<Integer> sumList;

    public SumAccumulator1(List<Integer> list) {
        this.sumList = list;
    }

    public int sum = 0;

    @Override
    public void run() {
        int s1;
        boolean f = true;
        int i = 0;
        while ((this.sumList.size() > 0) & (i < 5)) {
            s1 = this.sumList.get(0);

            this.sumList.remove(0);
            this.sum += s1;
            i++;


        }


    }


}
