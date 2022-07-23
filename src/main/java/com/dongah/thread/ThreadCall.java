package com.dongah.thread;

public class ThreadCall implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(100); // 0.1초간 스레드를 멈춤.

            //feature/B 기능1
            //feature/B 기능2
            //feature/B 기능3
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
