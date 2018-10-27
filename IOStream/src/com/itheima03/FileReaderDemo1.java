package com.itheima03;


import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {
    public static void main(String[] args) throws IOException {
        // 创建读文件对象
        FileReader fr = new FileReader("b.txt");

        // 调用读方法, int read()  一次只读取一个字符
        System.out.print((char)fr.read());

        // 继续往下读一个字符
        System.out.print((char)fr.read());

        // 读取的返回值返回 -1, 表示读取结束
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char)ch);
        }

        fr.close();
    }
}
