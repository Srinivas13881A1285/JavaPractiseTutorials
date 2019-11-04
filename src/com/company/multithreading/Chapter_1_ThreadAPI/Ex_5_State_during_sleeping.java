package com.company.multithreading.Chapter_1_ThreadAPI;

import java.util.concurrent.locks.ReentrantLock;

public class Ex_5_State_during_sleeping {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " :: in State :: " + Thread.currentThread().getState());

        Thread t = new Thread(() -> {
            final Thread thisThread = Thread.currentThread();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(t.getName() + " :: in State :: " + t.getState());
        t.start();
        System.out.println(t.getName() + " :: in State :: " + t.getState());
        Thread.sleep(1000);
        System.out.println(t.getName() + " :: in State :: " + t.getState());
        Thread.sleep(2000);
        System.out.println(t.getName() + " :: in State :: " + t.getState());

        ReentrantLock reentrantLock = new ReentrantLock();
        int holdCount = reentrantLock.getHoldCount();
        System.out.println("holdCount = " + holdCount);

    }
}
