package com.zhx.lambda;
/*
 * 测试Consumer函数式接口
 * @Author: 遗忘的哈罗德
 * @Date: 2019-04-01 14:41
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple("red", "shandong", 190),
                new Apple("black", "henan", 100),
                new Apple("yellow", "shandong", 170),
                new Apple("red", "shandong", 180),
                new Apple("blue", "shandong", 210),
                new Apple("brown", "shandong", 160),
                new Apple("red", "hainan", 150));
        foreach(list, (Apple apple) -> System.out.println(apple));
    }

    /**
     * 看起来实现一个简单的功能却搞得这么绕，事实上，这里介绍的是解决问题的思想，类似foreach这种功能jdk已经帮我们开发好了，
     * 后续会慢慢介绍
     * @param list
     * @param consumer
     */
    public static <T> void foreach(List<T> list, Consumer<T> consumer){
        for (T t : list){
            consumer.accept(t);
        }
    }
}
