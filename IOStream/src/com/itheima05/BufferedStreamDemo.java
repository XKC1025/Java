package com.itheima05;

import java.io.*;

/**
 *
 * 缓冲流的特殊功能:
 *      void newline();      写换行符, 由系统决定
 *
 *      String readLine();   读取一行, 不读取换行符
 *
 */

public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("b.txt", true));
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.write("I love Java!");
        bufferedWriter.newLine();
        bufferedWriter.newLine();

        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("b.txt"));

        String str = null;
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
        }

        bufferedReader.close();

        int a = 300;
//        byte b = (byte)a;
        byte b = 10;

//        b = (byte)(a + b);
        b += a;

        System.out.println(b);

    }
}
