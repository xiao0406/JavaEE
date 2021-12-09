package com.practice.day10;
/*
2、在com.atguigu.test15包中声明测试类Test15
​	（1）public static void meeting(Person...  ps)
​		在该方法中，每一个人先吃饭，然后上洗手间，然后如果是男人，随后抽根烟，如果是女人，随后化个妆
​	public static void main(String[] args)
​	在主方法中，创建多个男人和女人对象，并调用meeting()方法进行测试
 */
public class Test_1 {
    public static void main(String[] args) {
        meeting(new WoMan(),new Man());
    }

    public static void meeting(Person... ps){
        for (int i = 0; i < ps.length; i++) {
            ps[i].eat();
            ps[i].toilet();
            if(ps[i] instanceof Man){
                ((Man)ps[i]).smoke();
            }else if(ps[i] instanceof WoMan){
                ((WoMan)ps[i]).makeUp();
            }
        }
    }
}
