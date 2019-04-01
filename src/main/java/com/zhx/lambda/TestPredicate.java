package com.zhx.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 测试函数式接口Precidate
 */

public class TestPredicate {

    static List<Apple> filter(List<Apple> list, Predicate<Apple>... predicates){
        List<Apple> resultList = new ArrayList<>();
        for (Apple apple : list){
            if (ifWholeTrue(apple, predicates)){
                resultList.add(apple);
            }
        }
        return resultList;
    }

    /**
     * 判断这个苹果是否满足所有的条件
     * @param t
     * @param predicates
     * @return
     */
    static <T> boolean ifWholeTrue(T t, Predicate<T>... predicates){
        Boolean[] all = new Boolean[predicates.length];
        for (int i = 0; i < predicates.length; i++){
            all[i] = predicates[i].test(t);
        }
        boolean result = true;
        for (Boolean flag : all){
            if (!flag){
                return false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple("red", "shandong", 190),
                new Apple("black", "henan", 100),
                new Apple("yellow", "shandong", 170),
                new Apple("red", "shandong", 180),
                new Apple("blue", "shandong", 210),
                new Apple("brown", "shandong", 160),
                new Apple("red", "hainan", 150));

        //打印所有山东的，红色的并且重量大于185g的苹果
        printList(filter(list, (Apple apple) -> apple.getColor().equals("red"),
                (Apple apple)-> apple.getProvince().equals("shandong"),
                (Apple apple)-> apple.getWeight() > 185));

    }

    private static <T> void printList(List<T> list){
        for (T t : list){
            System.out.println(t);
        }
    }

}
