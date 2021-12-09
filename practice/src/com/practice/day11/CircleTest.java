package com.practice.day11;

public class CircleTest {
    public static void main(String[] args) {

        Circle c1 = new Circle();

        c1.radius = 2.1;

        //对应方式一：
//		double area = c1.findArea();
//		System.out.println(area);

        //对应方式二：
//        c1.findArea(2);


        //错误的调用
		double area = c1.findArea(2);
		System.out.println(area);

    }
}

//圆
class Circle{

    //属性
    double radius;

    //求圆的面积
    //方式一：
//	public double findArea(){
//		double area = Math.PI * radius * radius;
//		return area;
//	}

    //方式二：
//    public void findArea(){
//        double area = Math.PI * radius * radius;
//        System.out.println("面积为：" + area);
//    }

    //错误情况：
	public double findArea(double radius){
		double area = 3.14 * radius * radius;
		return area;
	}

}

