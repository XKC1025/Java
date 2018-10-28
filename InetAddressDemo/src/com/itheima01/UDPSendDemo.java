package com.itheima01;

import java.io.IOException;
import java.net.*;

/**
 * DatagramSocket
 * <p>
 * UDP发送数据:
 * 1.创建Socket对象
 * 2.创建数据并打包
 * 3.释放资源
 */

public class UDPSendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();

        String msg = "Hello UDP, I\"m coming";
        byte[] bytes = msg.getBytes();

        // 构造数据包
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("xukechen"), 8888);

        // 发送数据
        datagramSocket.send(datagramPacket);

        datagramSocket.close();

        System.out.println("Send Over");
    }
}
