package com.zhx.lambda.recombine;
/*
 * 比较器复合
 * @Author: 遗忘的哈罗德
 * @Date: 2019-04-01 17:04
 */

import com.zhx.lambda.Apple;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

public class SorterRecombine {

    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple("red", "shandong", 190),
                new Apple("black", "henan", 100),
                new Apple("yellow", "shandong", 170),
                new Apple("red", "shandong", 180),
                new Apple("blue", "shandong", 210),
                new Apple("brown", "shandong", 160),
                new Apple("red", "hainan", 150));

        //按照weight正序
//        list.sort(comparing(Apple::getWeight));

        //按照weight倒序
//        list.sort(comparing(Apple::getWeight).reversed());

        //按照省份排序
//        list.sort(comparing(Apple::getProvince));

        //先按省份排序，再按照weight正序
//        list.sort(comparing(Apple::getProvince).thenComparing(Apple::getWeight));
        //先按省份排序，再按照weight倒序
        list.sort(comparing(Apple::getProvince).thenComparing((Apple a1, Apple a2) -> a2.getWeight() - a1.getWeight()));




        printList(list);

    }

    private static <T> void printList(List<T> list){
        for (T t : list){
            System.out.println(t);
        }
    }

}
