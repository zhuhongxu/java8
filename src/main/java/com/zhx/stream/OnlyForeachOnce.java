package com.zhx.stream;
/*
 * 一个流只能遍历一次
 * @Author: 遗忘的哈罗德
 * @Date: 2019-04-02 11:00
 */

import com.zhx.lambda.Apple;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class OnlyForeachOnce {
    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple("red", "shandong", 190),
                new Apple("black", "henan", 100),
                new Apple("yellow", "shandong", 170),
                new Apple("red", "shandong", 180),
                new Apple("blue", "shandong", 210),
                new Apple("brown", "shandong", 160),
                new Apple("red", "hainan", 150));

        Stream<Apple> stream = list.stream();
        stream.forEach(System.out :: println);
        System.out.println("%%%%%%%%%%%%");
        stream.forEach(System.out :: println);
    }
}
