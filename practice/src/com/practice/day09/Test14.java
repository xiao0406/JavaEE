package com.practice.day09;

public class Test14 {
    public static void main(String[] args) {
        Fathe f = new Fathe();
        So s = new So();
        System.out.println(f.getInfo());//at
        System.out.println(s.getInfo());//shang
        s.test();//shang    at
        System.out.println("-----------------");
        s.setInfo("大硅谷");
        System.out.println(f.getInfo());//at
        System.out.println(s.getInfo());//da
        s.test();//da  at
    }
}
    class Fathe{
    private String info = "atguigu";
    public void setInfo(String info){
        this.info = info;
    }
    public String getInfo(){
        return info;
    }
}
class So extends Fathe{
    private String info = "尚硅谷";
    public void setInfo(String info){
        this.info = info;
    }
    public String getInfo(){
        return info;
    }
    public void test(){
        System.out.println(this.getInfo());
        System.out.println(super.getInfo());
    }
}


