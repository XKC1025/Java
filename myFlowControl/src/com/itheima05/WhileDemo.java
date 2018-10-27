package com.itheima05;

/**
 * 初始化语句;
 * while (条件判断语句) {
 * 循环语句;
 * 控制条件语句;
 * }
 */

public class WhileDemo {
    public static void main(String[] args) {
        int max = 100;
        int sum = 0;

        while (max >= 1) {
            sum += max;
            max--;
        }
        System.out.println(max);
        System.out.println(sum);

        int i = 100;
        int x;
        int y;
        int z;
        int count = 0;

        while (100 <= i && i <= 999) {
            x = i % 10;
            y = i / 10 % 10;
            z = i / 100;

            if (i == x * x * x + y * y * y + z * z * z) {
                System.out.println(i);
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}
