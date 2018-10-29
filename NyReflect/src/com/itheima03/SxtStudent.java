package com.itheima03;


@Table("tb_student")
public class SxtStudent {
    @SxtField(column = "id", type = "int", length = 10)
    private int id;
    @SxtField(column = "sName", type = "varchar", length = 10)
    private String studentName;
    @SxtField(column = "age", type = "int", length = 3)
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return studentName;
    }

    public void setName(String name) {
        this.studentName = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
