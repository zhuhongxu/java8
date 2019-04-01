package com.zhx.lambda;/*
 *
 * @Author: 遗忘的哈罗德
 * @Date: 2019-04-01 11:45
 */

public class HelloLambda {
    //定义一个线程，使用Lambda和不使用Lambda（使用匿名内部类）的两种写法比较
    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println("Hello World");
        r1.run();
    }

//    public static void main(String[] args) {
//        Runnable r1 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello World");
//            }
//        };
//        r1.run();
//    }


}
