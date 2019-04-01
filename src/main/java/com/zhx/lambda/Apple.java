package com.zhx.lambda;
/*
 * Apple实体类
 * @Author: 遗忘的哈罗德
 * @Date: 2019-04-01 13:43
 */

public class Apple {
    private String color;//颜色
    private String province;//产地
    private int weight;//重量

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Apple(String color, String province, int weight) {
        this.color = color;
        this.province = province;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", province='" + province + '\'' +
                ", weight=" + weight +
                '}';
    }
}
