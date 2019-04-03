package com.zhx.stream;
/*
 * 常见的归约操作
 * @Author: 遗忘的哈罗德
 * @Date: 2019-04-03 17:16
 */

import com.alibaba.fastjson.JSON;
import com.zhx.lambda.Apple;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.*;

public class Collect {
    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple("red", "shandong", 190),
                new Apple("black", "henan", 80),
                new Apple("red", "shandong", 270),
                new Apple("yellow", "beijing", 280),
                new Apple("blue", "beijing", 210),
                new Apple("brown", "shandong", 150),
                new Apple("red", "hainan", 100));


        //按照省份分组
        System.out.println(JSON.toJSONString(list.stream().collect(groupingBy(Apple::getProvince))));

        //先按照省份分组，再按照颜色分组
        System.out.println(JSON.toJSONString(list.stream().collect(groupingBy(Apple::getProvince, groupingBy(Apple::getColor)))));

        //返回一个Map，键为颜色，值为省份
        System.out.println(JSON.toJSONString(list.stream().collect(
                toMap(apple -> apple.getColor(),
                        apple -> apple.getProvince(),
                        (u, v) -> v))));

        //集合的长度
        System.out.println(JSON.toJSONString(list.stream().collect(counting())));

        //所有苹果的重量之和
        System.out.println(JSON.toJSONString(list.stream().collect(summingInt(Apple::getWeight))));

    }
}



