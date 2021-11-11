package edu.academy.jc.gapaniuk.hw12i13;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List <Integer> listNumber1 = new ArrayList<Integer>();
        Generator1 gen = new Generator1(listNumber1);
        gen.start();
        try {
            gen.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        int sum=0;
        for (int i=0;i<listNumber1.size();i++){

            sum+=listNumber1.get(i);
        }
        SumAccumulator1 sA = new SumAccumulator1(listNumber1);
        sA.start();
        try {
            sA.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (sA.sum!=sum){
            System.out.println("Error SumAccumulator");
        }
        else System.out.println("Good job!!");

        MyThreadFactory tf =new MyThreadFactory();

        try {
            Generator g1 = (Generator) tf.create("Generator");
            Generator g2 = (Generator) tf.create("Generator");
            Generator g3 = (Generator) tf.create("Generator");
            SumAccumulator a1 = (SumAccumulator) tf.create("SumAccumulator");
            SumAccumulator a2 = (SumAccumulator) tf.create("SumAccumulator");
            g2.setGenList(g1.getGenList());
            g3.setGenList(g1.getGenList());
            a1.setSumList(g1.getGenList());
            a2.setSumList(g1.getGenList());
            g1.setName("g1");
            g2.setName("g2");
            g3.setName("g3");
            a1.setName("a1");
            a2.setName("a2");
            g1.start();
            g2.start();
            g3.start();
            a1.start();
            a2.start();
            while (a1.isAlive()|a2.isAlive()|g1.isAlive()|g2.isAlive()|g3.isAlive()){
                Thread.sleep(10);
            }

            System.out.println("Check:");
            System.out.println(g1.sum+g2.sum+ g3.sum-a1.sum-a2.sum);
        } catch (MyException | InterruptedException e) {
            e.printStackTrace();
        }



    }
}
