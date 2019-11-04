package com.company.multithreading;

//import jdk.management.resource.internal.inst.InitInstrumentation;

public class Ex_2_Java_10_Style {
    public static void main(String[] args) {
/*
        // First way
        var worker = new Worker();
        worker.start();

        // Second way
        var t = new Thread(() -> System.out.println("Anonymous thread is running"));
        t.start();
*/

       new Thread("V.I.P. Thread") {
            public void run() {
                System.out.println("Run by: " + getName());
            }
        }.start();

        System.out.println(Thread.currentThread().getName());



        new Thread(()->{
           Thread.currentThread().setName("Lamda set name");
            System.out.println("Run by:"+ Thread.currentThread().getName());
        }).start();

        System.out.println(Thread.currentThread().getName());


    new Thread(){
        @Override
        public void run() {
            System.out.println("Run by id :"+Thread.currentThread().getId());
        }
    }   .start();


        new Thread(() -> {
            System.out.println("Run by id: " + Thread.currentThread().getId());
        }).start();

        System.out.println(Thread.currentThread().getId());


    }

     Thread thread = new Thread();

}
