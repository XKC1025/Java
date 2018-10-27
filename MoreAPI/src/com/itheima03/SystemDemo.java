package com.itheima03;

import java.io.Console;

/**
 * System:
 *
 */

public class SystemDemo {
    public static void main(String[] args) {
        // public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = new int[10];

        System.arraycopy(src, 1, dest, 5, 3);

        for (int item: dest) {
            System.out.println(item);
        }

        // 终止正在运行的虚拟机,  0正常退出   非0异常退出
        // System.exit(1);

        // 返回当前系统时间, 毫秒     时间戳
        System.out.println(System.currentTimeMillis());

        // JVM回收垃圾
        new Demo();
        System.gc();

    }

}


class Demo {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("回收");
    }
}
