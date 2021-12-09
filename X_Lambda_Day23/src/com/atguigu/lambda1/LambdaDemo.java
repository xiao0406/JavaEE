package com.atguigu.lambda1;


import org.junit.Test;

import java.util.Comparator;

public class LambdaDemo {
    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

    }
    @Test
    public void T(){
        Comparator<Integer> comparator = (o1, o2) -> o1.compareTo(o2);
    }

}
