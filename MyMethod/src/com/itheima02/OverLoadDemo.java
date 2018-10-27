package com.itheima02;

public class OverLoadDemo {
    public static void main(String[] args) {
        System.out.println(equal(1, 2));

        // 通过强制类型转换, 调用对应的方法
        System.out.println(equal((byte)2, (byte)2));

        System.out.println(equal(2L, 2L));
    }

    public static boolean equal(byte x, byte y) {
        return x == y;
    }

    public static boolean equal(short x, short y) {
        return x == y;
    }

    public static boolean equal(int x, int y) {
        return x == y;
    }

    public static boolean equal(long x, long y) {
        return x == y;
    }
}
