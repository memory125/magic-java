package com.wing.ip;

import java.net.InetSocketAddress;

/**
 * @author memory125
 */
public class SocketAddress {
    public static void main(String[] args) {
        // 创建socket对象
        InetSocketAddress inetSocketAddress = new InetSocketAddress("www.baidu.com", 8080);
        System.out.println(inetSocketAddress);

        System.out.println(inetSocketAddress.getAddress());
        System.out.println(inetSocketAddress.getHostName());
        System.out.println(inetSocketAddress.getHostString());
        System.out.println(inetSocketAddress.getPort());
    }
}
