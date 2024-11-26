package org.multiThreads.synchronization;

public class ThreadClassForSynchronization extends Thread {
    private Counter counter;

    public ThreadClassForSynchronization(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }

}