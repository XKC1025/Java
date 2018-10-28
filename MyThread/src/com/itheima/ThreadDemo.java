package com.itheima;

/**
 * 创建线程的方式:
 *      1.继承Thread, 重写run方法
 *      2.实现Runnable接口, 重写run方法
 */

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("MyThread" + getName() + "--->" + i);

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("MyThread" + Thread.currentThread().getName() + "--->" + i);

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();

        myThread.setName("张三");
//        myThread.start();

        myThread1.setName("李四");
//        myThread1.start();

        MyThread1 myThread11 = new MyThread1();
        MyThread1 myThread12 = new MyThread1();

        Thread t1 = new Thread(myThread11);
        t1.setName("AAA");
        t1.start();
        new Thread(myThread12).start();

    }
}
