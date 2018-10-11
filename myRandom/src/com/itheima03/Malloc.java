package com.itheima03;

/**
 * java中的内存分配
 *
 *  栈  存储的是局部变量, 即在方法中定义的变量  栈内存使用完毕后立即被gc回收
 *
 *  堆 存储 new 出来的对象, 1.每个对象都有默认地址值
 *                        2.每个对象的数据都有默认值
 *                          byte/short/int/long类型数组默认 0
 *                          float/double类型数组默认0.0
 *                          char类型数组默认 '\u0000'
 *                          boolean类型6juhjh默认false
 *                          引用类型默认null
 *                        3.对象使用完毕后, 会在垃圾回收器(gc)空闲的时候被回收 jvm
 *
 *  方法区 （面向对象进阶）
 *  本地方法区（操作系统）
 *  寄存器（CPU）
 */

public class Malloc {
    public static void main(String[] args) {

        // int[] arry是main函数中的局部变量, 放在栈中
        // new int[10] 放在堆内存中
        // arr指向堆内存首地址 [I@677327b6

        int[] arry = new int[10];

        System.out.println(arry);

        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }

    }
}
