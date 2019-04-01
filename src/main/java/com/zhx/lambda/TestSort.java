package com.zhx.lambda;
/*
 * java8排序
 * @Author: 遗忘的哈罗德
 * @Date: 2019-04-01 15:51
 */

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

public class TestSort {
    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple("red", "shandong", 190),
                new Apple("black", "henan", 100),
                new Apple("yellow", "shandong", 170),
                new Apple("red", "shandong", 180),
                new Apple("blue", "shandong", 210),
                new Apple("brown", "shandong", 160),
                new Apple("red", "hainan", 150));
        //List.sort(Comparator<? super E> c)其中Comparator是一个函数式接口，因此我们可以使用Lambda来实现它
//        list.sort((Apple a1, Apple a2) -> a1.getWeight() - a2.getWeight());
        //因为Lambda表达式会根据上下文来推断出参数的类型，所以可以简写为：
//        list.sort((a1, a2) -> a1.getWeight() - a2.getWeight());
        //因为Comparator<T>函数式接口给我们提供了一个静态方法comparing，它可以接受一个Function来提取Comparable键值，并生成一个Comparator对象
//        list.sort(comparing((Apple apple) -> apple.getWeight()));
        //我们可以使用方法引用来使上面一行的代码可读性更强
        list.sort(comparing(Apple :: getWeight));
        printList(list);
    }

    private static <T> void printList(List<T> list){
        for (T t : list){
            System.out.println(t);
        }
    }
}
