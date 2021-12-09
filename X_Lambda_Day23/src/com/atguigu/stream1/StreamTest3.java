package com.atguigu.stream1;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest3 {
    @Test
    public void test1(){
        Stream<Integer> stream = Stream.of(8, 7, 6, 5, 4, 3, 4, 3, 2, 1);
        //获取偶数
        List collect = stream.filter(n -> n % 2 == 0).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
    @Test
    public void test2(){
        Stream<Integer> stream = Stream.of(8, 7, 6, 5,5,4,2,7,8, 4, 3, 4, 3, 2, 1);
        stream.distinct().forEach(System.out::println);
    }
    @Test
    public void test3(){
        Stream<Integer> stream = Stream.of(8, 7, 6, 5, 4, 3, 4, 3, 2, 1);
        stream.skip(2).limit(3).forEach(System.out::println);
    }
    @Test
    public void test4(){
        Stream<String> list = Stream.of("Java", "JavaScript", "C++", "HTML");
        list.peek(s->System.out.println(s.length())).forEach(System.out::println);
    }
    @Test
    public void test5(){
        List<String> list = Arrays.asList("Java", "JavaScript", "C++", "HTML");
        list.stream().map(s -> s.length()).forEach(System.out::println);
    }
    @Test
    public void test6(){
        List<String> list = Arrays.asList("Java", "JavaScript", "C++", "HTML");
        list.stream().peek(s -> System.out.println(s.length())).count();
    }

}
