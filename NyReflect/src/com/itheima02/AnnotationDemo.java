package com.itheima02;

import java.util.Date;

/**
 * AnnotationDemo: 注解
 * 1.对程序进行解释
 * 2.被其他程序读取, 注解信息处理流程
 * <p>
 * 注解格式:
 *
 * @interface {
 * String name() default "default";
 * int age();
 * }
 * <p>
 * 注解的使用场景:
 * 包, 类, 方法, 属性等, 添加额外的辅助信息, 通过反射对元数据进行访问
 */

// @SuppressWarnings(value={"all", "unused", "unchecked"})

@SuppressWarnings(value = "all")
public class AnnotationDemo {
    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public static void test() {
        System.out.println("Test");
    }

    @MyAnnotationDemo01(age = 22, studentName = "XKC", schools = {"PXZX", "NJIT"})
    public static void main(String[] args) {
        Date date = new Date();
//        date.parse("2018-10-30");

        test();

    }
}
