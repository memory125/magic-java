package com.wing.upload.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author memory125
 */
public class FileServer {
    public static void main(String[] args) throws Exception {
        // 1. 根据端口创建服务端的地址
        ServerSocket serverSocket = new ServerSocket(8866);
        // 2. 等待客户端连接
        Socket socket = serverSocket.accept();
        // 3. 读取客户端消息
        InputStream inputStream = socket.getInputStream();

        // 4. 文件输出
        FileOutputStream fileOutputStream = new FileOutputStream(new File("received.jpg"));
        byte[] buffer = new byte[1024];
        int len;
        while ((len = inputStream.read(buffer)) != -1) {
            fileOutputStream.write(buffer, 0 , len);
        }

        // 通知客户端接收完毕
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("我已经接收完毕，你可以断开了！".getBytes());

        // 关闭资源
        outputStream.close();
        fileOutputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }

}
