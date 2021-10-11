package edu.academy.jc.gapaniuk.cw6;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test1 {
    public static void main(String[] args) {
        Test1 T = new Test1();
        Date date = new Date();
        Calendar calen = Calendar.getInstance();



        calen.set(2021,8,1);
        Date date1 = calen.getTime();



        System.out.println(date);
        System.out.println(date1);
        System.out.println(date.getTime()-date1.getTime());

        LocalDateTime today=LocalDateTime.now();
        T.showDateInfo(today);

        if (T.isValidClassName("U#eit") == true) {
            System.out.println("U#eit" + " - 0");
        } ;
        if (T.isValidClassName("U_eit") == false) {
            System.out.println("U_eit" + " - 1");
        } ;
        if (T.isValidClassName("WeG__llo_1") == true) {
            System.out.println("WeG__llo_1" + " - 2");
        }
        if (T.isValidClassName("Uli_OP_1Pi") == true) {
            System.out.println("UlU_OP_1Pi" + " - 3");
        }
        if (T.isValidClassName("P__Yggo_ToY1") == true) {
            System.out.println("P__Yggo_ToY1" + " - 4");
        }
        if (T.isValidClassName("Ue_loi1_kj") == false) {
            System.out.println("Ue_loi1_kj" + " - 5");
        }
        if (T.isValidClassName("PllDo_1oYio_i") == false) {
            System.out.println("PllDo_1oYio_i" + " - 6");
        }
        if (T.isValidClassName("PggoTY1") == true) {
            System.out.println("PggoTY1" + " - 7");
        }
        if (T.isValidClassName("Oello_1oioik_ooo") == false) {
            System.out.println("Oello_1oioik_ooo" + " - 8");
        }
        if (T.isValidClassName("UOPellP_Po_1") == true) {

            System.out.println("UOPellP_Po_1" + " - 9");
        }


    }

    private boolean isValidClassName(String name) {


            return name.matches("^[A-Z]{1}(([a-z0-9]+)|(_{1})|([A-Z]{1}))+");

    }

    public void showDateInfo(LocalDateTime date) {
        LocalDateTime date2 = LocalDateTime.of(2021, 9, 1, 0, 0);
        System.out.println(date);
        System.out.println(date2);
        System.out.println(date.toEpochSecond(ZoneOffset.UTC) - date2.toEpochSecond(ZoneOffset.UTC));
        //   System.out.println(Duration.ofNanos((date.getNano()-date2.getNano())).toMillis());


    }


}
