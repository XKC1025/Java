package com.itheima02;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<Student>();

        for (int i = 0; i < 10; i++) {
            set.add(new Student("name" + 22, 22));
        }

        for (Student stu: set) {
            System.out.println(stu.getName() + " : age : " + stu.getAge());
        }

        for (Student stu: set) {
            System.out.println(stu);
        }

        Set<String> set2 = new HashSet<>();

        set2.add("java");
        set2.add("java");

        for (String str: set2) {
            System.out.println(str);
        }

        Student student = new Student("java", 22);
        Student student2 = new Student("java", 22);

        if (student.equals(student2)) {
            System.out.println("相等");
        }
    }
}
