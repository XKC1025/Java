package com.itheima05;

/**
 * 多态的成员特点:
 *      1.成员变量: 编译时看的是左边, 运行时看的也是左边,  变量没有重写的概念
 *      2.成员函数: 编译时看的是左边, 运行时看的是右边  运行时动态绑定, 看的是具体对象的名字
 *      3.静态方法: 使用变量调用静态方法, 相当于  类名.方法()  编译时看的左边, 运行时看的左边
 *
 * 编译时看的都是左边, 运行时只有成员方法看的是右边
 */

public class PoymorphicDemo2 {
    public static void main(String[] args) {
        Dad dad = new Sub();

        // 编译时报错
//        dad.num;

        System.out.println(dad.num);

        dad.study();

        dad.function();
    }

}

class Dad {
    int num = 20;

    public void study() {
        System.out.println("Studying JAVA");
    }

    public static void function() {
        System.out.println("父类静态方法");
    }
}

class Sub extends Dad {
    int num = 10;

    @Override
    public void study() {
        System.out.println("Studying JAVA");
    }

    public static void function() {
        System.out.println("子类静态方法");
    }
}
