package com.itheima03;

import java.io.FileReader;
import java.io.IOException;

/**
 * 读取一个数组长度的数据
 */

public class FileReaderDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("b.txt");

        char[] chs = new char[10];

        // 读取指定长度到数组中, 返回实际读取的字符个数
        // 下一次读取的字符会覆盖上一次读取的数据, 若不足5个, 上一次最后的数据并没有消失
        int length = fr.read(chs);
        System.out.println(chs[0]);

        // 只使用读取的字符, 排除上次遗留的字符
        String str = new String(chs, 0, length);
        System.out.println(str);
        System.out.println(length);

        fr.close();

        // 实际读取长度为 -1 的时候, 读取完毕
        FileReader reader = new FileReader("b.txt");

        int len2;
        // 每次读取1024个字符及其整数倍
        char[] chars = new char[1024];

        while ((len2 = reader.read(chars)) != -1) {
            String string = new String(chars, 0, len2);
            System.out.print(string);
        }

        reader.close();

    }
}
