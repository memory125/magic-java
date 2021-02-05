package com.wing.chat.multithread.sender;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author memory125
 */
public class UdpSender implements Runnable {
    // 数据包套接字
    DatagramSocket socket = null;
    // 数据源
    BufferedReader bufferedReader = null;
    // 发出端口
    private int fromPort;
    // 目标主机
    private String hostName;
    // 目标端口
    private int toPort;

    public UdpSender(int fromPort, String hostName, int toPort) {
        this.fromPort = fromPort;
        this.hostName = hostName;
        this.toPort = toPort;

        try {
            // 1. 创建socket
            socket = new DatagramSocket(this.fromPort);
            // 2. 准备数据，控制台输入System.in
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                // 获取控制台输入的数据
                String readLine = bufferedReader.readLine();

                // 发送
                InetAddress localhost = InetAddress.getByName(this.hostName);

                // 数据，数据的长度起始，要发送到哪
                DatagramPacket datagramPacket = new DatagramPacket(readLine.getBytes(), 0, readLine.getBytes().length, localhost, this.toPort);

                // 3. 发送包
                socket.send(datagramPacket);

                if (readLine.equals("Bye")) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // 4. 关闭资源
        socket.close();
    }
}
