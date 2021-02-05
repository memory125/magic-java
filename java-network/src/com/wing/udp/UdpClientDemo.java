package com.wing.udp;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

/**
 * @author memory125
 */
public class UdpClientDemo {
    public static void main(String[] args) throws IOException {
        // 1. 创建socket
        DatagramSocket socket = new DatagramSocket();

        // 2. 创建包
        String msg = "Hello! This is the data packet!";

        // 发送
        InetAddress localhost = InetAddress.getByName("localhost");
        int port = 6666;

        // 数据，数据的长度起始，要发送到哪
        DatagramPacket datagramPacket = new DatagramPacket(msg.getBytes(), 0, msg.getBytes().length, localhost, port);

        // 3. 发送包
        socket.send(datagramPacket);

        // 4. 关闭资源
        socket.close();
    }
}
