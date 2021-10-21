package edu.academy.jc.bondarenko.hw8;

public class MyListTest {
    public static void main(String[] args) {
        try {
            MyList l = new MyList(2);
            l.add(1);
            l.add(2);
            l.add(7);
            l.print();
        } catch (CatchLenghtEx e) {
            System.out.println("The length is over!");
        }
    }
}
