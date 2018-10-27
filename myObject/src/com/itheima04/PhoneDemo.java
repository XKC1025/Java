package com.itheima04;

/**
 * 构造方法： 给对象的数据进行初始化
 *
 * 格式：
 *      1.方法名和类名相同
 *      2.没有返回值类型, void也没有
 *      3.没有具体的返回值
 *
 * 调用构造方法： 通过new关键字调用
 *      类名 对象名 = new 构造方法();
 *
 * 构造方法注意事项:
 *      1.如果没有给出构造方法, 系统将会给出默认的无参构造方法, 来创建实例对象
 *      2.如果给出了构造方法, 系统不再提供默认的构造方法, 必须自己写无参的构造方法
 *      3.构造方法也是可以重载的
 *
 * 成员变量赋值:
 *      1.private变量, 通过setAge()方法进行赋值
 *      2.带参构造方法
 */

public class PhoneDemo {
    public static void main(String[] args) {
        // 调用构造方法   new
        Phone phone = new Phone();
        phone.show();

        // 重载构造方法
        Phone phone2 = new Phone("荣耀");
        phone2.show();

        //
        Phone phone3 = new Phone("小米", 2799);
        phone3.show();


    }
}
