package com.atguigu.stream1;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {
    @Test
    public void test1(){
        List<String> list = Arrays.asList("Java", "C++", "HTML", "C#");
        Stream<String> stream = list.stream();
        Stream<String> stream1 = stream.limit(3);
        stream1.forEach(System.out::println);


       long count = list.stream().limit(2).filter(s -> s.length() >3).count();
        System.out.println("count = " + count);

    }
}
