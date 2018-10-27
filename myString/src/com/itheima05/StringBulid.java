package com.itheima05;

/**
 * 对字符串进行拼接操作, 每次拼接, 都会构建一个新的String对象, 原来的方法区字符串对象变成垃圾,
 * 耗费内存空间, 影响jvm效率
 *
 * StringBuilder就是解决这个问题, 可变的字符串序列. 字符串缓冲区类
 */

public class StringBulid {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        // 获取当前容量, 容量是理论值
        System.out.println(builder.capacity());

        // 返回字符数, 实际值
        System.out.println(builder.length());

        // builder.append(任意类型). 添加值并返回自身对象
        // StringBuilder builder2 = builder.append("Hello");

        // System.out.println(builder);
        // System.out.println(builder2);

        // System.out.println(builder == builder2);

        // 可以存放任意数据类型, 都转化成字符串类型
        builder.append("Hello");
        builder.append(" ,World!");
        builder.append(true);
        builder.append(100);

        System.out.println(builder.toString());

        // 链式编程
        builder.append("123").append(123);
        System.out.println(builder.toString());

        // 翻转字符串
        builder.reverse();
        System.out.println(builder.toString());

        String[] sArr = new String[10];

        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = "hello";
        }

        for (String str: sArr) {
            System.out.println(str);
        }

    }
}
