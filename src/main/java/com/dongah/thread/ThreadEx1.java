package com.dongah.thread;

public class ThreadEx1 {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("thread => " + thread.getName());

        Thread threadA = new ThreadA();
        System.out.println("현재 스레드는 " + threadA.getName());
        threadA.start();

        Thread threadB = new ThreadB();
        System.out.println("현재 스레드는 " + threadB.getName());
        threadB.start();
    }

    private static class ThreadA extends Thread {
        public ThreadA(){
            setName("ThreadA 스레드");
        }

        @Override
        public void run() {
            for(int i=0;i<10;i++) System.out.println(getName());
        }
    }

    private static class ThreadB extends Thread {
        public ThreadB(){
            setName("ThreadB 스레드");
        }

        @Override
        public void run() {
            for(int i=0;i<10;i++) System.out.println(getName());
        }
    }
}
