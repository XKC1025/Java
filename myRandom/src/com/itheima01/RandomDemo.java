package com.itheima01;

/**
 * 随机数
 *
 * 1.导包       import java.util.Random;
 * 2.创建对象    Random rom = new Random();
 * 3.获取随机数  int number = rom.nextInt(10);
 */

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random rom = new Random();

        int number;
        for (int i = 0; i < 10; i++) {
            // 指定随机数的范围 [0, 10)
            number = rom.nextInt(100);
            System.out.println(number);
        }


    }
}
