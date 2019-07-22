package org.springframework.boot.springbootconcurrent.threadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description: 指定线程数量的线程池
 * @author: TL
 * @create: 2019-07-20 15:37
 **/
public class NewFixedThreadPoolTest {

    public static void main(String[] args) {
        // 创建一个固定大小为3的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName()+ System.nanoTime() + "开始工作了");
                }
            };
            // 将线程放入线程池
            executorService.submit(runnable);
        }

        executorService.shutdown();
    }
}
