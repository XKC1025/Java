package com.itheima02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 元注解, 注解的注解
 *      1.@Target       注解的适用范围:
 *                          PACKAGE(包)          TYPE(类 接口 枚举 AnnotationDemo)
 *                          CONSTRUCTOR(构造器)   FILED(属性)   METHOD(方法)
 *                          LOCAL_VARIABLE(局部变量)  PARAMETER(参数)
 *
 *      2.@Retention   表示保留级别:
 *                          SOURCE(源文件中有效)
 *                          CLASS(class文件中有效)
 *                          RUNTIME(运行时有效, 可以被反射读取)
 *      3.@Document
 *      4.Inherrited
 */

@Target(value={ElementType.METHOD, ElementType.TYPE})
@Retention(value= RetentionPolicy.RUNTIME)
@SuppressWarnings("all")
public @interface MyAnnotationDemo01 {
    String studentName() default "xukechen";
    int age() default 22;

    String[] schools() default {"NJIT", "ZJ"};
}
