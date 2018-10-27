package com.itheima02;

/**
 * if (关系表达式) {
 *      语句体;
 * }
 *
 * if (关系表达式) {
 *     语句体1;
 * } else {
 *     语句体2;
 * }
 *
 * if (关系表达式) {
 *     语句1;
 * } else if (关系表达式) {
 *     语句2;
 * } else {
 *     语句n;
 * }
 *
 *
 * */

public class IfDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;

        if (a <= b) {
            System.out.println("a <= b");
        }

        if ((c % 2) == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }

        c++;

        if ((c % 2) == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }

        int x = 5;
        int y;

        if (x >= 3) {
            y = x * 2 + 1;
        } else if (x >= -1 && x < 3) {
            y = x * 2;
        } else if (x < -1) {
            y = x * 2 - 1;
        } else {
            // 编译器认为y有可能未初始化, 设置一个默认值
            y = 0;
            System.out.println("不存在这样的yw");
        }

        System.out.println(y);
    }
}
