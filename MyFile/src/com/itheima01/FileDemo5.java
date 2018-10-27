package com.itheima01;

import java.io.File;

public class FileDemo5 {
    public static void function(File file) {
        for (File f: file.listFiles()) {
            if (f.isFile()) {
                if (f.getName().endsWith("java")) {
                    System.out.println(f);
                }
            } else if (f.isDirectory()) {
                function(f);
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("/home/xukechen/JAVA");

        function(file);
    }
}
