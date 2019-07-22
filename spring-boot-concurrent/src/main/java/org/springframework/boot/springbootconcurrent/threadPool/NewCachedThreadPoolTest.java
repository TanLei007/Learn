package org.springframework.boot.springbootconcurrent.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 可缓存线程池，若线程池长度超过处理需要，则回收空线程，否则创建新线程，线程规模可无限大。
 * @description:
 * @author: TL
 * @create: 2019-07-20 15:37
 **/
public class NewCachedThreadPoolTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    // 全部执行完，创建了10个线程一起工作 无上限
                    System.out.println(Thread.currentThread().getName()+ System.nanoTime() + "开始工作了");
                }
            };
            // 将线程放入线程池
            executorService.submit(runnable);
        }

        executorService.shutdown();
    }
}
