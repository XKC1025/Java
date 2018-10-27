package com.itheima01;

/**
 * 写文件:  FileWriter
 *
 * 1.创建输出流对象
 * 2.调用输出流对象的写数据的方法
 * 3.释放资源
 *
 * 创建输出流：
 *      1.调用系统资源创建一个文件
 *      2.创建输出流对象
 *      3.输出流对象指向文件
 *
 * 调用写数据方法：
 *      writer.write("IOStream你好!");
 *      writer.flush();
 *
 * 释放资源：
 *      writer.close();
 *
 */

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    // 抛出异常
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("test.txt");

        //
        writer.write("IOStream你好!");

        // 数据是按字节写入文件的, 字符串没有写入文件, 调用flush刷到硬盘上
        // 写的数据过多时, 使用flush(), 很少时, 使用close()也可以刷新缓冲区
        writer.flush();

        // 通知系统, 关闭文件句柄, 释放资源
        writer.close();
    }
}
