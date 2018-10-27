package com.itheima06;

/**
 *
 * break中断
 *
 * 1.结束switch语句
 * 2.结束循环, 跳出当前循环层
 *
 */

public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 8) {
                break;
            }
        }
    }
}
