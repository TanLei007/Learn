package org.springframework.boot.springbootconcurrent.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * newScheduleThreadPool创建一个定长的线程池，
 * 而且支持定时的以及周期性的任务执行，类似于Timer。
 * @description:
 * @author: TL
 * @create: 2019-07-20 15:37
 **/
public class NewScheduleThreadPoolTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newScheduledThreadPool(2);

        for (int i = 0; i < 10; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    // 2个2个的执行任务
                    System.out.println(Thread.currentThread().getName()+ System.nanoTime() + "开始工作了");
                }
            };
            // 将线程放入线程池
            executorService.submit(runnable);
        }

        executorService.shutdown();
    }
}
