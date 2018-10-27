package com.itheima01;

/**
 * Student是事物的描述类, main方法不适合放在事物的类中
 * <p>
 * 使用一个类, 就是使用该类的成员变量&成员方法, 必须首先实例化一个对象(new)
 * <p>
 * 创建对象的格式：
 * 类名 对象名 = new 类名();
 *
 * 方法区:
 *      StudentDemo.class  放置了main函数, 然后把main函数加载到栈底
 *
 *      Student.class      包含成员变量&成员方法, main函数中调用成员方法时, 入栈操作, 多个对象共用方法区
 *
 * 堆：
 *      实例包含成员属性值
 *      成员函数的引用
 *
 * 栈:
 *      函数调用记录, 实例对象的引用
 *      调用成员方法, 方法区的成员方法入栈, 调用完毕, 方法出栈
 *
 * 实例对象的引用修改实例变量, 无论是实例对象和实例对象的引用, 再取值都是修改过的相同值
 *
 */

public class StudentDemo {
    public static void main(String[] args) {
        // 创建学生对象
        Student stu = new Student();

        // com.itheima01.Student@677327b6  对象的实例内存地址, 放在堆内存
        System.out.println(stu);

        stu.name = "XKC";
        stu.age = 20;

        System.out.println(stu.name);
        System.out.println(stu.age);

        stu.study("English");
        stu.eat("Noodle");
    }
}
