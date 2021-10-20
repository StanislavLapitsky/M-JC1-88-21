package edu.academy.jc.likhina.hw8and9;

public class TestMyList {
    public static void main(String[] args) {
       MyList l = new MyList(1);
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l.size());

        MyList l2 =new MyList(5);
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(1);
        l2.add(2);
        System.out.println(l2.size());

        MyList l3 = new MyList(4);
        l3.add(1);
        l3.add(2);
        l3.add(3);
        l3.add(1);
        l3.add(2);
        System.out.println(l3.size());

    }
}
