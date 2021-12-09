package com.practice.day12;

public class Test2 {
    public static void main(String[] args) {
       Out.In in = new Out().new In();
       in.print();
    }
}
class Out{
    private int age = 12;
    class In{
        private int age = 13;
        public void print(){
            int age = 14;
            System.out.println("局部变量：" + age);//14
            System.out.println("内部类变量：" + this.age);//13
            System.out.println("外部类变量：" + Out.this.age);//12
        }
    }
}