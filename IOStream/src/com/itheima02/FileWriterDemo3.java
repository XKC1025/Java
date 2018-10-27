package com.itheima02;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("a.txt");

        fw.write("Hello");

        // len: 3 长度
        fw.write("abcde", 1, 3);

        // 写入'A'

        char[] chs = {'A', 'B', 'C', 'D'};
        fw.write(chs);

        fw.write(chs, 0, 4);


        fw.close();
    }
}
