package edu.academy.jc.gapaniuk.hw8i9;

import java.util.ArrayList;

public class MyList extends ArrayList<Integer> {
    public int maxElement;

    public MyList(int maxElement) {
        this.maxElement = maxElement;
    }

    @Override
    public void add(int index, Integer element) {

        if (this.size() < this.maxElement) {
            super.add(index, element);
        } else {
            throw new TooManyElementsException("List is filled");
        }


    }


    @Override
    public boolean add(Integer element) {
        this.add(this.size(), element);

        return true;

    }


}
