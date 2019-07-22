package org.springframework.boot.springbootconcurrent.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * newSingleThreadExecutor创建一个单线程化的Executor，
 * 即只创建唯一的工作者线程来执行任务，如果这个线程异常结束，会有另一个取代它，
 * 0保证顺序执行(我觉得这点是它的特色)。
 * 单工作线程最大的特点是可保证顺序地执行各个任务，
 * 并且在任意给定的时间不会有多个线程是活动的 。
 * @description:
 * @author: TL
 * @create: 2019-07-20 15:37
 **/
public class NewSingleThreadExecutorTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    // 一个一个的完成任务 安装顺序执行
                    System.out.println(Thread.currentThread().getName()+ System.nanoTime() + "开始工作了");
                }
            };
            // 将线程放入线程池
            executorService.submit(runnable);
        }

        executorService.shutdown();
    }
}
