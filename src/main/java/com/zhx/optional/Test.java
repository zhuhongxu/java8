package com.zhx.optional;
/*
 * 测试类
 * @Author: 遗忘的哈罗德
 * @Date: 2019-04-04 17:15
 */

import java.util.Optional;

public class Test {

    public static void main(String[] args) {
        Insurance insurance = new Insurance();
        insurance.setName("平安");
        Car car = new Car();
        car.setInsurance(Optional.ofNullable(insurance));
        Person person = new Person();
        person.setCar(Optional.ofNullable(car));



        System.out.println(getInsuranceName(Optional.ofNullable(person)));

    }


    /**
     * 获取保险名称
     * @param person
     * @return
     */
    private static String getInsuranceName(Optional<Person> person){
        return person.flatMap(Person::getCar)
                     .flatMap(Car::getInsurance)
                     .map(Insurance::getName)
                     .orElse("unknown");
    }
}
