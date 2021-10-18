package edu.academy.jc.bondarenko.hw8;

import java.util.*;

public class MyList {
    public MyList(int maxElements) throws CatchLenghtEx {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        while (maxElements != 0) {
            list.add(random.nextInt(10) - 3);
            maxElements--;
        }
        list.add(1);
        list.add(7);
        if (list.size() > maxElements)
            throw new CatchLenghtEx();

        System.out.println("List size: " + list.size());

        System.out.println("Your collection ");
        Iterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
    }
}
