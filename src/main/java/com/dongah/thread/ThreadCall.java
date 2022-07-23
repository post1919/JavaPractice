package com.dongah.thread;

public class ThreadCall implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(100); // 0.1초간 스레드를 멈춤.
            //feature/A 기능1
            //feature/A 기능2
            //feature/A 기능3
            //feature/A 기능4
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void function1(){

    }
}
