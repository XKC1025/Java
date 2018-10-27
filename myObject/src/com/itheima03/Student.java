package com.itheima03;

public class Student {
    private String name = "XKC";
    private int age = 22;

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            System.out.println("Age value Error");
        } else {
            this.age = age;
        }

    }

    public void setName(String name) {
        // 默认取的是成员变量name, 就近原则, 不是取的传入的局部变量name
        // name = name;

        // 用this分辨同名的成员变量
        this.name = name;        // this.name指定的是成员变量name,   传入的局部变量name就赋值给成员变量
    }

    public void getAge() {
        System.out.println(age);
    }

    /**
     *
     * @return
     */
    public String getName() {
        return switchCase(name);
    }

    /**
     *
     * @param name
     * @return
     */
    private static String switchCase(String name) {
        return name.toUpperCase();
    }
}
