package com.itheima01;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        File parent = new File("b");
        File file = new File(parent,"b.txt");

        if (!parent.exists()) {
            parent.mkdirs();
            file.createNewFile();
        }

        // 获取绝对路径, 返回的是File对象
        System.out.println(file.getAbsoluteFile());

        // 获取父路径  构造方法是File(String father, String child)
        System.out.println(file.getParent());
        System.out.println(file.getParentFile());

        // 获取文件名 / 目录名
        System.out.println(parent.getName());

        // 获取路径, 返回创建文件对象时指定的路径
        System.out.println(file.getPath());

        // 返回最近修改的时间戳
        System.out.println(file.lastModified());
        Date date = new Date(file.lastModified());
        System.out.println(date);

        // 返回文件字节数
        System.out.println(file.length());

        // renameTo()  重命名文件
        file.renameTo(new File("b/a.txt"));
        parent.renameTo(new File("a"));
    }
}
