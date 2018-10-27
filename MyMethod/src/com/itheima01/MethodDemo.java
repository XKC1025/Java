package com.itheima01;

/**
 * 方法： 函数,  完成特定功能的代码块
 * <p>
 * 定义格式：
 * 修饰符 返回值类型 方法名(参数类型 参数1, 参数类型 参数2, ....) {
 * 方法体;
 * return 返回值;
 * }
 * <p>
 * 修饰符:     public static
 * <p>
 * 返回值类型: 用于限定返回值的类型
 * <p>
 * 方法名:    为了方便调用方法的名字
 * <p>
 * 参数类型:   限制调用方法时, 传入参数的数据类型
 * <p>
 * 参数名:    接收调用方法时, 传入的实参值, 局部变量
 * <p>
 * 方法体：   完成功能的代码
 * <p>
 * return:   结束方法, 并把返回值返回给调用者
 */

import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a;
        int b;

        System.out.println("a: ");
        a = scan.nextInt();

        System.out.println("b: ");
        b = scan.nextInt();

        int result;
        result = compare(a, b);

        System.out.println(result);

        boolean res = equal(a, b);
        System.out.println(res);

        int x;
        int y;
        int z;

        x = scan.nextInt();
        y = scan.nextInt();
        z = scan.nextInt();

        System.out.println(getMax(x, y, z));

    }

    public static int compare(int x, int y) {
        return (x > y) ? x : y;
    }

    public static boolean equal(int x, int y) {
        return x == y;
    }

    public static int getMax(int x, int y, int z) {
        return (((x > y) ? x : y)) > z ? ((x > y) ? x : y) : z;
    }
}
