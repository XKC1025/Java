package com.itheima06;

/**
 * 共性：
 *      属性
 *      行为
 *
 */

public class AbstractDemo1 {
    public static void main(String[] args) {
        BasicTeacher basic = new BasicTeacher();
        basic.name = "XKC";

        basic.teach();

        JobTeacher job = new JobTeacher();
        job.name = "ZJ";

        job.teach();

    }
}

abstract class Teacher {
    String name;
    int age;
    String gneder;

    // 不同的实现
    abstract public void teach();
}

class BasicTeacher extends Teacher {
    @Override
    public void teach() {
        System.out.println(name + "基础课程");
    }
}

class JobTeacher extends Teacher {
    @Override
    public void teach() {
        System.out.println(name + "就业课程");
    }
}

