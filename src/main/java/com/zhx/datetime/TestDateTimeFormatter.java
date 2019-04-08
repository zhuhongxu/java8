package com.zhx.datetime;
/*
 * 测试DateTimeFormatter
 * @Author: 遗忘的哈罗德
 * @Date: 2019-04-08 15:50
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestDateTimeFormatter {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_DATE));


        System.out.println(LocalDate.parse("2018-09-29", DateTimeFormatter.ISO_LOCAL_DATE));

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(now.format(dateTimeFormatter));
    }
}
