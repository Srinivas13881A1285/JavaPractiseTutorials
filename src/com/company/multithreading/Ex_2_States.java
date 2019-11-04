package com.company.multithreading;

public class Ex_2_States {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " :: in State :: " + Thread.currentThread().getState());

        Thread t = new Thread(() -> {
            final Thread thisThread = Thread.currentThread();
            System.out.println(thisThread.getName() + " :: in State :: " + thisThread.getState());
        });

        Thread.State state = t.getState();
        System.out.println(t.getName() + " :: in State :: " + state);
        t.start();
        System.out.println(t.getName() + " :: in State :: " + t.getState());

        Thread.sleep(10);

        System.out.println(t.getName() + " :: in State :: " + t.getState());


    }
}
