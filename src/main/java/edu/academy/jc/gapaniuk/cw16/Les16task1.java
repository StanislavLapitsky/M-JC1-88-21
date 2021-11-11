package edu.academy.jc.gapaniuk.cw16;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Les16task1 {
    public static void main(String[] args) {

        Locale[] numberFormatLocales = NumberFormat.getAvailableLocales();
        Locale[] dateFormatLocales = DateFormat.getAvailableLocales();
        Date date = new Date();
        DateFormat dF1 = DateFormat.getDateInstance(DateFormat.FULL, dateFormatLocales[12]);
        System.out.println(dateFormatLocales[12].getCountry());
        System.out.println(dF1.format(date));
        DateFormat dF2 = DateFormat.getDateInstance(DateFormat.SHORT, dateFormatLocales[12]);
        System.out.println(dF2.format(date));
        DateFormat dF3 = DateFormat.getDateInstance(DateFormat.DEFAULT, dateFormatLocales[12]);
        System.out.println(dF3.format(date));
         int a=100;
        DateFormat dF12 = DateFormat.getDateInstance(DateFormat.FULL, dateFormatLocales[a]);
        System.out.println(dateFormatLocales[a].getCountry());
        System.out.println(dF12.format(date));
        DateFormat dF22 = DateFormat.getDateInstance(DateFormat.SHORT, dateFormatLocales[a]);
        System.out.println(dF22.format(date));
        DateFormat dF23 = DateFormat.getDateInstance(DateFormat.DEFAULT, dateFormatLocales[a]);
        System.out.println(dF23.format(date));

        double b = 1234567.89;

        NumberFormat nF1 = NumberFormat.getNumberInstance(numberFormatLocales[a]);
        System.out.println(nF1.format(b));
        NumberFormat nF2 = NumberFormat.getNumberInstance(numberFormatLocales[12]);
        System.out.println(nF2.format(b));


    }
}
