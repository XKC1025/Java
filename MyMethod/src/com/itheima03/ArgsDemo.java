package com.itheima03;

/**
 * 方法的参数如果是基本的数据类型, 形式参数的改变不会影响实际参数
 *
 *
 * 实参: 实际参与运算的变量
 * 形参: 用于接收实际参数的变量
 *
 * 栈： 存储局部变量, 使用完毕立即被gc回收
 * 堆：存储new出来的对象(new int[], new Scanner...), 使用完毕, 在jvm空闲的时候回收
 * 方法区：　保存的是字节码文件, 里面有全部方法
 *
 * 入栈：先加载main方法到栈底, 再加载change方法到main方法上面
 *      change方法的局部变量, 在加载的时候才会创建, 此时change函数内部的局部变量与main函数中的实参没有关联
 *      change方法出栈的时候, 局部变量立即被回收
 *
 */

public class ArgsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a: " + a + "b: " + b);
        System.out.println("a: " + a + "b: " + b);

        // 实参
        change(a, b);
        System.out.println("a: " + a + "b: " + b);
    }

    public static void change(int a, int b) {  // 形参
        System.out.println("a: " + a + "b: " + b);
        a = b;
        b = a + b;
        System.out.println("a: " + a + "b: " + b);
    }
}
