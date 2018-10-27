package com.itheima02;

/**
 * 数据的换行
 *
 */

import java.io.FileWriter;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
        // 追加写入
        FileWriter fw = new FileWriter("b.txt", true);

        for (int i = 0; i < 10; i++) {
            // 换行, windows系统有可能不换行
            fw.write("hello" + i + "\n");
        }

        fw.close();
    }
}
