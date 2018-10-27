package com.itheima05;

public class Teacher {
    public void test(Student student) {
        System.out.println("Teacher开始检查");
        student.study();
    }

    public Student getStudent() {
        return new Student();
    }
}
