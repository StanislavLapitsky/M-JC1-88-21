package edu.academy.jc.gapaniuk.cw8;

public class CallOld {
    public static void main(String[] args) {
        CallOld cl=new CallOld();
        cl.call();
    }
    @SuppressWarnings("deprecation")
    public void call(){
        TestAnnotation T = new TestAnnotation();

        System.out.println(T.old());
    }
}
