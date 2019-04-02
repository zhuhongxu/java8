package com.zhx.stream;
/*
 * 测试归约
 * @Author: 遗忘的哈罗德
 * @Date: 2019-04-02 15:24
 */

import java.util.Arrays;
import java.util.List;

public class Reduce {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        //list中所有元素的和
        System.out.println(list.stream().reduce(0, (a, b) -> a + b));


        //list2中所有元素的乘积
        System.out.println(list2.stream().reduce(1, (a, b) -> a * b));


        //list中的最小值
        System.out.println(list.stream().reduce(Integer::min));
    }




}
