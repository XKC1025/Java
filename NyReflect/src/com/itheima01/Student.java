package com.itheima01;

public class Student {
    public String PhoneNum;
    private String name;
    protected int age;
    char sex;

    static {
        System.out.println("static代码块");
    }

    public Student() {}

    public Student(boolean b) {}

    protected Student(String name) {
        this.name = name;
    }

    Student(int age) {
        this.age = age;
    }

    private Student(Object obj) {
        this.name = (String)obj;
        System.out.println(getName());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void send(String string) {
        System.out.println(string);
    }

    private static void function(String string) {
        System.out.println(string);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
