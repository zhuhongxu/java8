package com.zhx.datetime;
/*
 * 测试LocalTime
 * @Author: 遗忘的哈罗德
 * @Date: 2019-04-08 14:20
 */

import java.time.LocalTime;

public class TestLocalTime {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(23, 15, 50);
        System.out.println("创建的时间：" + localTime);
        System.out.println("小时：" + localTime.getHour());
        System.out.println("分钟：" + localTime.getMinute());
        System.out.println("秒：" + localTime.getSecond());

        System.out.println("-----------------------");

        System.out.println("现在几点了：" + LocalTime.now());
    }
}
