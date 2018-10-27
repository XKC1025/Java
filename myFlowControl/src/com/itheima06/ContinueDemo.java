package com.itheima06;

/**
 * continue;  直接进入下一层循环
 */

public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
