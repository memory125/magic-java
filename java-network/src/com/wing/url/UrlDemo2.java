package com.wing.url;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author memory125
 */
public class UrlDemo2 {
    public static void main(String[] args) throws IOException {
        // 创建url对象
        URL url = new URL("https://m801.music.126.net/20210205174626/c4c305f2688e938afa049ab1275dd41b/jdyyaac/obj/w5rDlsOJwrLDjj7CmsOj/7259532000/0c81/f4a0/4a3b/cd34f7de0a673faef0d9442f2940b9ec.m4a");

        // 连接资源
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        InputStream inputStream = urlConnection.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream(new File("1.m4a"));
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(buffer)) != -1) {
            fileOutputStream.write(buffer, 0 , len);
        }

        // 关闭资源
        fileOutputStream.close();
        inputStream.close();
        // 断开连接
        urlConnection.disconnect();
    }
}
