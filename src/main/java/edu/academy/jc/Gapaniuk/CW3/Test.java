package edu.academy.jc.Gapaniuk.CW3;

import java.nio.charset.StandardCharsets;

public class Test {
    public static void main(String[] args) {

        Test t = new Test();

        String key="mama";
        String s1=t.xorr(key, "mama moet ramy doma");
        System.out.println(s1);
        System.out.println(t.xorr(key, s1));

    }



    private String xorr(String key, String message) {
        byte[] theByteArrayMessage = message.getBytes(StandardCharsets.UTF_8);
        byte[] theByteArrayKey = key.getBytes(StandardCharsets.UTF_8);
        byte[] tempArr = new byte[theByteArrayMessage.length];


        int j = 0;
        for (int i = 0; i < theByteArrayMessage.length; i++) {
            if (j == theByteArrayKey.length) {
                j = 0;
            }
            //tempStr.append(String(theByteArrayKey[j]^theByteArrayMessage[i]));
            tempArr[i] = (byte) (theByteArrayMessage[i] ^ theByteArrayKey[j]);
            j++;
           // System.out.print(tempArr[i] + " ");
        }
        String tempStr = new String(tempArr);
     //   System.out.println();
        return tempStr;
    }

    private void checkValue(Object source) {
        if (source instanceof Number) {
            System.out.println("Number");

        } else if (source instanceof String) {
            System.out.println("String");
        } else {
            System.out.println("I don't konw");
        }
        System.out.println(source.getClass());
    }

    private boolean checkDayAndMonthIsHoliday(int day, int month) {
        int flag = 0;
        if ((12 < month) || (month < 1) || (day < 1) || (day > 31)) {
            System.out.print("Value is not in range");
            flag = 1;
        } else if ((month == 2) && (day > 29)) {
            System.out.print("Value is not real");
            flag = 1;
        } else {
            if ((month == 1) && ((day == 1) || (day == 7))) {
                System.out.print("Holiday");
                flag = 1;
            } else if ((month == 3) && (day == 8)) {
                System.out.print("Holiday");
                flag = 1;
            } else if ((month == 5) && ((day == 1) || (day == 9))) {
                System.out.print("Holiday");
                flag = 1;
            } else if ((month == 7) && (day == 3)) {
                System.out.print("Holiday");
                flag = 1;
            } else if ((month == 11) && (day == 7)) {
                System.out.print("Holiday");
                flag = 1;
            } else if ((month == 12) && (day == 25)) {
                System.out.print("Holiday");
                flag = 1;
            }

        }
        if (flag == 0) {
            System.out.print("not holiday");
        }
        return true;
    }

    private boolean checkDayAndMonthIsHoliday1(int day, int month) {

        if ((12 < month) || (month < 1) || (day < 1) || (day > 31)) {
            System.out.print("Value is not in range");

        } else if ((month == 2) && (day > 29)) {
            System.out.print("Value is not real");

        } else {
            switch (month) {
                case 1:
                    if ((day == 1) || (day == 7)) {
                        System.out.println("Holiday");
                    } else {
                        System.out.println("not holiday");
                    }
                    break;
                case 3:
                    if (day == 8) {
                        System.out.println("Holiday");
                    } else {
                        System.out.println("not holiday");
                    }
                    break;
                case 5:
                    if ((day == 1) || (day == 9)) {
                        System.out.println("Holiday");
                    } else {
                        System.out.println("not holiday");
                    }
                    break;
                case 7:
                    if (day == 3) {
                        System.out.println("Holiday");
                    } else {
                        System.out.println("not holiday");
                    }
                    break;
                case 11:
                    if (day == 7) {
                        System.out.println("Holiday");
                    } else {
                        System.out.println("not holiday");
                    }
                    break;
                case 12:
                    if (day == 25) {
                        System.out.println("Holiday");
                    } else {
                        System.out.println("not holiday");
                    }
                    break;
                default:
                    System.out.println("not holiday");

            }

        }
        return true;
    }
}
