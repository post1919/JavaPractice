package com.dongah.practice2021.dec;

public class MyMain {
    public static void main(String[] args) {
        Thread th1 = new MyThread();
        th1.setName("쓰레드1");

        Thread th2 = new MyThread();
        th2.setName("쓰레드2");

        Runnable run3 = new MyRunnable();
        Thread th3 = new Thread(run3);
        th3.setName("쓰레드3");

        Runnable run4 = new MyRunnable();
        Thread th4 = new Thread(run4);
        th4.setName("쓰레드4");

        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }
}
