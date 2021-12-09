package com.atguigu.test;


public class PingPongCoach extends Coach {
    public PingPongCoach() {
    }

    public PingPongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teacher() {
        System.out.println("姓名是:"+getName()+",年龄是"+getAge()+"的乒乓球教练在教抽球~");
    }
}
