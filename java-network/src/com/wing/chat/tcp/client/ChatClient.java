package com.wing.chat.tcp.client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @author memory125
 */
public class ChatClient {
    public static void main(String[] args) {
        InetAddress serverIP = null;
        int port = 8888;
        Socket socketClient = null;
        OutputStream outputStream = null;
//        Scanner scanner = null;
//        String msg = null;

        // 获取服务端的地址和端口
        try {
            serverIP = InetAddress.getByName("localhost");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

//         scanner = new Scanner(System.in);
        // 创建socket连接
        try {
            socketClient = new Socket(serverIP, port);
            outputStream = socketClient.getOutputStream();

            //while (scanner.hasNext()) {
             //    msg = scanner.nextLine();
                 outputStream.write("聊天程序！！！！！！！！！！".getBytes());
            //    System.out.println(msg);
           // }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            // outputStream
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            // scanner
//            if (scanner != null) {
//                scanner.close();
//            }

            // socketClient
            if (socketClient != null) {
                try {
                    socketClient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
