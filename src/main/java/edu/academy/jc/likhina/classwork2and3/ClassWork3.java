package edu.academy.jc.likhina.classwork2and3;

public class ClassWork3 {
    public static void main(String[] args) {

        ClassWork3.check(-1, -2, -3);
        ClassWork3.checkDayAndMonthIsHoliday(29, 2);
        ClassWork3.checkValue(0.2545);
    }

    private static void check(int x, int y, int z) {

        if (x > 0 && y > 0 && z > 0) {
            System.out.println("Excellent!");
        } else if ((x > 0 && y > 0) || (y > 0 && z > 0) || (x > 0 && z > 0)) {
            System.out.println("Good!");
        } else if ((x > 0 && y < 0 && z < 0) || (x < 0 && y > 0 && z < 0) || (x < 0 && y < 0 && z > 0)) {
            System.out.println("Fine!");
        } else {
            System.out.println("Bad!");
        }
    }

    private static boolean checkDayAndMonthIsHoliday(int day, int month) {
        int flag = 0;
        if ((1 > month && month > 12) && ((day < 1 && day > 31))) {
            System.out.println("Value is not variable");
            flag = 1;
        } else if ((day > 29 && month == 2)) {
            System.out.println("Value is  not variable");
            flag = 1;
        } else {
            if ((day == 1 || day == 7) && month == 1) {
                System.out.println("Holiday");
                flag = 1;
            } else if (day == 8 && month == 3) {
                System.out.println("Holiday!");
                flag = 1;
            } else if ((day == 1 || day == 9) && month == 5) {
                System.out.println("Holiday");
                flag = 1;
            } else if (day == 3 && month == 7) {
                System.out.println("Holiday");
                flag = 1;
            } else if (day == 7 && month == 11) {
                System.out.println("Holiday");
                flag = 1;
            } else if (day == 25 && month == 12) {
                System.out.println("Holiday");
                flag = 1;
            } else if (flag == 0) {
                System.out.println("Not holiday");
            }
        }
        return true;
    }

    private static void checkValue(Object source) {
        if (source instanceof Integer) {
            System.out.println("Number");
        } else if (source instanceof String) {
            System.out.println("String");
        } else {
            System.out.println("I don't know!");
        }
        System.out.println(source.getClass());
    }

}


