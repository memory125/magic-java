package com.wing.chat.udp.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author memory125
 */
public class UdpClient {
    public static void main(String[] args) throws IOException {
        // 1. 创建socket
        DatagramSocket socket = new DatagramSocket(7777);

        // 2. 准备数据，控制台输入System.in
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            // 获取控制台输入的数据
            String readLine = bufferedReader.readLine();

            // 发送
            InetAddress localhost = InetAddress.getByName("localhost");
            int port = 9999;

            // 数据，数据的长度起始，要发送到哪
            DatagramPacket datagramPacket = new DatagramPacket(readLine.getBytes(), 0, readLine.getBytes().length, localhost, port);

            // 3. 发送包
            socket.send(datagramPacket);

            if (readLine.equals("Bye")) {
                break;
            }
        }

        // 4. 关闭资源
        socket.close();
    }
}
