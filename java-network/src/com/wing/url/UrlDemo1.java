package com.wing.url;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author memory125
 */
public class UrlDemo1 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://p1.music.126.net/VIJ3f563pPbfZkcVGCGF8A==/109951165695699161.jpg?imageView&quality=89");

        System.out.println("文件：" + url.getPath());
        System.out.println("主机IP：" + url.getHost());
        System.out.println("协议：" + url.getProtocol());
        System.out.println("主机端口：" + url.getPort());
        System.out.println("全路径: " + url.getFile());
        System.out.println("参数： " + url.getQuery());
    }
}
