package com.zhx.lambda;
/*
 * 测试Function函数式接口
 * @Author: 遗忘的哈罗德
 * @Date: 2019-04-01 14:50
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class TestFunction {

    static <T, R> List<R> map(List<T> list, Function<T, R> function){
        List<R> resultList = new ArrayList<>();
        for (T t : list){
            resultList.add(function.apply(t));
        }
        return resultList;
    }

    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple("red", "shandong", 190),
                new Apple("black", "henan", 100),
                new Apple("yellow", "shandong", 170),
                new Apple("red", "shandong", 180),
                new Apple("blue", "shandong", 210),
                new Apple("brown", "shandong", 160),
                new Apple("red", "hainan", 150));

        printList(map(list, (Apple apple) -> apple.getColor()));
        System.out.println("---------------------");
        printList(map(list, (Apple apple) -> apple.getWeight()));

    }

    private static <T> void printList(List<T> list){
        for (T t : list){
            System.out.println(t);
        }
    }
}
