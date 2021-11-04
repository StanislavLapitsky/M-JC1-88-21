package edu.academy.jc.yarokhovich.hw8_9;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    private final int maxElements;
    private final List<Integer> list;

    public MyList(int maxElements) {
        this.maxElements = maxElements;
        list = new ArrayList<>(maxElements);
    }

    public void addElem(Integer n) {
        if (list.size() < maxElements) {
            list.add(n);
        }
    }

    @Override
    public String toString() {
        return "MyList{" +
                "maxElements=" + maxElements +
                ", list=" + list +
                '}';
    }
}
