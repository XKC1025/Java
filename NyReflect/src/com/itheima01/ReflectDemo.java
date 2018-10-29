package com.itheima01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射:
 *      类型为Class的对象, 可以反射类, 接口, 数组等引用对象
 *      对加载到JVM中的类对象的描述, 以及访问, 修改等功能
 *      反射类的: 成员变量, 方法, 构造方法, 包等信息
 *
 *      ins.getClass()
 *      type.class
 */

public class ReflectDemo {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        // 反射的三种方法

        // 1.通过实例反射, 自动运行静态代码块
        // 继承Object的getClass()方法
        Class clazz = (new Student()).getClass();

        // 2.通过类反射, 不自动运行静态代码块
        Class clazz2 = Student.class;

        // 3.通过Class的静态方法, 自动运行静态代码块
        // 需要指定类的完整路径
        Class clazz3 = Class.forName("com.itheima01.Student");

        // 类的名称 String   com.com.itheima02.Student
        System.out.println(clazz.getName());

        // 反射构造函数
        // 反射所有的public构造函数
        Constructor[] constructors = clazz.getConstructors();
        System.out.println("-----------反射所有public构造函数----------");
        for (Constructor constructor: constructors) {
            System.out.println(constructor);
        }

        // 反射所有构造方法
        Constructor[] constructors1 = clazz.getDeclaredConstructors();
        System.out.println("-----------反射所有构造函数----------");
        for (Constructor constructor: constructors1) {
            System.out.println(constructor);
        }

        // 反射public, 无参数构造方法
        Constructor constructor2 = clazz.getDeclaredConstructor(null);
        System.out.println("-----------反射public无参数构造函数----------");
        System.out.println(constructor2);

        // 反射指定参数的构造函数
        // 必须传入指定类型的.class文件
        Constructor constructor3 = clazz.getDeclaredConstructor(String.class);
        System.out.println(constructor3);

        // 调用反射的构造方法
        System.out.println("反射私有属性构造方法, 设置public权限");
        Constructor constructor4 = clazz.getDeclaredConstructor(Object.class);
        // 修改私有构造方法属性 private变为public
        constructor4.setAccessible(true);
        // 创建实例对象
        constructor4.newInstance("xukechen");

        // 反射所有成员变量
        System.out.println("反射所有成员变量");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field: fields) {
            System.out.println(field);
        }

        // 反射public成员变量
        System.out.println("反射public成员变量");
        Field[] fields1 = clazz.getFields();
        System.out.println(fields1[0]);

        // 反射指定成员变量
        System.out.println("反射指定成员变量");
        Field field = clazz.getDeclaredField("name");
        System.out.println(field);

        // 给成员变量赋值
        Object obj = clazz.getConstructor().newInstance();
        field.setAccessible(true);
        field.set(obj, "XKC");
        Student student  = (Student)obj;
        System.out.println(student.getName());

        // 反射所有public成员方法并调用
        Method[] methods = clazz.getMethods();
        System.out.println("反射所有public成员方法");
        for (Method method: methods) {
            System.out.println(method);
        }

        // 反射全部成员方法, 不包括继承的方法
        Method[] methods2 = clazz.getDeclaredMethods();
        System.out.println("反射所有成员方法");
        for (Method method: methods2) {
            System.out.println(method);
        }

        // 反射指定方法
        Method method = clazz.getDeclaredMethod("send", String.class);
        Student student1 = (Student)(clazz.getConstructor().newInstance());
        // 调用格式  method.invoke(Obj, args)
        System.out.println("调用反射的方法");
        method.invoke(student1, "徐大王");
    }

}
