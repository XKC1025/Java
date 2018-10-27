package com.itheima03;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManger {
    public static void main(String[] args) {
        ArrayList<Student> stuArr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        boolean flag = true;

        while (flag) {
            System.out.println("---------学生管理系统---------");
            System.out.println("1.查询全部学生");
            System.out.println("2.添加学生");
            System.out.println("3.修改学生");
            System.out.println("4.删除学生");
            System.out.println("5.退出");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    showAll(stuArr);
                    break;
                case 2:
                    addStudent(stuArr);
                    break;
                case 3:
                    modify(stuArr);
                    break;
                case 4:
//                    delete(stuArr);
                    break;
                case 5: default:
                    System.out.println("退出");
                    System.exit(0);

            }

        }

    }



    public static void modify(ArrayList<Student> arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("修改的学生学号: ");
        String id = sc.nextLine();
        Student s = null;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId().equals(id)) {
                s = arr.get(i);
            }
        }

        if (s != null) {
            System.out.println("修改");
        }
    }

    public static void addStudent(ArrayList<Student> arr) {
        Scanner sc = new Scanner(System.in);
        String id;

        while (true) {
            System.out.println("请输入学号");
            id = sc.nextLine();

            boolean flag = false;
            for (int i = 0; i < arr.size(); i++) {
                Student s = arr.get(i);

                if (id.equals(s.getId())) {
                    flag = true;
                    break;
                }
            }

            // 找到了
            if (flag) {
                System.out.println("学号重复!");
            } else {
                break;
            }
        }

        System.out.println("姓名： ");
        String name = sc.nextLine();
        System.out.println("年龄： ");
        String age = sc.nextLine();
        System.out.println("住址： ");
        String address = sc.nextLine();

        Student stu = new Student(id, name, age, address);
        arr.add(stu);

    }

    public static void showAll(ArrayList<Student> arr) {
        if (arr.size() == 0) {
            System.out.println("没有任何学生信息");
            return;
        }

        for (int i = 0; i < arr.size(); i++) {
            Student s = arr.get(i);
            System.out.println(s.getId() + "   " + s.getName());
        }
    }
}
