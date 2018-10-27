package com.itheima01;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/xukechen/MyFile/.txt");

        System.out.println(file.createNewFile());

        // 判断文件/目录是否存在  boolean exists()
        System.out.println(file.exists());

        // 获取文件的绝对路径, 返回的是String
        System.out.println(file.getAbsolutePath());

        // 判断路径是否是绝对路径
        System.out.println(file.isAbsolute());

        // 判断是否文件/目录
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        // 判断是否隐藏文件
        System.out.println(file.isHidden());
    }
}
