package edu.academy.jc.gapaniuk.hw8i9;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MyList extends ArrayList<Integer> {
    public int maxElement;
    public MyList(int maxElement){
        this.maxElement =maxElement;
    }

    public void add (int index, int element) throws TooManyElementsException
    {
        if (index<this.maxElement){
            MyList.super.add(index,element);
        }
        else {
            throw new TooManyElementsException("List is filled");
        }



    }




}
