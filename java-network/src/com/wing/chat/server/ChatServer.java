package com.wing.chat.server;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author memory125
 */
public class ChatServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;

        try {
            // 1. 根据端口创建服务端的地址
            serverSocket = new ServerSocket(8888);
            while (true) {
                // 2. 等待客户端连接
                socket = serverSocket.accept();
                // 3. 读取客户端消息
                inputStream = socket.getInputStream();

                // 4. 读取数据
                /*
                    byte[] buffer = new byte[1024];
                    int len;
                    while ((len = inputStream.read(buffer)) != -1) {
                        String msg = new String(buffer, 0, len);
                        System.out.println(msg);
                    }
                 */
                // 管道流
                byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int len;
                while ((len = inputStream.read(buffer)) != -1) {
                    byteArrayOutputStream.write(buffer, 0, len);
                }

                System.out.println(byteArrayOutputStream.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            // byteArrayOutputStream
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            // inputStream
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            // socket
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            // serverSocket
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}
