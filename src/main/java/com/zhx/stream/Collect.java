package com.zhx.stream;
/*
 * Stream收集数据
 * @Author: 遗忘的哈罗德
 * @Date: 2019-04-02 17:23
 */

import com.zhx.lambda.Apple;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;

public class Collect {


    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple("red", "shandong", 190),
                new Apple("black", "henan", 180),
                new Apple("yellow", "fujian", 170),
                new Apple("red", "shandong", 180),
                new Apple("blue", "shandong", 210),
                new Apple("brown", "shandong", 160),
                new Apple("red", "hainan", 150));
        System.out.println(groupByProvince(list));
        System.out.println("%%%%%%%");
        System.out.println(list.stream().collect(groupingBy(Apple::getProvince)));
    }

    private static Map<String, List<Apple>> groupByProvince(List<Apple> list){
        Map<String, List<Apple>> map = new HashMap<>();
        for (Apple apple : list){
            String province = apple.getProvince();
            List<Apple> templeList = null;
            if (map.containsKey(province)){
                templeList = map.get(province);
            } else {
                templeList = new ArrayList<>();
                map.put(province, templeList);
            }
            templeList.add(apple);
        }
        return map;
    }
}
