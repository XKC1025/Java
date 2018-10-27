package com.itheima05;

/**
 * 初始化语句;
 * do {
 * 循环体;
 * 控制条件语句;
 * } while (判断条件语句);
 */

public class DoWhileDemo {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        do {
            sum += i;
            i++;

        } while (i <= 100);

        System.out.println(sum);

//        for (;;) {
//            System.out.println("Java");
//        }

        while (true) {
            System.out.println("Java");

        }
    }
}
