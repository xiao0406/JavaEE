package com.atguigu.stream1;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamTest2 {
    @Test
    public void test1(){
        List<String> list = Arrays.asList("Java", "C++", "HTML", "C#");
        list.stream().forEach(System.out::println);
        System.out.println("--------");

        list.parallelStream().forEach(System.out::println);
        System.out.println("--------");
    }
    @Test
    public void test2(){
        String [] array = {"Java", "C++", "HTML", "C#"};
        Arrays.stream(array).forEach(System.out::println);
        System.out.println("----------------------");
    }
    @Test
    public void test3(){
        Stream.of("Java", "C++", "HTML", "C#").forEach(System.out::println);
        System.out.println("-------------------");
    }
    @Test
    public void test4(){
        Stream.generate(()->Math.random()*10).limit(10).forEach(System.out::println);
        Stream<Integer> iterate = Stream.iterate(2, new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer + 1;
            }
        });
        iterate.limit(10).forEach(System.out::println);
    }
}
