package com.itheima01;

import java.io.*;

/**
 * 标准输入流:
 *      System.in   字节输入流, 读取键盘输入的数据
 *
 * 标准输出流:
 *      System.out  字节输出流, 打印数据到控制台
 */

public class MyIODemo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/itheima01/MyIODemo"));

//        OutputStream os = new System.out;

        String line;
        while ((bufferedReader.readLine()) != null) {
//            os.write(line.getBytes());
        }
    }
}
