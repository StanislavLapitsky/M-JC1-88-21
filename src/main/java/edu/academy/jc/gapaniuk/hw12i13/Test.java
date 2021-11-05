//package edu.academy.jc.gapaniuk.hw12i13;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Test {
//    public static void main(String[] args) {
//
//        List <Integer> listNumber1 = new ArrayList<Integer>();
//        Generator1 gen = new Generator1(listNumber1);
//        gen.start();
//        try {
//            gen.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//
//
//        int sum=0;
//        for (int i=0;i<listNumber1.size();i++){
//
//            sum+=listNumber1.get(i);
//        }
//        SumAccumulator1 sA = new SumAccumulator1(listNumber1);
//        sA.start();
//        try {
//            sA.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        if (sA.sum!=sum){
//            System.out.println("Error SumAccumulator");
//        }
//        else System.out.println("Good job!!");
//
//        MyThreadFactory tf =new MyThreadFactory();
////        try {
////            tf.create("1111");
////        } catch (MyException e) {
////            e.printStackTrace();
////        }
//        try {
//            Generator g = (Generator) tf.create("Generator");
//            SumAccumulator a = (SumAccumulator) tf.create("SumAccumulator");
//
//            a.setSumList(g.getGenList());
//            g.start();
//            a.start();
//
//        } catch (MyException e) {
//            e.printStackTrace();
//        }
//
//
//
//    }
//}
