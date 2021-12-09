package com.atguigu.thread;

public class MyTarget implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName()+"打印PHP"+i);
        }
    }
}
