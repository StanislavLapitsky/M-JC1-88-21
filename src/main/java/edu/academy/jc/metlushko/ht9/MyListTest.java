package edu.academy.jc.metlushko.ht9;

public class MyListTest {
    public static void main(String[] args) {
        MyList myList=new MyList(5);
        myList.add(21);
        myList.add(22);
        myList.add(23);
        myList.add(24);
        myList.add(25);
        myList.add(26);
        System.out.println(myList.size());
        System.out.println(myList.getList());

    }
}
