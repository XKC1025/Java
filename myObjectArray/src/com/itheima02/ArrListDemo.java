package com.itheima02;

/**
 * 集合类:
 *      容器类型, 保存对象引用, 容量可变
 *
 * 数组也可以保存对象的引用, 但是数组的长度是固定的, 不能动态的扩展容量, 引入了集合类
 *
 * ArrayList<E>:  容量可变数组的实现, <E>是一种的特殊的数据类型, 泛型
 *
 * ArrayList<Student>: 保存了Student实例的引用, 容量可变
 *
 * 构造方法:
 *      ArrayList<E> array = new ArrayList<E>();   注意new出的对象也要带有E
 *
 */

import java.util.ArrayList;

public class ArrListDemo {
    public static void main(String[] args) {
        // 创建泛型
        ArrayList<StudentClass> studentArrayList = new ArrayList<StudentClass>();

        // [], 集合底层对内存地址进行处理
        System.out.println(studentArrayList);

        // 添加元素
        for (int i = 0; i < 20; i++) {
            StudentClass student = new StudentClass("XKC" + i, i);
            studentArrayList.add(student);
        }

        System.out.println(studentArrayList.get(19).getName());


        ArrayList<String> strList = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            strList.add(0, "string" + i);
        }

        System.out.println(strList);

        // 按索引取值
        System.out.println(strList.get(0));
        // 返回list元素的个数
        System.out.println(strList.size());

        // 删除元素, 有元素返回true, 没有指定元素返回false
        String ss = strList.remove(0);
        strList.remove("string1");
        System.out.println(strList.get(0));
        System.out.println(ss);

        // 修改元素
        String str = strList.set(0, "String8");
        // 返回原来的元素
        System.out.println(str);
        System.out.println(strList.get(0));

        System.out.println("==================");

        for (int i = 0; i < strList.size(); i++) {
            String s = strList.get(i);
            System.out.println(s);
        }

    }
}
