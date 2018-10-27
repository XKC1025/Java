package com.itheima01;

import java.io.File;
import java.io.IOException;

/**
 * 文件&目录路径名的抽象表示形式, 类的实例不可改变
 *
 */

public class FileDemo {
    public static void main(String[] args) throws IOException {
        //File File(String pathname)  给定指定路径名, 表示一个文件
        File file = new File("a/b");

        // boolean createNewFile()  创建不存在的文件
//        System.out.println(file.createNewFile());

        // boolean mkdir()  创建文件夹
        // boolean mkdirs() 递归创建文件夹
//        System.out.println(file.mkdirs());
//        System.out.println(file.createNewFile());


        // boolean delete()  删除文件/目录
        // 删除目录是删除最后一级的空目录, 不能删除非空目录
        // 删除文件是删除指定路径上的文件
        System.out.println(file.delete());
    }
}
