package org.multiThreads.explicitLocks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    int balance = 1000;

    public final Lock lock = new ReentrantLock();

    public void withDraw(int amount){

        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try {
                    System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
                    Thread.sleep(3000); // Simulate time taken to process the withdrawal
                    balance -= amount;
                    System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
                } catch (Exception e) {
                    Thread.currentThread().interrupt();
                }finally {
                    lock.unlock();
                }
            }else{
                System.out.println(Thread.currentThread().getName() +" Could not Acquire lock will try again later  ! ");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }



}
