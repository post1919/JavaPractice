package com.dongah.thread;

public class ThreadCall implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(100); // 0.1초간 스레드를 멈춤.
            //기능1
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
