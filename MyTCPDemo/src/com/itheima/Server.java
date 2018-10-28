package com.itheima;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 接收数据:
 *      1.创建Socket对象
 *      2.阻塞, 监听, 等待连接
 *      3.输入流接收数据
 *      4.解析数据
 */

public class Server {
    public static void main(String[] args) throws IOException {
        // 创建服务端套接字
        ServerSocket s = new ServerSocket(8888);

        // 获得socket对象
        Socket socket = s.accept();

        // 获得输入流对象
        InputStream is = socket.getInputStream();

        // 读取数据
        byte[] bytes = new byte[1024];
        int len;
        len = is.read(bytes);

        System.out.println(new String(bytes).trim());

        // 转换数据
        String result = new String(bytes).trim().toUpperCase();

        // 向客户端发送给数据
        OutputStream os = socket.getOutputStream();
        os.write(result.getBytes());

        System.out.println(socket.getInetAddress().getHostName());

        is.close();
        socket.close();
//        s.close();
    }
}
