package com.wing.chat.multithread.receiver;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author memory125
 */
public class UdpReceiver implements Runnable {
    // 数据包套接字
    DatagramSocket socket = null;
    // 发送方名称
    String fromName;
    // 端口
    private int port;

    public UdpReceiver(int port, String fromName) {
        this.port = port;
        this.fromName = fromName;
        // 1. 创建socket
        try {
            socket = new DatagramSocket(this.port);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                // 接收数据包
                byte[] buffer = new byte[1024];
                DatagramPacket datagramPacket = new DatagramPacket(buffer, 0, buffer.length);
                // 阻塞接收
                socket.receive(datagramPacket);
                // 整理收到的数据
                String dataString = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
                // 输出接收到的信息
                System.out.println(this.fromName + ":" + dataString);

                if (dataString.equals("Bye")) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // 关闭资源
        socket.close();
    }
}
