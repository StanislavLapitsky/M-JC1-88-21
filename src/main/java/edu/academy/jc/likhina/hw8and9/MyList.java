package edu.academy.jc.likhina.hw8and9;

import java.util.*;

public class MyList extends ArrayList{
    private final List<Integer> list;
    private final int maxElements;

    public MyList(int maxElements) {
        this.maxElements = maxElements;
        list = new ArrayList<>(maxElements);
    }
 @Override
    public int size() {
        return list.size();
    }

    public void add(int num) {
        if (list.size() < maxElements) {
            list.add(num);
        }else {
            System.out.println("!!!WARNING!!! Maximum elements in array -"+maxElements+", the remaining elements cannot be added");
        }
    }

}

