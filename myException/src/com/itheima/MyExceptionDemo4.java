package com.itheima;

import java.io.FileWriter;
import java.io.IOException;

public class MyExceptionDemo4 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            System.out.println(10 / 0);

            fileWriter = new FileWriter("a.txt");
            fileWriter.write("hello\n");
            fileWriter.write("java");
            System.out.println(10 / 0);
            fileWriter.write("test\n");

            fileWriter.close();
        } catch(ArithmeticException e) {
            System.out.println("除零错误");
        } catch(IOException e) {
            System.out.println("IO错误");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
                // if (fileWriter != null) { fileWriter.close() }
            } catch(NullPointerException e) {
                System.out.println("空指针异常");
            } catch(IOException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Write Over!");
            }
        }

    }
}
