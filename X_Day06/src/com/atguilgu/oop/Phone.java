package com.atguilgu.oop;

public class Phone {
    private String brand;//品牌
    private String color;//颜色
    private double prilce;//价格

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrilce(double prilce) {
        this.prilce = prilce;
    }

    public String getBrand() {

        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getPrilce() {
        return prilce;
    }
}
