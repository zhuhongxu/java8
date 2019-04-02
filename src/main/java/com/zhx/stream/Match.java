package com.zhx.stream;
/*
 * 在list中匹配数据
 * @Author: 遗忘的哈罗德
 * @Date: 2019-04-02 14:35
 */

import com.zhx.lambda.Apple;

import java.util.Arrays;
import java.util.List;

public class Match {
    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple("red", "shandong", 190),
                new Apple("black", "henan", 180),
                new Apple("yellow", "shandong", 170),
                new Apple("red", "shandong", 180),
                new Apple("blue", "shandong", 210),
                new Apple("brown", "shandong", 160),
                new Apple("red", "hainan", 150));


        //list中是否有henan的苹果
        System.out.println(list.stream().anyMatch((Apple apple) -> apple.getProvince().equals("henan")));

        //list中是否有jilin的苹果
        System.out.println(list.stream().anyMatch((Apple apple) -> apple.getProvince().equals("jilin")));


        //list中所有的苹果都来自shandong吗？
        System.out.println(list.stream().allMatch((Apple apple) -> apple.getProvince().equals("shandong")));

        //list中没有jilin的苹果吗？
        System.out.println(list.stream().noneMatch((Apple apple) -> apple.getProvince().equals("jilin")));
    }
}
