package com.zhx.stream;
/*
 * 测试java.util.stream.Stream中的map方法
 * @Author: 遗忘的哈罗德
 * @Date: 2019-04-02 14:17
 */

import com.zhx.lambda.Apple;

import java.util.Arrays;
import java.util.List;

public class MapStream {

    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple("red", "shandong", 190),
                new Apple("black", "henan", 180),
                new Apple("yellow", "shandong", 170),
                new Apple("red", "shandong", 180),
                new Apple("blue", "shandong", 210),
                new Apple("brown", "shandong", 160),
                new Apple("red", "hainan", 150));


        //返回所有的省份
        list.stream().map(Apple::getProvince)
                     .forEach(System.out :: println);
    }
}
