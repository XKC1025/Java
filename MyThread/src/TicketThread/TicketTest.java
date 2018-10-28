package TicketThread;

/**
 * synchronized: 同步, 可以修饰代码块&方法, 多线程中任意一时刻只有一个线程使用共享内存
 *
 * synchronized (CLOCK) {
 *      statements;
 * }
 * 锁对象被所有线程共享, 安全性高, 效率低
 *
 * synchronized 修饰非静态方法, 默认的锁对象this
 *              修饰的静态方法, 默认的锁是当前类的字节码对象
 *
 */

public class TicketTest {
    public static void main(String[] args) throws InterruptedException {
        TicketThread ticketThread = new TicketThread();

        Thread thread1 = new Thread(ticketThread);
        thread1.setName("窗口1");
        Thread thread2 = new Thread(ticketThread);
        thread2.setName("窗口2");
        Thread thread3 = new Thread(ticketThread);
        thread3.setName("窗口3");
        Thread thread4 = new Thread(ticketThread);
        thread4.setName("窗口4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
