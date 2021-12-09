package com.practice.day07;
/*
定义一个日期MyDate类。

  - 属性：
    - year：年
    - month：月
    - day：日
  - 构造方法：
    - 满参构造方法
  - 成员方法：
    - get/set方法
    - void showDate方法：打印日期。
    - boolean isLeapYear()方法：判断当前日期是否是闰年
创建MyDate对象，并测试。

- 开发提示：

  - 闰年：
    - 普通年（不能被100整除的年份）能被4整除的为闰年。（如2004年就是闰年,1999年不是闰年）；
    - 世纪年（能被100整除的年份）能被400整除的是闰年。(如2000年是闰年，1900年不是闰年)；
 */
public class MyDate {
    private int year;
    private int month;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    private int day;

    public MyDate() {
    }
    // - void showDate方法：打印日期。
    //    - boolean isLeapYear()方法：判断当前日期是否是闰年
//    闰年：
//  - 普通年（不能被100整除的年份）能被4整除的为闰年。（如2004年就是闰年,1999年不是闰年）；
//  - 世纪年（能被100整除的年份）能被400整除的是闰年。(如2000年是闰年，1900年不是闰年)；
    public void showDate(){
        System.out.println("日期:"+year+"."+month+"."+day);
    }
    public boolean isLeapYear(){
        return year % 100 !=0 && year % 4 ==0 || year % 400 == 0 ;
    }

}
