package edu.academy.jc.gapaniuk.cw12;

public class MyRunneble implements Runnable {

    static int globalCounter;
    private int counter;
    static int globalCounterSync;

    public static synchronized void inccc() {
        globalCounterSync++;
    }


    @Override
    public void run() {

        while ((this.counter < 100) && (globalCounter < 100) && (globalCounterSync < 100)) {
            this.inccc();
            this.counter++;
            globalCounter++;
            System.out.println(this.getClass() + "  " + this.counter + "  " + globalCounter+"  "+globalCounterSync);


            try { Thread.sleep(200);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }
}
