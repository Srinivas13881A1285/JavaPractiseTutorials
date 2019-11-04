package com.company.multithreading.Chapter_1_ThreadAPI;

public class Part_3_State {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            final Thread thisThread = Thread.currentThread();

            System.out.println("Run by: " + thisThread.getName());
            System.out.println("#1 Is alive " + thisThread.isAlive());
        });

        System.out.println("#2 Is alive " + t.isAlive());
        t.start();
        System.out.println("#3 Is alive " + t.isAlive());

        Thread.sleep(1000);

        System.out.println("#4 Is alive " + t.isAlive());
    }
}
