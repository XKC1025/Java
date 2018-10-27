package com.itheima02;

/**
 * 重载, 在同一个类中, 根据传入的参数类型或参数数量, 调用不同的同名函数
 *
 * 方法名相同, 参数列表不相同, 与返回值无关
 *
 * 注意: 调用方法时, jvm根据判断参数列表来区分不同的方法
 *
 */

public class OverLoad {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = 20;

        double m = 1.1;
        double n = 2.2;

        System.out.println(sum(a, b));

        System.out.println(sum(a, b, c));

        System.out.println(sum(m, n));


    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sum(int x, int y, int z) {
        return x + y +z;
    }

    public static double sum(double x, double y) {
        return x + y;
    }

}
