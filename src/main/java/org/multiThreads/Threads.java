package org.multiThreads;

public class Threads {

    public static void main(String[] args) {
        System.out.println(" I am main !");
        world t1 = new world();
        t1.run();
        System.out.println();
    }
}
class world implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getState());
    }

}
