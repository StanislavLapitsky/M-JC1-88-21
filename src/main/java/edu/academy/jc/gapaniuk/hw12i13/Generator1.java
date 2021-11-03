package edu.academy.jc.gapaniuk.hw12i13;

import java.util.List;

public class Generator1 extends Thread {

    public List<Integer> getGenList() {
        return genList;
    }

    public void setGenList(List<Integer> genList) {
        this.genList = genList;
    }

    private List<Integer> genList;

    public Generator1(List<Integer> list) {
        this.genList = list;
    }

    @Override
    public void run() {
        int i1;
        for (int i = 0; i < 5; i++) {
            i1 = (int) (Math.random() * 100);
            this.genList.add(i1);


            try {
                sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
