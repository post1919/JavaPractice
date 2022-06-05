package com.dongah.thread;

public class ThreadMain {
    public static void main(String[] args) {
        Thread thread0 = new Thread(new ThreadCall());
        thread0.start();
        System.out.println(thread0.getThreadGroup());

        ThreadGroup group = new ThreadGroup("myThread");
        group.setMaxPriority(7);

        Thread thread1 = new Thread(group, new ThreadCall());
        thread1.start();
        System.out.println(thread1.getThreadGroup());
    }
}
