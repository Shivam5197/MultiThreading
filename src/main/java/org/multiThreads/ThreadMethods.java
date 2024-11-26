package org.multiThreads;

public class ThreadMethods {

    public static void main(String[] args) throws InterruptedException {

        ThreadCreator l = new ThreadCreator("Low Priority Thread");
        ThreadCreator m = new ThreadCreator("Medium Priority Thread");
        ThreadCreator n = new ThreadCreator("High Priority Thread");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        n.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        n.start();

    }

}

class ThreadCreator extends Thread {
    public ThreadCreator(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread is Running...");
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        }
    }
}