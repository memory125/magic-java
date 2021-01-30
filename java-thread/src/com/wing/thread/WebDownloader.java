package com.wing.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

// 异常快捷键： Ctrl + Alt + T
public class WebDownloader {
    // 下载方法
    public void downloader(String url, String filename) {
        try {
            // 使用commons.io.FileUtils实现下载文件
            FileUtils.copyURLToFile(new URL(url), new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
