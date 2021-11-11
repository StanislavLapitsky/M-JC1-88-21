package edu.academy.jc.gapaniuk.cw16;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Les16task3 {
    public static void main(String[] args) {
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("messages",new Locale("en"));
            String message = bundle.getString("msg.hello");
            String message1 = MessageFormat.format(message, " 34 ");
            System.out.println(message1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
