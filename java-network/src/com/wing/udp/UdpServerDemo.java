package com.wing.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author memory125
 */
public class UdpServerDemo {
    public static void main(String[] args) throws IOException {
        // 1. 创建socket
        DatagramSocket socket = new DatagramSocket(6666);

        // 2. 接受数据包
        byte[] buffer = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buffer, 0, buffer.length);
        // 阻塞接收
        socket.receive(datagramPacket);

        // 输出接收到的信息
        // 1. 数据包发送方主机的地址
        System.out.println(datagramPacket.getAddress().getHostAddress());
        // 2. 数据包发送方套接字地址
        System.out.println(datagramPacket.getSocketAddress());
        // 3. 接收到的数据内容
        System.out.println(new String(datagramPacket.getData(), 0, datagramPacket.getLength()));
        System.out.println(new String(datagramPacket.getData()));

        // 4. 关闭资源
        socket.close();
    }
}
