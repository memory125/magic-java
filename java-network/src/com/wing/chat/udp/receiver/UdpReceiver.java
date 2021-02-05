package com.wing.chat.udp.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author memory125
 */
public class UdpReceiver {
    public static void main(String[] args) throws IOException {
        // 1. 创建socket
        DatagramSocket socket = new DatagramSocket(9999);
        
        while (true) {
            // 接收数据包
            byte[] buffer = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(buffer, 0, buffer.length);
            // 阻塞接收
            socket.receive(datagramPacket);
            // 整理收到的数据
            String dataString = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
            // 输出接收到的信息
            System.out.println(dataString);

            if (dataString.equals("Bye")) {
                break;
            }
        }

        // 4. 关闭资源
        socket.close();
    }
}
