package com.itheima01;

/**
 * 返回值为void类型的方法, 也叫过程
 */

public class Process {
    public static void main(String[] args) {
        String str;
        str = "调用过程";

        Process(str);

        printFlower();

    }

    public static void Process(String s) {
        System.out.println(s);

    }

    public static void printFlower() {
        for (int i = 100; i <= 999; i++) {
            int x = i % 10;
            int y = i / 10 % 10;
            int z = i / 100;

            if (i == (x * x * x + y * y * y + z * z * z)) {
                System.out.println(i);
            }
        }
    }
}
