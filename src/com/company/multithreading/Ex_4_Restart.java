package com.company.multithreading;

public class Ex_4_Restart {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " :: in State :: " + Thread.currentThread().getState());

        Thread t = new Thread(() -> {
            final Thread thisThread = Thread.currentThread();
            System.out.println(thisThread.getName() + " :: in State :: " + thisThread.getState());
        });
        t.start();

        Thread.sleep(1000);
        System.out.println(t.getName() + " :: in State :: " + t.getState());
        t.start();


       new Object();
    }
}
