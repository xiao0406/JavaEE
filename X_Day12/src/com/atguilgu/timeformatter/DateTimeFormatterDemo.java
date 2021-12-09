package com.atguilgu.timeformatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        //创建一个LocalDateTime对象
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
//        DateTimeFormatter 对象的创建
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
//        格式化操作
        String formatTime = now.format(dtf);
        System.out.println("formatTime = " + formatTime);
        //解析
        String time = "1999年04月06日 00:00:00";
        LocalDateTime localDateTime = LocalDateTime.parse(time, dtf);
        System.out.println("localDateTime = " + localDateTime);
    }
}
