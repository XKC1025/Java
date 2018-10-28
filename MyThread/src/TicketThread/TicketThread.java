package TicketThread;

public class TicketThread implements Runnable {
    static boolean flag = true;
    static int tickets = 10000;
    Object obj = new Object();

    private synchronized static void method() {
        if (tickets > 0) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()  + " : " + tickets--);
        } else {
            flag = false;
        }
    }

    @Override
    public void run() {
        // 出售火车票
        while (flag) {

                method();

        }

    }
}
