package com.atguigu.thread;

public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt,"线程一");
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println(Thread.currentThread().getName()+"打印PHP"+i);
                }
            }
        });
        t1.setName("匿名内部类的线程对象");
        t1.start();
        for (int i = 0; i < 10000; i++) {
            System.out.println("Java" + i);
        }
    }
}
