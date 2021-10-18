package edu.academy.jc.bondarenko.cw10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Division {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Division d=new Division();
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(2);
        System.out.println(d.divide(list));
    }
    public Integer divide(List arguments) {
        try {
            int n1 = (int) arguments.get(0);
            int n2 = (int) arguments.get(1);

            return n1/n2;
        }
        catch (IndexOutOfBoundsException iob){
            System.out.println("IndexOutOfBoundsException");
        }
        catch (NullPointerException n){
            System.out.println("NullPointerException");
        }
        catch (ArithmeticException a){
            System.out.println("ArithmeticException");
        }
        catch (ClassCastException e){
            System.out.println("ClassCastException");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
