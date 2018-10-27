package com.itheima05;

/**
 * 传入实例对象
 *
 * 返回实例对象
 *
 */

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();

        teacher.test(student);

        // 可以调用方法, 返回一个实例对象
        Student student2 = teacher.getStudent();
        student2.study();

        Random r = new Random();
        int res = r.nextInt(10);

        System.out.println(res);
    }
}
