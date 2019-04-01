package com.zhx.lambda.recombine;
/*
 * 谓词复合
 * @Author: 遗忘的哈罗德
 * @Date: 2019-04-01 17:09
 */

import com.zhx.lambda.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateRecombine {

    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple("red", "shandong", 190),
                new Apple("black", "henan", 100),
                new Apple("yellow", "shandong", 170),
                new Apple("red", "shandong", 180),
                new Apple("blue", "shandong", 210),
                new Apple("brown", "shandong", 160),
                new Apple("red", "hainan", 150));

        //筛选出所有山东的苹果
        printList(filter(list, (Apple apple) -> apple.getProvince().equals("shandong")));

        System.out.println("%%%%%%%%%%%%%%%%%");

        //筛选出所有山东大于180g的苹果
        Predicate<Apple> predicate1 = (Apple apple) -> apple.getProvince().equals("shandong");
        Predicate<Apple> predicate2 = predicate1.and((Apple apple) -> apple.getWeight() > 180);
        printList(filter(list, predicate2));

        System.out.println("%%%%%%%%%%%%%%%%%");

        //筛选出所有山东不是红苹果的苹果
        Predicate<Apple> predicate3 = (Apple apple) -> apple.getColor().equals("red");
        Predicate<Apple> predicate4 = predicate3.negate();//表示非的意思（ps：当然可以直接在上一步取非，这里只是为了介绍一下api）
        printList(filter(list, predicate1.and(predicate4)));

    }

    static List<Apple> filter(List<Apple> list, Predicate<Apple> predicates){
        List<Apple> resultList = new ArrayList<>();
        for (Apple apple : list){
            if (predicates.test(apple)){
                resultList.add(apple);
            }
        }
        return resultList;
    }

    private static <T> void printList(List<T> list){
        for (T t : list){
            System.out.println(t);
        }
    }
}
