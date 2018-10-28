package com.itheima01;

import java.io.*;

/**
 * IO流分类:
 *      1.输入流  读取文件数据  FileReader
 *      2.输出流  写入文件数据  FileWriter
 *
 *
 *      字节流:
 *              字节输入流  读取数据 InputStream
 *              字节输出流  写出数据 OutputStream
 *      字符流:
 *              字符输入流          Reader
 *              字符输出流          Writer
 *
 *
 */

public class MyIODemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("image.jpg");
        FileWriter fw = new FileWriter("image_copy.jpg");

        // 字符流读取数组数据
        // 复制的媒体文件不能打开
        int len;
        char[] chs = new char[1024];
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs, 0, len);
            fw.flush();
        }

        fw.close();
        fr.close();

        // 字节流读取字节数组数据
        FileInputStream is = new FileInputStream("image.jpg");
        FileOutputStream os = new FileOutputStream("image_copy2.jpg");

        int size;
        byte[] bys = new byte[1024];

        while ((size = is.read(bys)) != -1) {
            os.write(bys, 0, size);
            os.flush();
        }

        is.close();
        os.close();
    }
}
