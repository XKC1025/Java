package com.itheima01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * UDP接收数据:
 *      1.创建Socket
 *      2.接收DatagramPacket
 *      3.解析数据
 */

public class UDPRecvDemo {
    public static void main(String[] args) throws IOException {
        // 创建Socket对象, 指定端口号
        DatagramSocket datagramSocket = new DatagramSocket(8888);

        // 创建接收数据容器
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);

        // 接收数据, 保存到接收数据包对象中
        // 处于阻塞状态
        System.out.println("Before");
        datagramSocket.receive(datagramPacket);
        System.out.println("After");

        InetAddress inetAddress = datagramPacket.getAddress();
        System.out.println(inetAddress.toString());

        int length = datagramPacket.getLength();
        System.out.println(length);

        byte[] bys = datagramPacket.getData();
        System.out.println(new String(bys).trim());

        System.out.println(datagramPacket.getAddress().getHostName());

        datagramSocket.close();
    }
}
