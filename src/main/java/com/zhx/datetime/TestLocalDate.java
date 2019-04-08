package com.zhx.datetime;
/*
 * 测试LocalDate
 * @Author: 遗忘的哈罗德
 * @Date: 2019-04-08 11:44
 */

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.TemporalAdjusters.*;

public class TestLocalDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2014, 3, 18);
        System.out.println("创建的日期：" + localDate);
        System.out.println("年份：" + localDate.getYear());
        System.out.println("月份：" + localDate.getMonth());
        System.out.println("该年的第几天：" + localDate.getDayOfYear());
        System.out.println("该月的第几天：" + localDate.getDayOfMonth());
        System.out.println("周几：" + localDate.getDayOfWeek());
        System.out.println("本月有几天：" + localDate.lengthOfMonth());
        System.out.println("本年有几天：" + localDate.lengthOfYear());

        System.out.println("----------------------------------");

        LocalDate now = LocalDate.now();
        System.out.println("当前日期是：" + now);
        System.out.println("下面的这些方法都是新生成了一个LocalDate对象，愿对象不变");
        System.out.println("昨天的日期：" + now.minus(1, ChronoUnit.DAYS));
        System.out.println("明天的日期：" + now.plus(1, ChronoUnit.DAYS));
        System.out.println("十天前的日期：" + now.minus(10, ChronoUnit.DAYS));
        System.out.println("上个月的今天：" + now.minus(1, ChronoUnit.MONTHS));
        System.out.println("下一个周三是几号：" + now.with(nextOrSame(DayOfWeek.WEDNESDAY)));
        System.out.println("本月的最后一天：" + now.with(lastDayOfMonth()));
        System.out.println(now);


    }
}
