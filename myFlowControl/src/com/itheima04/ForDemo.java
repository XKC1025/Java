package com.itheima04;

/**
 * for 循环语句的格式
 * <p>
 * for(初始化语句;判断条件语句;控制条件语句) {
 * 循环体语句;
 * }
 * <p>
 * 执行流程:
 * 1.初始化语句, 只会执行一次
 * 2.执行判断条件语句
 * 3.true 执行循环体
 * 4.执行控制条件语句
 * 5.执行2
 */

public class ForDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }

    }
}
