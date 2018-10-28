package com.itheima01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress inetAddress = InetAddress.getByName("xukechen");
        InetAddress inetAddress = InetAddress.getByName("192.168.0.103");
        System.out.println(inetAddress);

        String hostAddress = inetAddress.getHostAddress();
        System.out.println(hostAddress);

        String hostName = inetAddress.getHostName();
        System.out.println(hostName);

    }
}
