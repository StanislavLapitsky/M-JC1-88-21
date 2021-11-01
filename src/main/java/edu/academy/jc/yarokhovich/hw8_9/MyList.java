package edu.academy.jc.yarokhovich.hw8_9;

import java.util.ArrayList;
import java.util.List;

public class MyList extends ArrayList {
    private final int maxElements;
    private final List<Integer> list;

    public MyList(int maxElements) {
        this.maxElements = maxElements;
        this.list = new ArrayList<>();
    }

    public boolean addElem(Integer n) {
        if (list.size() < maxElements) {
            return  list.add(n);
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
