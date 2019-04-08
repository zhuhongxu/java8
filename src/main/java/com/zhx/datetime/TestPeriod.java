package com.zhx.datetime;
/*
 * 测试Period
 * @Author: 遗忘的哈罗德
 * @Date: 2019-04-08 14:59
 */

import java.time.LocalDate;
import java.time.Period;

public class TestPeriod {
    public static void main(String[] args) {
        Period period = Period.between(LocalDate.of(2019, 1, 15),
                LocalDate.of(2019, 3, 16));
        System.out.println(period.getDays());
    }
}
