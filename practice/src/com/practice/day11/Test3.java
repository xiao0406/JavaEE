package com.practice.day11;

import java.util.Scanner;

/*
- 拟玩家选择角色。
- 定义接口FightAble：
  - 抽象方法：specialFight。
  - 默认方法：commonFight,方法中打印"普通打击"。
- 定义战士类：
  - 实现FightAble接口,重写方法中打印"武器攻击"。
- 定义法师类Mage：
  - 实现FightAble接口,重写方法中打印"法术攻击"。
- 定义玩家类Player：
  - 静态方法：FightAble select(String str)，根据指令选择角色。
    - 法力角色，选择法师。
    - 武力角色，选择战士。
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("选择角色(法力角色或者物理角色):");
        String s = scan.nextLine();
        FightAble f1 = player.select(s);
        f1.commonFight();
        f1.specialFight();
        System.out.println("--------------------------");
        System.out.println("选择角色(法力角色或者物理角色):");
        String s1 = scan.nextLine();
        FightAble f2 = player.select(s1);
        f2.commonFight();
        f2.specialFight();

    }
}
interface FightAble{
    public void specialFight();
    public default void commonFight(){
        System.out.println("普通打击");
    }
}

//战士 : warrior
class warrior implements FightAble {
    @Override
    public void specialFight() {
        System.out.println("武器攻击");
    }
}
    //法师 : master
class master implements FightAble{
        @Override
        public void specialFight() {
            System.out.println("法术攻击");
        }
    }
class player{
    public static FightAble select(String str) {
        if ("法力角色".equals(str)) {
            return new master();
        } else if ("物理角色".equals(str)) {
            return new warrior();
        }
        return null;
    }
}
