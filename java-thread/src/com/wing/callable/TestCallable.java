package com.wing.callable;

import com.wing.thread.WebDownloader;
import java.util.concurrent.*;

/**
 * @author memory125
 */
// 线程创建方式3：实现callable接口
public class TestCallable implements Callable<Boolean> {
    // url
    String url;
    // 文件名
    String name;

    public TestCallable(String url, String name) {
        this.url = url;
        this.name = name;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建线程
        TestCallable t1 = new TestCallable("https://gimg2.baidu.com/image_search/src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fimages%2F20180514%2Fd05e15d0335c44d2bba19c7f1b4833e6.jpeg&refer=http%3A%2F%2F5b0988e595225.cdn.sohucs.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1614583980&t=c71f542a74e196a6b7bd1e428db292ff","1.jpg");
        TestCallable t2 = new TestCallable("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimage.lelezone.com%2Fuploads%2F201705%2F48%2Fbf%2F48bf6c5af6f62b831314ef64c8446826.jpg&refer=http%3A%2F%2Fimage.lelezone.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1614584035&t=f08b5b02df27b9a661634ac24accedec", "2.jpg");
        TestCallable t3 = new TestCallable("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=1550277694,1488917224&fm=26&gp=0.jpg", "3.jpg");

        // 创建执行服务
        ExecutorService ser = Executors.newFixedThreadPool(3);
        // 提交执行
        Future<Boolean> r1 = ser.submit(t1);
        Future<Boolean> r2 = ser.submit(t2);
        Future<Boolean> r3 = ser.submit(t3);

        // 获取结果
        boolean rs1 = r1.get();
        boolean rs2 = r2.get();
        boolean rs3 = r3.get();

        System.out.println("rs1结果" + rs1);
        System.out.println("rs2结果" + rs2);
        System.out.println("rs3结果" + rs3);

        // 关闭服务
        ser.shutdownNow();
    }

    @Override
    public Boolean call() throws Exception {
        WebDownloader webDownloader = new WebDownloader();
        System.out.println("文件" + name + "正在下载.......");
        webDownloader.downloader(url, name);
        System.out.println("文件" + name + "已经下载完成！");
        return true;
    }
}
