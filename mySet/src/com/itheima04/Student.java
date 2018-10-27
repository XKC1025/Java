package com.itheima04;

public class Student {
    private String name;
    private int age;

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object!= null && object.getClass() == Student.class) {
            Student student = (Student) object;
            if (this.getAge() == student.getAge() && this.getName() == student.getName()) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}
