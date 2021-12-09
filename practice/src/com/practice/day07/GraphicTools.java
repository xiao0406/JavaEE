package com.practice.day07;

public class GraphicTools {

    public void PrintRectangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printRectangle(int line, int column, String sign) {
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.println(sign);
            }
            System.out.println();
        }
    }

    public double getTriangleArea(double base, double height) {
        return (base * height) / 2;
    }

    public double getTriangleArea(double a, double b, double c) {
        if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b) {
            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else {
            System.out.println(a + "," + b + "," + c + "不能构成三角形");
            return 0;
        }
    }
}
class Test{
    public static void main(String[] args) {
        GraphicTools g = new GraphicTools();
        g.PrintRectangle();
        g.printRectangle(5,10,"#");
        System.out.println(g.getTriangleArea(3,4));
        System.out.println(g.getTriangleArea(3,4,5));
    }
}
