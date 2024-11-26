package org.multiThreads.synchronization;

public class Counter {

    int count = 0;

 synchronized  void   increment(){
        count++;
    }
    public int getCount() {
        return count;
    }
}
