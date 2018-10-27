package com.itheima02;

/**
 *
 * 成员变量和局部变量的区别:
 *      1.在类中的位置不同    a.成员变量在类中, 方法外   b.局部变量在方法中, 或者形式参数
 *
 *      2.在内存中的位置不同  a.成员变量在堆内存, 和实例对象绑定在一起   b.局部变量在栈中, 方法调用完毕立即释放
 *
 *      3.生命周期           a.成员变量随着对象的创建而存在   b.局部变量随着方法的调用而存在
 *
 *      4.初始化值           a.成员变量有默认值             b.局部变量没有默认值, 使用时必须初始化
 *
 *
 */

public class Variable {
    // 成员变量
    int x;

    // 局部变量
    public void show() {   // 形式参数也是局部变量
        int y = 0;

        System.out.println(x);
        System.out.println(y);
    }

}
