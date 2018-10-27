package com.itheima03;

/**
 * 对象直接访问成员变量, 会存在数据安全&数据处理问题
 *
 * 使用private关键字进行限制:
 *              1.可以修饰成员变量&成员方法
 *              2.被private修饰的成员只能在本类中才能访问
 *
 * private常见的应用:
 *              1.把成员变量用private修饰, 提供对应的public修饰的 getValue() / setValue()方法
 *
 *
 * private是面向对象的封装特性
 *
 * 封装的原则：
 *      1.不需要对外提供的内容都隐藏起来
 *      2.把属性隐藏, 提供公共方法对其进行访问/修改
 *      3.通过方法来控制成员变量的操作, 提高了代码的安全性
 *      4.把代码进行封装, 提高了代码的复用性
 *
 * this:
 *      如果局部变量和成员变量重名, 在方法中局部变量使用的是就近的原则, 即使用的是成员变量
 *      把局部变量赋值给成员变量, 用this关键字
 *      this代表所在类的对象引用, 方法被哪个对象调用, 就代表哪个对象实例
 *      局部变量隐藏成员变量
 */

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();

        // 可以直接对age进行访问, 修改, 导致数据不安全
        // 用private关键字进行限制, 通过方法调用返回private权限的数据
        // student.age = -22;  会报错
        student.setAge(30);
        student.setName("Xu ke chen0000");

        student.getAge();
        String name = student.getName();
        System.out.println(name);
    }
}
