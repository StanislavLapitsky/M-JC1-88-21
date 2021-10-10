package edu.academy.jc.gapaniuk.hw8i9;

import java.awt.*;

public class TestForMyList  {
    public static void main(String[] args) {
        MyList I =new MyList(5);
        I.add(0,1);
        I.add(1,2);
        I.add(2,3);
        I.add(3,4);
        I.add(4,5);
        I.add(5,6);
        System.out.println(I.size());

    }

}
