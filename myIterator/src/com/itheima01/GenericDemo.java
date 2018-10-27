package com.itheima01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 使用集合存储自定义对象并遍历
 *
 * 集合可以存储任意类型的对象, 在转换的时候出现类型转换异常
 *
 * 泛型: 一种广泛的类型容器, 编译时明确数据类型, 借鉴了数组的特点
 *      1.有效的避免数据类型转换的错误
 *      2.简化代码的书写
 *
 * 使用场景:
 *      APi/源码中有  <E>  就可以使用泛型
 *
 */

public class GenericDemo {
    public static void main(String[] args) {
        // 创建泛型集合对象
        Collection<Student> collection = new ArrayList<Student>();

        // 添加对象
        collection.add(new Student("XKC", 22));
        collection.add(new Student("ZJ", 22));

        Iterator<Student> iterator = collection.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.getName());
        }
    }
}

class Student {
    private String name;
    private int age;

    public Student() {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
