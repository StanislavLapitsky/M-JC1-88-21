package edu.academy.jc.gapaniuk.cw16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class Les16task2 {
    public static void main(String[] args) {
        String s = "2022-12-31 23:59:59";
        Date tempDate =null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            tempDate = sdf.parse(s);
            System.out.println(tempDate.toString());
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        LocalDateTime tempDateTime =null;
        try {
            DateTimeFormatter sdf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            tempDateTime = LocalDateTime.parse(s,sdf1);
            System.out.println(tempDateTime.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
