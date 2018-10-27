package com;

/**
 * 阶乘
 */

public class itheima01 {
    public static int getResult(int n, int result) {
        if (n == 0) {
            return result;
        }
        return getResult(n - 1, result * n);
    }

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {

            return fib(n-1) + fib(n-2);
        }

    }

    public static void main(String[] args) {
        System.out.println(getResult(5, 1));

        System.out.println(fib(20));
    }
}
