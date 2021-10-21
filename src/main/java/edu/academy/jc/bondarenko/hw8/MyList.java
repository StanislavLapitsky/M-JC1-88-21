package edu.academy.jc.bondarenko.hw8;

import java.util.*;

public class MyList extends ArrayList {
    private List<Integer> list;
    private int maxElements;

    public MyList(int maxElements) {
        this.maxElements = maxElements;
        list = new ArrayList<>();
    }

    public void add(int num) throws CatchLenghtEx {

        if (list.size() < maxElements)
            list.add(num);
        else throw new CatchLenghtEx();
    }

    public void print() {
        System.out.println("Your collection: ");
        Iterator<Integer> integerIterator = list.iterator();
        while (integerIterator.hasNext())
            System.out.println(integerIterator.next() + " ");
    }
}
