package com.wing.upload.client;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author memory125
 */
public class FileUploadClient {
    public static void main(String[] args) throws Exception {
        int port = 8866;

        // 1. 获取服务端的地址和端口
        InetAddress serverIP = InetAddress.getByName("localhost");

        // 2. 创建socket连接
        Socket socketClient = new Socket(serverIP, port);
        OutputStream outputStream = socketClient.getOutputStream();

        // 3. 读取文件
        FileInputStream fileInputStream = new FileInputStream(new File("dog.jpg"));

        // 4. 写出文件
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fileInputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0 , len);
        }

        // 通知服务器，已经结束了
        socketClient.shutdownOutput();

        // 确定服务器接收完毕，才能断开连接
        InputStream inputStream = socketClient.getInputStream();
        // 服务器返回字符串
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] buffer2 = new byte[1024];
        int len2;
        while ((len2 = inputStream.read(buffer)) != -1) {
            byteArrayOutputStream.write(buffer, 0 , len2);
        }

        // 输出服务端返回的信息
        System.out.println(byteArrayOutputStream.toString());

        // 关闭资源
        byteArrayOutputStream.close();
        inputStream.close();
        fileInputStream.close();
        outputStream.close();
        socketClient.close();
    }
}
