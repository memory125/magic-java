package com.wing.theadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author memory125
 */
public class TestThreadPool {
    public static void main(String[] args) {
        // 1. 创建线程池
        ExecutorService service = Executors.newFixedThreadPool(5);

        // 2. 执行线程
        service.execute(new ThreadPool());
        service.execute(new ThreadPool());
        service.execute(new ThreadPool());
        service.execute(new ThreadPool());

        // 3. 关闭线程池
        service.shutdown();
    }
}
