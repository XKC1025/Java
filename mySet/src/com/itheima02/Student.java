package com.itheima02;

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
        Student obj = (Student) object;
        System.out.println("equals");
        return (this.getName() + this.getAge()).hashCode() == (obj.getName() + obj.getAge()).hashCode() ;
    }


    @Override
    public int hashCode() {
        int res = age + getName().hashCode();
        return res;
    }
}
