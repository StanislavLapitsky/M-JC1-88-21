package edu.academy.jc.bondarenko.hw8;

import java.util.ArrayList;
import java.util.List;

public class MyListTest {
    public static void main(String[] args) {
        try {
            List<Integer> list=new ArrayList<>();
            MyList l = new MyList(2);
            list.add(1);
            list.add(2);
        } catch (CatchLenghtEx e) {
            System.out.println("The length is over!");
        }
    }

}
