package com.zhx.stream;
/*
 * filter（筛选）和去重（distinct）
 * @Author: 遗忘的哈罗德
 * @Date: 2019-04-02 14:04
 */

import com.zhx.lambda.Apple;

import java.util.Arrays;
import java.util.List;

public class FilterAndDistinct {


    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple("red", "shandong", 190),
                new Apple("black", "henan", 180),
                new Apple("yellow", "shandong", 170),
                new Apple("red", "shandong", 180),
                new Apple("blue", "shandong", 210),
                new Apple("brown", "shandong", 160),
                new Apple("red", "hainan", 150));

        //筛选出所有大于150g的苹果
        list.stream().filter((Apple apple) -> apple.getWeight() > 150)
                     .forEach(System.out :: println);

        System.out.println("&&&&&&&&&&&&&&&&&&&&&");

        //筛选出所有大于150g的苹果的重量
        list.stream().filter((Apple apple) -> apple.getWeight() > 150)
                .forEach((Apple apple) -> System.out.println(apple.getWeight()));

        System.out.println("&&&&&&&&&&&&&&&&&&&&&");

        //筛选出所有大于150g的苹果的重量，并且去重
        list.stream().filter((Apple apple) -> apple.getWeight() > 150)
                     .map((Apple apple) -> apple.getWeight())
                     .distinct()
                     .forEach(System.out :: println);

    }






}
