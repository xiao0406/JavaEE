package com.practice.day07;
/*
- 在com.atguigu.test04.bean包中定义一个扑克Card类。
  - 属性：
    - 花色
    - 点数
  - 构造方法：
    - 满参构造方法
  - 成员方法：
    - showCard方法：打印牌面信息
- 在com.atguigu.test04.test包中定义测试类，创建Card对象，调用showCard方法。
 */
public class Card {
    String huase;
    char dianshu;

    public Card() {
    }

    public Card(String huase, char dianshu) {
        this.huase = huase;
        this.dianshu = dianshu;
    }

    public String getHuase() {
        return huase;
    }

    public void setHuase(String huase) {
        this.huase = huase;
    }

    public int getDianshu() {
        return dianshu;
    }

    public void setDianshu(char dianshu) {
        this.dianshu = dianshu;
    }
    public void showCard(){
        System.out.println(huase+dianshu);
    }
}
