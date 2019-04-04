package com.zhx.optional;
/*
 * 人对象
 * @Author: 遗忘的哈罗德
 * @Date: 2019-04-04 17:11
 */

import java.util.Optional;

public class Person {

    private Optional<Car> car;

    public Optional<Car> getCar() {
        return car;
    }

    public void setCar(Optional<Car> car) {
        this.car = car;
    }
}
