package com.itheima04;

import java.io.*;

/**
 * 缓冲流:
 *      BufferedWriter: 将文本写入字符输出流, 缓冲各个字符, 从而提供单个字符串, 数组和字符串的高效写入
 *      BufferedReader: 从字符输出流中读取文本, 缓冲各个字符, 从而实现各个字符, 数组和行的高效读取
 *
 * 缓冲流效率高, 读写文件使用缓冲流
 *
 */

public class BufferedString {
    public static void main(String[] args) throws IOException {
        // 创建输出缓冲流对象
        // 传入的是Writer对象, FileWriter继承的是Writer
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("b.txt"));

        bufferedWriter.write("Hello, World!");

        bufferedWriter.flush();
        bufferedWriter.close();


        // 创建输入缓冲流
        BufferedReader bufferedReader = new BufferedReader(new FileReader("b.txt"));

        // 读取单个字符
//        int ch;
//        while ((ch = bufferedReader.read()) != -1) {
//            System.out.print((char)ch);
//        }

        // 读取数组数据
        int len;
        char[] chs = new char[5];
        while ((len = bufferedReader.read(chs)) != -1) {
            System.out.print(new String(chs, 0, len));
        }

        bufferedReader.close();

    }
}
