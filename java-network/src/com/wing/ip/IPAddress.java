package com.wing.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author memory125
 */
public class IPAddress {
    public static void main(String[] args) throws UnknownHostException {
        // 获取本机的IP地址
        InetAddress localhost = InetAddress.getByName("localhost");
        System.out.println(localhost);

        // 获取网站的IP地址
        InetAddress tenCent = InetAddress.getByName("www.tencent.com");
        System.out.println(tenCent);

        // 常用的方法
        System.out.println("HostAddress: " + tenCent.getHostAddress());
        System.out.println("HostName: " + tenCent.getHostName());
        System.out.println("Address: " + tenCent.getAddress());
        System.out.println("CanonicalHostName: " + tenCent.getCanonicalHostName());
    }
}
