package edu.academy.jc.metlushko.ht13;

public class MyThreadFactory {
    private Generator generator=null;
    private SumAccumulator sumAccumulator=null;

    public final String GENERATOR="Generator";
    public final String SUMACCUMULATOR="SumAccumulator";

    public Thread create(String type) throws Exception {
        if(type.equals("Generator")){
            System.out.println(Thread.currentThread().getName());
            return generator=new Generator();
        }
        if(type.equals("SumAccumulator")){
            System.out.println(Thread.currentThread().getName());
            return sumAccumulator=new SumAccumulator();
        }
        else {
            throw new MyException();
        }

    }
}
