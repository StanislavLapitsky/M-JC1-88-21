package edu.academy.jc.gapaniuk.cw10;

import java.util.ArrayList;
import java.util.List;

public class TestDivion {
    public static void main(String[] args) {
        Division div = new Division();
        List l = new ArrayList();
        l.add(3);
        l.add(null);
        try {

            System.out.println(div.divide(l));
        } catch (NullPointerException e) {
            System.out.println("error NullPointerException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("error IndexOutOfBoundsException");
        } catch (ClassCastException e) {
            System.out.println("error ClassCastException");
        } catch (ArithmeticException e) {
            System.out.println("error ArithmeticException");
        }
    }
}
