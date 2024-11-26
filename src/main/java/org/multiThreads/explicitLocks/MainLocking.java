package org.multiThreads.explicitLocks;

public class MainLocking {

    public static void main(String[] args) {
        BankAccount kotak = new BankAccount();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                kotak.withDraw(50);
            }

        };

        Thread t1 = new Thread(runnable,"Thread 1");
        Thread t2 = new Thread(runnable,"Thread 2");

        t1.start();
        t2.start();
    }
}
