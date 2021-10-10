package edu.academy.jc.metlushko.ht9;

import java.util.*;

public class MyList {
    private final List<Integer> list;
    private final int capacity;

    public MyList(int capacity) {
        this.capacity = capacity;
        list = new ArrayList<>(capacity);
    }

    public List getList() {
        return list;
    }

    public int size() {
        return list.size();
    }

    public void add(int n) {
        if (list.size() < capacity) {
            list.add(n);
        }
    }

}
