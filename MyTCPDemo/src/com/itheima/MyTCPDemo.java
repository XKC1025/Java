package com.itheima;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 创建Socket对象:  Socket
 *
 *
 */

public class MyTCPDemo {
    public static void main(String[] args) throws IOException {
        //Socket(InetAddress address, int port)
        Socket s = new Socket(InetAddress.getByName("xukechen"), 8888);

        // 获取输出流
        OutputStream os = s.getOutputStream();

        // 发送数据
        String msg = "Hello, TCP! I'm coming";
        os.write(msg.getBytes());

        // 获得输入流
        InputStream inputStream = s.getInputStream();
        byte[] bytes = new byte[1024];
        inputStream.read(bytes);

        System.out.println(new String(bytes).trim());

        os.close();
        s.close();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }
}
