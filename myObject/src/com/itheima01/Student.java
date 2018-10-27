package com.itheima01;

import java.sql.SQLOutput;

/**
 * 面向对象是基于面向过程的
 * <p>
 * 面向过程强调的是每一个功能的步骤
 * 面向对象强调的是对象, 由对象去调用方法
 * <p>
 * 面向对象思想特点
 * 是一种更符合思考习惯的思想
 * 可以将复杂的事情简单化
 * 由执行变成指挥调用
 * 对面向过程的封装
 * <p>
 * 类与对象的关系:
 * 属性: 事物的描述信息
 * 方法: 事物能够做什么
 * <p>
 * Java最基本的单位是类, 类是一组相关属性和方法的集合, 对象就是该类的具体体现
 * <p>
 * 类的定义:
 * 现实事物属性&方法抽象出来
 * <p>
 * 成员变量: 描述事物的属性
 * 成员方法: 描述事物的行为
 * <p>
 * 类： 成员变量 + 成员方法
 * <p>
 * <p>
 * 成员变量的定义： 1.在类中, 方法外定义            2.不需要给初始化值, 成员变量会有默认值
 * 成员方法的定义： 1.在类中定义, 去掉static关键字
 */

public class Student {
    // 成员变量, 不需要初始化值
    String name;
    int age;

    // 成员方法, 去掉static关键字
    public void study(String str) {
        System.out.println("Studying: " + str);
    }

    public void eat(String food) {
        System.out.println("Eating: " + food);
    }
}
