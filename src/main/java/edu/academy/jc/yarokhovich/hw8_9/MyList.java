package edu.academy.jc.yarokhovich.hw8_9;

import java.util.ArrayList;

public class MyList extends ArrayList<Integer>{
    private final int maxElements;


    public MyList(int maxElements) {
        super(maxElements);
        this.maxElements = maxElements;
    }

    public boolean add(Integer n) {
        if (super.size() < maxElements) {
            return super.add(n);
        }
        return false;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "maxElements=" + maxElements +
                ", list=" + super.toString() +
                '}';
    }
}
