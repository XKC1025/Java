package com.itheima01;

/**
 * 对象数组, 一个数组内保存了多个对象的引用
 */

public class StudentDemo {
    public static void main(String[] args) {
        Student[] stuArr = new Student[10];

        for (int i = 0; i < stuArr.length; i++) {
            Student student = new Student("XKC" + i, 22);
            stuArr[i] = student;
        }

        for (Student stu: stuArr) {
            System.out.println(stu.getName() + "---" + stu.getAge());
        }
    }
}
