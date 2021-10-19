package edu.academy.jc.gapaniuk.cw12;

public class MyThread extends Thread {

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();

        myThread1.start();
        myThread2.start();
        myThread3.start();
        MyRunneble myRunneble = new MyRunneble();
        Thread mThread = new Thread(myRunneble);
        mThread.start();


    }

    static int globalCounter;
    private int counter;
    static int globalCounterSync;
    public static Integer globalCounterSync1=0;

    public static synchronized void inccc() {
        globalCounterSync++;
    }


    @Override
    public void run() {

        while ((this.counter < 100) && (globalCounter < 100) && (globalCounterSync < 100)) {
            synchronized (MyThread.globalCounterSync1) {
                globalCounterSync1++;
            }

            this.inccc();
            this.counter++;
            globalCounter++;
            System.out.println(this.getName() + "  " + this.counter + "  " + globalCounter+"  "+globalCounterSync);


            try {
                sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.getName() + "  " + this.counter + "  " + globalCounter+"  "+globalCounterSync);


    }


}
