package com.itheima07;

import java.util.ArrayList;

/**
 * 自动装箱: 基本数据类型转化成包装类
 * 自动拆箱: 包装类转化成基本数据类型
 */

public class IntegerDemo2 {
    public static void main(String[] args) {
        // 自动装箱
        // Integer integer = new Integer(10);
        Integer i1 = 10;

        // 自动拆箱
        // Integer integer = new Integer(10);
        // int a = integer.intValue();
        Integer i2 = 10;
        int a = i2;

        // 自动拆箱 + 装箱
        // Integer i3 = new Integer(i1.intValue() + i2.intValue());
        Integer i3 = i1 + i2;
        System.out.println(i3.intValue());

        ArrayList list = new ArrayList();
        // list.add(10);  // 自动装箱, list.add(new Integer(10));

        System.out.println("898044807.".matches("^[1-9][0-9]{4,14}$"));

    }
}
