package edu.academy.jc.gapaniuk.hw12i13;

import java.util.List;

public class Generator extends Thread {

    public List<Integer> getGenList() {
        return genList;
    }

    public void setGenList(List<Integer> genList) {
        this.genList = genList;
    }

    private List<Integer> genList;

    public Generator(List<Integer> list) {
        this.genList = list;
    }

    @Override
    public void run() {
        int i1;
        for (int i = 0; i < 5; i++) {
            synchronized (this.genList) {

                i1 = (int) (Math.random() * 100);
                System.out.println("Gen " + i1);
                this.genList.add(i1);
                this.genList.notify();
            }
                try {
                    sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }



        }
        synchronized (this.genList) {
            this.genList.notify();
        }
    }
}
