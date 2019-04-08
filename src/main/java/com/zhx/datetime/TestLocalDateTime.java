package com.zhx.datetime;
/*
 * 测试LocalDateTime
 * @Author: 遗忘的哈罗德
 * @Date: 2019-04-08 14:32
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime = getLocalDateTime4();
        System.out.println("年：" + localDateTime.getYear());
        System.out.println("月：" + localDateTime.getMonth());
        System.out.println("日：" + localDateTime.getDayOfMonth());
        System.out.println("时：" + localDateTime.getHour());
        System.out.println("分：" + localDateTime.getMinute());
        System.out.println("秒：" + localDateTime.getSecond());
        System.out.println("LocalDate：" + localDateTime.toLocalDate());
        System.out.println("LocalTime：" + localDateTime.toLocalTime());

        System.out.println("----------------");

        System.out.println("现在是什么时候：" + LocalDateTime.now());
    }


    /**
     * 通过年月日时分秒构造LocalDateTime
     * @return
     */
    private static LocalDateTime getLocalDateTime1(){
        return LocalDateTime.of(2019, 3, 18, 12, 13, 12);
    }


    /**
     * 通过LocalDate和LocalTime构造LocalDateTime
     * @return
     */
    private static LocalDateTime getLocalDateTime2(){
        LocalDate localDate = LocalDate.of(2019, 3, 18);
        LocalTime localTime = LocalTime.of(12, 13, 12);
        return LocalDateTime.of(localDate, localTime);
    }

    /**
     * 通过localDate.atTime(localTime)构造
     * @return
     */
    private static LocalDateTime getLocalDateTime3(){
        LocalDate localDate = LocalDate.of(2019, 3, 18);
        LocalTime localTime = LocalTime.of(12, 13, 12);
        return localDate.atTime(localTime);
    }

    /**
     * 通过localTime.atDate(localDate)构造
     * @return
     */
    private static LocalDateTime getLocalDateTime4(){
        LocalDate localDate = LocalDate.of(2019, 3, 18);
        LocalTime localTime = LocalTime.of(12, 13, 12);
        return localTime.atDate(localDate);
    }

}
