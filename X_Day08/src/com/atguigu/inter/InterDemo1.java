package com.atguigu.inter;

public class InterDemo1 {
    public static void main(String[] args) {
        Inter7 i =new Inter();
        i.method();
        i.show();
    }
}
interface Inter7{
    public static final int num = 10;

    public abstract void show();
    public abstract void method();

}
class Inter implements Inter7{


    @Override
    public void show() {
        System.out.println("调用show");
    }

    @Override
    public void method() {
        System.out.println("调用method");
    }
}
