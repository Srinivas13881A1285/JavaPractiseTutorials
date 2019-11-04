package com.company.multithreading;

public class Ex_3_State_Machine {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " :: in State :: " + Thread.currentThread().getState());

        Thread t = new Thread(() -> {
            final Thread thisThread = Thread.currentThread();
            Thread.State state = thisThread.getState();
            System.out.println(thisThread.getName() + " :: in State :: " + state);
        });
        t.start();

    }
}
