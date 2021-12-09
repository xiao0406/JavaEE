package com.atguigu.test;

public class Test {
    public static void main(String[] args) {
        PingPongPlayer ppp = new PingPongPlayer("马龙",24);
        ppp.play();
        ppp.eat();
        ppp.sleep();
        BaskerBallPlayer bbp = new BaskerBallPlayer("周期",21);
        bbp.play();
        bbp.eat();
        bbp.sleep();
        PingPongCoach ppc = new PingPongCoach("刘胖子",40);
        ppc.teacher();
        ppc.eat();
        ppc.sleep();
        BaskerBallCoach bbc = new BaskerBallCoach("乔治",30);
        bbc.learnEnglilsh();
        bbc.teacher();
        bbc.eat();
    }
}