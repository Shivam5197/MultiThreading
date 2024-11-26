package org.multiThreads.synchronization;

public class mainClassForSynchronization {
    public static void main(String[] args) {

        Counter counter = new Counter();
        ThreadClassForSynchronization t1 = new ThreadClassForSynchronization(counter);
        ThreadClassForSynchronization t2 = new ThreadClassForSynchronization(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (Exception e){

        }
        System.out.println(counter.getCount()); // Expected: 2000, Actual will be random <= 2000

    }
}
