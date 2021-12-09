package com.atguigu.lambda1;

import java.util.function.Consumer;

public class LambdaDemo1 {
    public static void main(String[] args) {
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("Hello");
            }
        };

    }
}
