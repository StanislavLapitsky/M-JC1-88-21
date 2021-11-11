package edu.academy.jc.gapaniuk.hw8i9;

public class TestForMyList {
    public static void main(String[] args) {
        MyList mL = new MyList(5);

        try {
            for (int i = 0; i < 10; i++) {
                mL.add(i);
            }
        } catch (TooManyElementsException a) {
            System.out.println(a.getMessage());
        }
        try {
            mL.add(0, 1);
        } catch (TooManyElementsException a) {
            System.out.println(a.getMessage());
        }
        try {
            mL.add(1, 2);
        } catch (TooManyElementsException a) {
            System.out.println(a.getMessage());
        }
        try {
            mL.add(2, 6);
        } catch (TooManyElementsException a) {
            System.out.println(a.getMessage());
        }
        try {
            mL.add(3, 6);
        } catch (TooManyElementsException a) {
            System.out.println(a.getMessage());
        }
        try {
            mL.add(4, 6);
        } catch (TooManyElementsException a) {
            System.out.println(a.getMessage());
        }
        try {
            mL.add(5, 6);
        } catch (TooManyElementsException a) {
            System.out.println(a.getMessage());
        }
        try {
            mL.add(6, 6);
        } catch (TooManyElementsException a) {
            System.out.println(a.getMessage());
        }

        System.out.println(mL.size());

    }

}
