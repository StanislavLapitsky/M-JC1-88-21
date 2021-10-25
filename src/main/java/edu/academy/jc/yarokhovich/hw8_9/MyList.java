package edu.academy.jc.yarokhovich.hw8_9;

import java.util.ArrayList;
import java.util.List;

public class MyList<Integer> {//list
    private int maxElements;
    private List<Integer> list = new ArrayList<>();

    public MyList(int maxElements) {
        this.maxElements = maxElements;
    }

    public boolean addElem(Integer n) {
        if (list.size() < maxElements) {
            list.add(n);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "maxElements=" + maxElements +
                ", list=" + list +
                '}';
    }
}
