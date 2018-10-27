package com.itheima01;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        File file = new File("a");

        // String[] list()  // 返回文件夹下的文件列表
        String[] lines = file.list();

        for (String string: lines) {
            System.out.println(string);
        }

        // File[] listFiles()
        File[] files = file.listFiles();

        for (File f: files) {
            System.out.println(f);
        }

        // static File[] listRoots()  返回所有盘符
        File[] files1 = File.listRoots();
        System.out.println(files1.length);

        for (File file1: files1) {
            System.out.println(file1);
        }

    }
}
