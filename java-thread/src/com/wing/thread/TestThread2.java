package com.wing.thread;

public class TestThread2 extends Thread {
    // url
    String url;
    // 文件名
    String name;

    public TestThread2(String url, String name) {
        this.url = url;
        this.name = name;
    }

    public static void main(String[] args) {
        // 创建线程
        TestThread2 t1 = new TestThread2("https://gimg2.baidu.com/image_search/src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fimages%2F20180514%2Fd05e15d0335c44d2bba19c7f1b4833e6.jpeg&refer=http%3A%2F%2F5b0988e595225.cdn.sohucs.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1614583980&t=c71f542a74e196a6b7bd1e428db292ff","1.jpg");
        TestThread2 t2 = new TestThread2("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimage.lelezone.com%2Fuploads%2F201705%2F48%2Fbf%2F48bf6c5af6f62b831314ef64c8446826.jpg&refer=http%3A%2F%2Fimage.lelezone.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1614584035&t=f08b5b02df27b9a661634ac24accedec", "2.jpg");
        TestThread2 t3 = new TestThread2("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=1550277694,1488917224&fm=26&gp=0.jpg", "3.jpg");

        // 启动线程
        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        System.out.println("文件" + name + "正在下载.......");
        webDownloader.downloader(url, name);
        System.out.println("文件" + name + "已经下载完成！");
    }
}
