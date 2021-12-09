package com.atguigu.test;


public class BaskerBallPlayer extends Player implements LearnEnglish {
    public BaskerBallPlayer() {
    }

    public BaskerBallPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("姓名是:" + getName() + ",年龄是" + getAge() + "的篮球运动员在练习扣篮~");
    }

    @Override
    public void learnEnglilsh() {
        System.out.println("篮球运动员学习英语");

    }

}
