package edu.academy.jc.bondarenko.cw10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DivisionThrows {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DivisionThrows d = new DivisionThrows();
        List<Integer> list = new ArrayList<>();
        list.add(10);
        //list.add(2);
        try {
            System.out.println(d.divide(list));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        } catch (ClassCastException e) {
            System.out.println("ClassCastException");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
    }

    public Integer divide(List arguments) throws IndexOutOfBoundsException, ClassCastException, NullPointerException, ArithmeticException {
        int n1 = (int) arguments.get(0);
        int n2 = (int) arguments.get(1);

        return n1 / n2;
    }
}
