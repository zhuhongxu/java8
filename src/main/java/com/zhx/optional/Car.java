package com.zhx.optional;
/*
 * 车类
 * @Author: 遗忘的哈罗德
 * @Date: 2019-04-04 17:11
 */

import java.util.Optional;

public class Car {

    private Optional<Insurance> insurance;;

    public Optional<Insurance> getInsurance() {
        return insurance;
    }

    public void setInsurance(Optional<Insurance> insurance) {
        this.insurance = insurance;
    }
}
