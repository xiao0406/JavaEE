package com.atguigu.test;


public class BaskerBallCoach extends Coach implements LearnEnglish {
    public BaskerBallCoach() {
    }

    public BaskerBallCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teacher() {
        System.out.println("姓名是:"+getName()+",年龄是"+getAge()+"的篮球教练在教扣篮~");
    }

    @Override
    public void learnEnglilsh() {
        System.out.println("篮球教练学习英语");
    }
}
