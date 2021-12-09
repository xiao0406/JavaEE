package com.atguigu.thread;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread("线程一");
        mt.start();

        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName()+"打印World"+i);
        }
    }
}
