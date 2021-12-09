package com.practice.day18;

import java.util.Objects;

public class Test2 {
    public static void main(String[] args) {
        Coordinate<String> c1 = new Coordinate<>("武汉","尚硅谷");
        Coordinate<Double> c2 = new Coordinate<>(123.0,51.4);
        System.out.println(c1);
        System.out.println(c2);
    }
}
class Coordinate<T>{
    private T x;
    private T y;

    public Coordinate() {
    }

    public Coordinate(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate<?> that = (Coordinate<?>) o;
        return Objects.equals(x, that.x) &&
                Objects.equals(y, that.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
