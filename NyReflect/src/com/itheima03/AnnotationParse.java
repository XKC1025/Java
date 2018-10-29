package com.itheima03;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 使用反射读取注解信息
 *
 */

public class AnnotationParse {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class clazz = Class.forName("com.itheima03.SxtStudent");

        // 获取类的全部注解信息
        Annotation[] annotations = clazz.getAnnotations();

        for (Annotation annotation: annotations) {
            System.out.println(annotation.toString());
        }

        // 获取类的指定注解
        Table table = (Table) clazz.getAnnotation(Table.class);
        System.out.println(table.value());

        // 获取类指定属性注解
        Field field = clazz.getDeclaredField("studentName");
        SxtField sxtField = field.getAnnotation(SxtField.class);

        System.out.println(sxtField.column());
        System.out.println(sxtField.type());
        System.out.println(sxtField.length());

        Field[] fields = clazz.getDeclaredFields();
        for (Field field1: fields) {
            SxtField sxtField1 = field1.getAnnotation(SxtField.class);

            System.out.println(sxtField1.column());
            System.out.println(sxtField1.type());
            System.out.println(sxtField1.length());
        }

//        for (Annotation annotation: annotations1) {
//            System.out.println(annotation.toString());
//        }
    }
}
