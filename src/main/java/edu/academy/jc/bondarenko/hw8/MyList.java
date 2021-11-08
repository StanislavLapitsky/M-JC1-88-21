package edu.academy.jc.bondarenko.hw8;

import java.util.*;

public class MyList extends ArrayList<Integer> {
    private int maxElements;

    public MyList(int maxElements) {
        super(maxElements);
        this.maxElements = maxElements;
    }
    @Override
    public boolean add(Integer num) {
        if(super.size()<maxElements) {
            return super.add(num);
        }
        else return false;
    }
    public void print() {
        System.out.println("Your collection: ");
        Iterator<Integer> integerIterator = super.iterator();
        while (integerIterator.hasNext())
            System.out.print(integerIterator.next() + " ");
    }
}
