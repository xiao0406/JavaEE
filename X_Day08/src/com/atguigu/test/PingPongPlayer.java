package com.atguigu.test;

public class PingPongPlayer extends Player {
    public PingPongPlayer() {
    }

    public PingPongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("姓名是:"+getName()+",年龄是"+getAge()+"的乒乓球运动员在练习抽球~");
    }

}
