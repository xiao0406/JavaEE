package com.atguigu.funapi;

import jdk.nashorn.internal.ir.CallNode;
import org.junit.Test;

import java.util.function.*;

public class Test1 {
    //消费性接口
    @Test
    public void test1(){
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("integer = " + integer);
            }
        };
        consumer.accept(300);
        Consumer<Integer> consumer1 = (a) -> System.out.println("a = " + a);
        consumer1.accept(400);
    }

    @Test
    public void test2(){
        BiConsumer<String ,Integer> biConsumer = (name,money)-> System.out.println( name+money);
        biConsumer.accept("张三",300);
    }
    //供给型接口
    @Test
    public void test3(){
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int)(Math.random()*100);
            }
        };
        System.out.println(supplier.get());


        Supplier<Integer> supplier1 = ()->(int)(Math.random()*10);
        Integer integer = supplier1.get();
        System.out.println("integer = " + integer);
    }
    //断言型接口(判断型)
    @Test
    public void test4(){
        Predicate<String> predicate = s -> s.length()<5;
        boolean flag = predicate.test("wang");
        System.out.println("flag = " + flag);
    }
    @Test
    public void test5(){
        BiPredicate<String,String> biPredicate = (a,b)->a.equals(b);
        boolean test = biPredicate.test("asf", "dfas");
        System.out.println("test = " + test);
    }
}
